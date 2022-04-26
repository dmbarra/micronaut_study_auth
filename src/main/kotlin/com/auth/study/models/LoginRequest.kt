package com.auth.study.models

data class LoginRequest(
    val email: String,
    val password: String
) {
}