package com.interview.btcwallet.modules.transaction

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Transaction(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val datetime: LocalDateTime,
    @Column(nullable = false)
    val amount: BigDecimal,
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = LocalDateTime.now()
)

fun Transaction.toTransactionView() = TransactionView(
    datetime = datetime,
    amount = amount
)