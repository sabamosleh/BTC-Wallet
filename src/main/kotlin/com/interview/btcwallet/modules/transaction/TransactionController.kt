package com.interview.btcwallet.modules.transaction

import org.apache.logging.log4j.LogManager
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/transactions")
class TransactionController(private val transactionService: TransactionService) {

    companion object {
        private val logger = LogManager.getLogger()
    }

    @PostMapping
    fun createBitcoin(@RequestBody transactionView: TransactionView): ResponseEntity<TransactionView> {

        logger.info("adding transaction ... {}", transactionView)
        return ResponseEntity.ok(transactionService.createTransaction(transactionView))
    }
}