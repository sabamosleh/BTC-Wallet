package com.interview.btcwallet.modules.bitcoin

import org.springframework.stereotype.Service

@Service
class TransactionService(private val transactionRepository: TransactionRepository) {

    fun createTransaction(transactionView: TransactionView): TransactionView {
        return transactionRepository.save(transactionView.toTransaction()).toTransactionView()
    }

}