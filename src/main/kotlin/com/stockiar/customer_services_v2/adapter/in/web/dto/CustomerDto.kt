package com.stockiar.customer_services_v2.adapter.`in`.web.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import tools.jackson.databind.PropertyNamingStrategies
import tools.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class CustomerDto constructor(

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name must not exceed 100 characters")
    val name: String,

    @Email(message = "Invalid email format")
    @Size(max = 150, message = "Email must not exceed 150 characters")
    val email: String,

    @Size(max = 20, message = "Phone must not exceed 20 characters")
    val phone: String,

    @Size(max = 255, message = "Address must not exceed 255 characters")
    val address: String,

    @Size(max = 50, message = "Document number must not exceed 50 characters")
    val documentNumber: String,

    @Size(max = 20, message = "Document type must not exceed 20 characters")
    val documentType: String
){
}