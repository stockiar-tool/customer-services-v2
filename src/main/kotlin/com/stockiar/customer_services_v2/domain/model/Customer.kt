package com.stockiar.customer_services_v2.domain.model

import java.time.LocalDateTime

data class Customer constructor(
    val id: Long?,
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val documentNumber: String,
    val documentType: String,
    val active: Boolean?,
    val createdAt: LocalDateTime?,
    val updateAt: LocalDateTime?
){}