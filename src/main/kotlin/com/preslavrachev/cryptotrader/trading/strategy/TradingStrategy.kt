package com.jamesbrookssoft.cryptotrader.trading.strategy

import com.jamesbrookssoft.cryptotrader.trading.instrument.timeline.TimelineNode

interface TradingStrategy<in T> {
    fun decide(input: List<TimelineNode<T>>): TradingStrategyDecisionEnum
}
