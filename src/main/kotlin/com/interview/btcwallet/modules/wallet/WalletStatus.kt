package com.interview.btcwallet.modules.wallet

import java.math.BigDecimal
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class WalletStatus(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var amount: BigDecimal? = null,
    var dateTime: Date? = null
)
fun WalletStatus.toWalletView() = WalletView(
    amount = amount,
    dateTime = dateTime
)