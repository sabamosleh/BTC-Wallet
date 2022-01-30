package com.interview.btcwallet.modules.bitcoin

import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class BitcoinService(private val bitcoinRepository: BitcoinRepository) {

    fun getBitcoins(): List<BitcoinView> {
        return bitcoinRepository.findAll().stream().map(BitcoinEntity::toBitcoinView).collect(Collectors.toList())
    }
}