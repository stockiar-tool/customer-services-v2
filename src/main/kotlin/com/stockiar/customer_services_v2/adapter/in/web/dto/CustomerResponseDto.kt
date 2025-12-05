package com.stockiar.customer_services_v2.adapter.`in`.web.dto

import tools.jackson.databind.PropertyNamingStrategies
import tools.jackson.databind.annotation.JsonNaming
import java.time.LocalDateTime

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class CustomerResponseDto constructor(
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val address: String,
    val documentNumber: String,
    val documentType: String,
    val active: Boolean,
    val createdAt: LocalDateTime,
    val updateAt: LocalDateTime
) {
}