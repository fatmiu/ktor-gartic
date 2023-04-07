package com.miumiu.data.models

import com.miumiu.other.Constants.TYPE_GAME_STATE

data class GameState(
    val drawingPlayer: String,
    val word: String
) : BaseModel(TYPE_GAME_STATE)
