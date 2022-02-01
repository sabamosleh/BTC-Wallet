package com.interview.btcwallet.modules.transaction

import com.interview.btcwallet.modules.wallet.WalletStatusService
import org.apache.commons.lang3.time.DateUtils
import org.springframework.stereotype.Service

@Service
class TransactionService(
    private val transactionRepository: TransactionRepository,
    private val walletStatusService: WalletStatusService
) {
    fun createTransaction(transactionView: TransactionView): TransactionView {
//        walletStatusService.updateWalletBalance(transactionView)
        return transactionRepository.save(transactionView.toTransaction()).toTransactionView()
    }

    fun truncateTransactionDateBasedHour(transaction: TransactionView) {
        DateUtils.ceiling(transaction.datetime, 2)
    }
}