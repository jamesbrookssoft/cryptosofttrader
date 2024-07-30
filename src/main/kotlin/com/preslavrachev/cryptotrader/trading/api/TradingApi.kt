package com.jamesbrookssoft.cryptotrader.trading.api

import com.jamesbrookssoft.cryptotrader.mvc.model.Order

interface TradingApi {
    fun placeOrder(order: Order): Boolean
}
