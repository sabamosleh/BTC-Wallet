package com.interview.btcwallet.modules.wallet

import com.interview.btcwallet.modules.transaction.TransactionView
import org.apache.commons.lang3.time.DateUtils
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors

@Service
class WalletStatusService(private val walletRepository: WalletRepository) {

    fun updateWalletStatus(transaction: TransactionView) {
        val transactionDate = DateUtils.ceiling(transaction.datetime, 11)
        var walletStatus = walletRepository.findByDateTime(transactionDate)
        val balance = transaction.amount
        if (Objects.nonNull(walletStatus))
            walletStatus?.amount = balance.add(walletStatus?.amount)
        else {
            walletStatus = WalletStatus(null, balance, transactionDate)
            walletStatus.amount = transaction.amount
        }
        walletRepository.save(walletStatus)
    }

    fun getWalletStatus(startDate: Date, endDate: Date): List<WalletView>? {
        val walletStatuses = walletRepository.findByDateTimeAfterAndDateTimeBefore(startDate, endDate)
        return walletStatuses?.stream()?.map { it -> it.toWalletView() }?.collect(Collectors.toList())
    }
}