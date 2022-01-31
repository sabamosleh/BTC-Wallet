package com.interview.btcwallet.modules.bitcoin

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/transactions")
class TransactionController(private val transactionService: TransactionService) {


    @PostMapping
    fun createBitcoin(@RequestBody transactionView: TransactionView): ResponseEntity<TransactionView> {
        return ResponseEntity.ok(transactionService.createTransaction(transactionView))
    }
}