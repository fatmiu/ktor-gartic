package com.miumiu.plugins

import com.miumiu.session.DrawingSession
import io.ktor.server.application.*
import io.ktor.server.application.ApplicationCallPipeline.ApplicationPhase.Plugins
import io.ktor.server.sessions.*
import io.ktor.util.*

fun Application.configureSessions() {
    install(Sessions) {
        cookie<DrawingSession>("SESSION")
    }
    intercept(Plugins) {
        if (call.sessions.get<DrawingSession>() == null) {
            val clientId = call.parameters["client_id"] ?: ""
            call.sessions.set(DrawingSession(clientId, generateNonce()))
        }
    }
}