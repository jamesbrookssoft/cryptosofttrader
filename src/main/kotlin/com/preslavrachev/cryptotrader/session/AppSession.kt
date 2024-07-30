package com.jamesbrookssoft.cryptotrader.session

import com.jamesbrookssoft.cryptotrader.mvc.model.Order
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope("singleton")
class AppSession {
    val orders = ArrayList<Order>()
}
