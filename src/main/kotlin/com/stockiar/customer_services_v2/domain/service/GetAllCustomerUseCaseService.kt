package com.stockiar.customer_services_v2.domain.service

import com.stockiar.customer_services_v2.domain.model.Customer
import com.stockiar.customer_services_v2.domain.port.`in`.GetAllCustomerUseCase
import com.stockiar.customer_services_v2.domain.port.out.CustomerRepositoryPort

class GetAllCustomerUseCaseService(
    var customerRepositoryPort: CustomerRepositoryPort
): GetAllCustomerUseCase {

    override fun getAllCustomer(): List<Customer> = customerRepositoryPort.getAllCustomers()

}