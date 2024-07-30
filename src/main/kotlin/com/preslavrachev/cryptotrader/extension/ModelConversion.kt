package com.jamesbrookssoft.cryptotrader.extension

import com.jamesbrookssoft.cryptotrader.trading.instrument.candlestick.Candlestick
import remote.poloniex.model.ChartDataEntry

fun ChartDataEntry.toCandlestick(): Candlestick {
    return Candlestick(
            open = this.open,
            close = this.close,
            high = this.high,
            low = this.low
    )
}