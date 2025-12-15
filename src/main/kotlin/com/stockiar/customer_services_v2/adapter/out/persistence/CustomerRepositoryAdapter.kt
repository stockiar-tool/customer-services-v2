package com.stockiar.customer_services_v2.adapter.out.persistence

import com.stockiar.customer_services_v2.adapter.out.persistence.entity.CustomerEntity
import com.stockiar.customer_services_v2.adapter.out.persistence.repository.CustomerJpaRepository
import com.stockiar.customer_services_v2.domain.model.Customer
import com.stockiar.customer_services_v2.domain.port.out.CustomerRepositoryPort
import org.springframework.stereotype.Component

@Component
class CustomerRepositoryAdapter(
    var customerJpaRepository: CustomerJpaRepository
): CustomerRepositoryPort {

    override fun getAllCustomers(): List<Customer> {
        return customerJpaRepository.findAll()
            .map { toDomain(it)  }
    }


    private fun toDomain(customer: CustomerEntity): Customer{
        return Customer(
            customer.id,
            customer.name,
            customer.email,
            customer.phone,
            customer.address,
            customer.documentNumber,
            customer.documentType,
            customer.active,
            customer.createdAt,
            customer.updateAt
        )
    }

}