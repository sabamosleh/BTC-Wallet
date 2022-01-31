package com.interview.btcwallet.modules.bitcoin

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
@Transactional
interface TransactionRepository : JpaRepository<Transaction, Long>