package com.stockiar.customer_services_v2.adapter.`in`.web

import com.stockiar.customer_services_v2.adapter.`in`.web.dto.CustomerResponseDto
import com.stockiar.customer_services_v2.adapter.`in`.web.mapper.CustomerMapper
import com.stockiar.customer_services_v2.domain.model.Customer
import com.stockiar.customer_services_v2.domain.port.`in`.GetAllCustomerUseCase
import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/customers")
@CrossOrigin("*")
@Slf4j
class CustomerController(
    var logger: Logger = LoggerFactory.getLogger(CustomerController::class.java),
    var getAllCustomerUseCase: GetAllCustomerUseCase
) {

    @GetMapping
    fun getAllCustomer(): List<CustomerResponseDto>{
        logger.info("Request to get all customers")
        return getAllCustomerUseCase.getAllCustomer()
            .map { CustomerMapper.toDto(it) }

    }

}