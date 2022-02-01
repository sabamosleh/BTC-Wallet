package com.interview.btcwallet.modules.wallet

import org.springframework.data.jpa.repository.JpaRepository

interface WalletRepository : JpaRepository<WalletStatus, Long>