package com.miumiu

import com.google.gson.Gson
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.miumiu.plugins.*

val server = DrawingServer()
val gson = Gson()
fun main() {
    embeddedServer(Netty, port = System.getenv("PORT").toInt(), module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureSockets()
    configureMonitoring()
    configureRouting()
    configureSessions()
}
