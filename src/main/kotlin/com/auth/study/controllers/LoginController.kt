package com.auth.study.controllers

import com.auth.study.models.LoginRequest
import com.auth.study.services.LoginService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import jakarta.inject.Inject

@Controller
class LoginController {

    @Inject
    lateinit var loginService: LoginService

    @Post(uri = "/login")
    @Produces(MediaType.APPLICATION_JSON)
    fun login(loginRequestPayload: LoginRequest): HttpResponse<Any> {
        return loginService.login(loginRequestPayload).asHttpResponse()
    }
}