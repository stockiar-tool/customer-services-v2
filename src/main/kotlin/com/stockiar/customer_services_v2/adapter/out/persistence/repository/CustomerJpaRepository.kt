package com.stockiar.customer_services_v2.adapter.out.persistence.repository

import com.stockiar.customer_services_v2.adapter.out.persistence.entity.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerJpaRepository: JpaRepository<CustomerEntity, Long> {
}