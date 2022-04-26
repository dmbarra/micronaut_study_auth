package com.auth.study.services

import com.auth.study.models.LoginRequest
import com.auth.study.models.LoginResponse
import jakarta.inject.Singleton

@Singleton
class LoginService {

    fun login(loginRequestPayload: LoginRequest): LoginResponse {
        if (loginRequestPayload.email.equals("email@email.com")) {
            return LoginResponse("dmbarra", "Daniel", "accessToken")
        }
        return LoginResponse("invalid", "", "")
    }
}