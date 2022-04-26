package com.auth.study.models

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus

data class LoginResponse(
    val userId: String,
    val displayName: String,
    val accessToken: String
) {
    fun asHttpResponse(): HttpResponse<Any> {
        if (this.userId != "invalid") {
            return HttpResponse.status<Any>(HttpStatus.OK).body(this)
        }
        return HttpResponse.status<Any>(HttpStatus.BAD_REQUEST).body( "")
    }
}