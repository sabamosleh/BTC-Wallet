package com.interview.btcwallet.modules.bitcoin

import org.springframework.data.jpa.repository.JpaRepository

interface WalletRepository : JpaRepository<Wallet, Long>