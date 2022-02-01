package com.interview.btcwallet.modules.wallet

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*
import javax.transaction.Transactional

@Repository
@Transactional
interface WalletRepository : JpaRepository<WalletStatus, Long> {

    fun findByDateTime(dateTime: Date): WalletStatus?
    fun save(walletStatus: WalletStatus?)
}