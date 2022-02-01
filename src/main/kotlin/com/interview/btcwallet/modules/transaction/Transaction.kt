package com.interview.btcwallet.modules.transaction

import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@Entity
class Transaction(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val datetime: Date,
    @Column(nullable = false)
    val amount: BigDecimal,
    val createdAt: Date? = Date(),
    val updatedAt: Date? = Date()
)

fun Transaction.toTransactionView() = TransactionView(
    datetime = datetime,
    amount = amount
)