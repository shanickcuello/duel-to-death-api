package com.example.routing

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.createUser() {
    get("/user") {
        call.respond(HttpStatusCode.OK)
    }
}
