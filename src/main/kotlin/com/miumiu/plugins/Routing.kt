package com.miumiu.plugins

import com.miumiu.routes.createRoomRoute
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    install(Routing) {
        createRoomRoute()
    }
}
