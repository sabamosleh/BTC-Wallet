package com.interview.btcwallet.modules.bitcoin

import java.math.BigDecimal

class WalletService(private val walletRepository: WalletRepository) {

    fun updateBalance(transactionAmount: BigDecimal, walletId: Long) {
        val wallet = walletRepository.findById(walletId).get()
        val walletBalance = wallet.balance?.add(transactionAmount)
        wallet.balance = walletBalance
    }
}