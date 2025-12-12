package com.vlad.backenddemo

import jakarta.persistence.*

@Entity
data class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var name: String = "",
    var price: Double = 0.0
)
