package com.interview.btcwallet.modules.bitcoin

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class BitcoinEntity(
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

fun BitcoinEntity.toBitcoinView() = BitcoinView(
    datetime = datetime,
    amount = amount
)