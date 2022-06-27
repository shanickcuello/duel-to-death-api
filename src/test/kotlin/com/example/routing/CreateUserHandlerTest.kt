package com.example.routing
import com.example.plugins.configureRouting
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Create user should")

class CreateUserHandlerTest{

    @Test
    fun exist() = testApplication {
        application {
            configureRouting()
        }
        client.get("/user").apply {
            assertEquals(HttpStatusCode.OK, status)
        }
    }
}