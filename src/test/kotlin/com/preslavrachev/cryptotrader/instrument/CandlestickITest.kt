package com.jamesbrookssoft.cryptotrader.instrument

import com.jamesbrookssoft.cryptotrader.config.MainAppConfig
import com.jamesbrookssoft.cryptotrader.extension.minusSecondPeriods
import com.jamesbrookssoft.cryptotrader.extension.toCandlestick
import com.jamesbrookssoft.cryptotrader.extension.toUnixTimestamp
import com.jamesbrookssoft.cryptotrader.trading.instrument.candlestick.CandlestickPatternEnum
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import remote.poloniex.service.PoloniexApiService
import remote.poloniex.service.PoloniexApiService.CurrencyPairEnum.*
import java.time.LocalDateTime
import javax.inject.Inject


@RunWith(SpringRunner::class)
@ContextConfiguration(classes = arrayOf(MainAppConfig::class))
class CandlestickITest {

    @Inject
    lateinit var poloniexApiService: PoloniexApiService

    @Ignore("Use only manually for now")
    @Test()
    fun testCandlestickPatterns(): Unit {
        val end = LocalDateTime.now().toUnixTimestamp()
        val start = end.minusSecondPeriods(30, 300)
        val chartData = poloniexApiService.getChartData(currencyPair = USDT_BTC.label, start = start, end = end)
        val leftSide = chartData.dropLast(1)
        val rightSide = chartData.drop(1)
        val data = leftSide.zip(rightSide)
                .map { (prev, current) -> Pair(prev.toCandlestick(), current.toCandlestick()) }
                .map { (prev, current) -> CandlestickPatternEnum.evaluate(prev, current) }
        println("DATA: $data")
    }

}
