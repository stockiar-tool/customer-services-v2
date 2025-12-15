package com.stockiar.customer_services_v2.domain.port.out

import com.stockiar.customer_services_v2.domain.model.Customer

interface CustomerRepositoryPort {
    fun getAllCustomers(): List<Customer>
}