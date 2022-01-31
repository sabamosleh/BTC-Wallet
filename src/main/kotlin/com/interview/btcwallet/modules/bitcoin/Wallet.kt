package com.interview.btcwallet.modules.bitcoin

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Wallet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var balance: BigDecimal? = null,
    @OneToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY, mappedBy = "transaction")
    var transactions: List<Transaction>
)