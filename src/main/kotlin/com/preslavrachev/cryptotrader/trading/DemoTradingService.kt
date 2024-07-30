package com.jamesbrookssoft.cryptotrader.trading

import com.jamesbrookssoft.cryptotrader.mvc.model.Order
import com.jamesbrookssoft.cryptotrader.trading.api.TradingApi
import org.springframework.stereotype.Service

@Service
class DemoTradingService: TradingApi {
    override fun placeOrder(order: Order): Boolean {
        TODO("not implemented")
    }
}