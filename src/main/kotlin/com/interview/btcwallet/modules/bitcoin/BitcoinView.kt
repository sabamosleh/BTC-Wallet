package com.interview.btcwallet.modules.bitcoin

import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDateTime


class BitcoinView(
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    val datetime: LocalDateTime,
    val amount: BigDecimal,
)

fun BitcoinView.toBitcoinEntity() = BitcoinEntity(
    datetime = datetime,
    amount = amount
)