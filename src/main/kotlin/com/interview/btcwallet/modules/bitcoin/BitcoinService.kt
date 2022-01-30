package com.interview.btcwallet.modules.bitcoin

import org.springframework.stereotype.Service

@Service
class BitcoinService (private val bitcoinRepository: BitcoinRepository){

    fun getBitcoins(): List<BitcoinEntity>{
       return bitcoinRepository.findAll();
    }
}