package com.jamesbrookssoft.cryptotrader.mvc.model

import org.springframework.data.annotation.Id
import java.time.LocalDateTime

data class TradeRecord(
        @Id var id: String? = null,
        val amount: Float, /* always in relation to the quote currency */
        val quoteCurrency: String, /* e.g. BTC in BTC/USDT */
        val baseCurrency: String, /* e.g. USDT in BTC/USDT */
        val baseCurrencyPrice: Float,
        val executionDateTime: LocalDateTime = LocalDateTime.now(),
        val orderType: OrderTypeEnum,
        val orderScope: OrderScopeEnum = OrderScopeEnum.DEMO
)
