package com.interview.btcwallet.modules.bitcoin

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class BitcoinEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(nullable = false)
    val datetime: LocalDateTime,
    val amount: BigDecimal

)