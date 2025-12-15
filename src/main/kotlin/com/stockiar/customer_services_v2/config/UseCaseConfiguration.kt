package com.stockiar.customer_services_v2.config

import com.stockiar.customer_services_v2.domain.port.out.CustomerRepositoryPort
import com.stockiar.customer_services_v2.domain.service.GetAllCustomerUseCaseService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseConfiguration(
    var customerRepositoryPort: CustomerRepositoryPort
) {


    @Bean
    fun getAllCustomerUseCase() = GetAllCustomerUseCaseService(customerRepositoryPort)

}