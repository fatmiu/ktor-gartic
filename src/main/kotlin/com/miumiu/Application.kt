package com.miumiu

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.miumiu.plugins.*

val server = DrawingServer()
fun main() {
    embeddedServer(Netty, port = 8001, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureSockets()
    configureMonitoring()
    configureRouting()
    configureSessions()
}
