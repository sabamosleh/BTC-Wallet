package com.interview.btcwallet.modules.bitcoin

import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDateTime


class TransactionView(
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    val datetime: LocalDateTime,
    val amount: BigDecimal,
)

fun TransactionView.toTransaction() = Transaction(
    datetime = datetime,
    amount = amount
)