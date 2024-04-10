package com.example.specialistsru.retrofit

import Colleague

data class Colleagues(
    val users: List<Colleague>,
    val total: Int,
    val skip: Int,
    val limit: Int
)
