package com.interview.btcwallet.modules.wallet

import com.interview.btcwallet.modules.transaction.TransactionView
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Service

@Service
class WalletStatusService(private val walletRepository: WalletRepository) {
    companion object {
        private val logger = LogManager.getLogger()
    }

    fun updateWalletStatus(transaction: TransactionView) {
        //truncate transaction by hour
        //check if wallet has that date
        //yes: wallet amount = trancation amount + wallet amount
        //no : do we have preivoius hour in wallet?
        //yes: wallet balance = prevoiuse balance + transaction amount
        //no : wallet balance = transaction amount

    }
}