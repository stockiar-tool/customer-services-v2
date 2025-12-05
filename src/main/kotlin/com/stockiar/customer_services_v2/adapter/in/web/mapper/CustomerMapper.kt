package com.stockiar.customer_services_v2.adapter.`in`.web.mapper

import com.stockiar.customer_services_v2.adapter.`in`.web.dto.CustomerDto
import com.stockiar.customer_services_v2.adapter.`in`.web.dto.CustomerResponseDto
import com.stockiar.customer_services_v2.domain.model.Customer
import java.time.LocalDateTime

object CustomerMapper {
    fun toDto(customer: Customer) = with(customer){
        CustomerResponseDto(
            id = id ?: throw IllegalStateException("Id cant be null"),
            name = name,
            email = email,
            phone = phone,
            address = address,
            documentNumber = documentNumber,
            documentType = documentType,
            active = active ?: true,
            createdAt = createdAt ?: LocalDateTime.now(),
            updateAt = updateAt ?: LocalDateTime.now(),
        )
    }

    fun toDtoList(customerList: List<Customer>) = customerList.map { toDto(it) }

    fun toEntity(customerDto: CustomerDto) = with(customerDto) {
        Customer(
            id = null,
            name = name,
            email = email,
            phone = phone,
            address = address,
            documentNumber = documentNumber,
            documentType = documentType,
            active = null,
            createdAt = null,
            updateAt = null,
        )
    }

}