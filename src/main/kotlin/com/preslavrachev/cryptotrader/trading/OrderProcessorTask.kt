package com.jamesbrookssoft.cryptotrader.trading

import com.jamesbrookssoft.cryptotrader.mvc.model.Order
import com.jamesbrookssoft.cryptotrader.trading.api.TradingApi
import java.util.concurrent.Callable
import java.util.logging.Logger

class OrderProcessingException(val order: Order) : RuntimeException()

class OrderProcessorTask(val order: Order, val tradingApi: TradingApi) : Callable<Order> {

    companion object {
        val LOGGER = Logger.getLogger("OrderProcessorTask")
    }

    override fun call(): Order {
        return order
    }
}
