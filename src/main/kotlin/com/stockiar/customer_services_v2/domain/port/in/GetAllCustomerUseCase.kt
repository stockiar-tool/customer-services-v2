package com.stockiar.customer_services_v2.domain.port.`in`

import com.stockiar.customer_services_v2.domain.model.Customer

interface GetAllCustomerUseCase {
    fun getAllCustomer(): List<Customer>
}