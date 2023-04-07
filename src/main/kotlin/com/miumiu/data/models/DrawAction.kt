package com.miumiu.data.models

import com.miumiu.other.Constants.TYPE_DRAW_ACTION

data class DrawAction(
    val action: String,
) : BaseModel(TYPE_DRAW_ACTION) {

    companion object {
        const val ACTION_UNDO = "ACTION_UNDO"
    }
}
