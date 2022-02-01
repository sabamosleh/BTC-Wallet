package com.interview.btcwallet.modules.transaction

import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.util.*


class TransactionView(
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    val datetime: Date,
    val amount: BigDecimal,
)

fun TransactionView.toTransaction() = Transaction(
    datetime = datetime,
    amount = amount
)