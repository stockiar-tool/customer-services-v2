package com.stockiar.customer_services_v2.adapter.out.persistence.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "customer")
data class CustomerEntity constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "name", nullable = false, length = 100)
    val name: String,

    @Column(name = "email", unique = true, length = 150)
    val email: String,

    @Column(name = "phone", length = 20)
    val phone: String,

    @Column(name = "address")
    val address: String,

    @Column(name = "document_number", unique = true, length = 50)
    val documentNumber: String,

    @Column(name = "document_type", length = 20)
    val documentType: String,

    @Column(name = "active", nullable = false)
    val active: Boolean,

    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime,

    @Column(name = "updated_at")
    var updateAt: LocalDateTime
) {

    @PrePersist
    fun onPrePersist(){
        this.createdAt = LocalDateTime.now()
        this.updateAt = LocalDateTime.now()
    }

    @PreUpdate
    fun onPreUpdate(){
        this.updateAt = LocalDateTime.now()
    }

}