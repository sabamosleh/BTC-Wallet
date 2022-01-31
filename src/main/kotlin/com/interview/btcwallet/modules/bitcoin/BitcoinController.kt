package com.interview.btcwallet.modules.bitcoin

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/api/bitcoins")
class BitcoinController(private val bitcoinService: BitcoinService) {

    @GetMapping
    fun getBitcoins(): List<BitcoinView> {
        return bitcoinService.getBitcoins()
    }

    @PostMapping
    fun createBitcoin(@RequestBody bitcoinView: BitcoinView): ResponseEntity<BitcoinView> {
        return ResponseEntity.ok(bitcoinService.createBitcoin(bitcoinView))
    }
}