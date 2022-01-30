package com.interview.btcwallet.modules.bitcoin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/bitcoins")
class BitcoinController(private val bitcoinService: BitcoinService) {

    @GetMapping
    fun getBitcoins(): List<BitcoinView> {
        return bitcoinService.getBitcoins()
    }
}