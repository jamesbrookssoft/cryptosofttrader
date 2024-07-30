package com.jamesbrookssoft.cryptotrader.persistence.repository

import com.jamesbrookssoft.cryptotrader.mvc.model.TradeRecord
import org.springframework.data.mongodb.repository.MongoRepository

interface TradeRecordRepository: MongoRepository<TradeRecord, String>
