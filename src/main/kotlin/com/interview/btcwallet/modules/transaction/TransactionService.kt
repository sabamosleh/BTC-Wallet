package com.interview.btcwallet.modules.transaction

import com.interview.btcwallet.modules.wallet.WalletStatusService
import org.springframework.stereotype.Service

@Service
class TransactionService(
    private val transactionRepository: TransactionRepository,
    private val walletStatusService: WalletStatusService
) {

    fun createTransaction(transactionView: TransactionView): TransactionView {
        val transaction = transactionRepository.save(transactionView.toTransaction()).toTransactionView()
        walletStatusService.updateWalletStatus(transactionView)
        return transaction
    }
}