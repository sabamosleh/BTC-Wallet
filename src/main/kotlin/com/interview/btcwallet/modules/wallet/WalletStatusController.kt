package com.interview.btcwallet.modules.wallet

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/v1/api/wallet-status")
class WalletStatusController(private val walletStatusService: WalletStatusService) {

    @GetMapping
    fun getWalletStatus(@RequestBody walletStatus: GetWalletStatusView): ResponseEntity<List<WalletView>> {
        return ResponseEntity.ok(walletStatusService.getWalletStatus(walletStatus.startDate, walletStatus.endDate))
    }

    data class GetWalletStatusView(
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        val startDate: Date,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        val endDate: Date
    )
}