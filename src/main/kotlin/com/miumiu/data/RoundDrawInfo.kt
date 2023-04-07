package com.miumiu.data

import com.miumiu.data.models.BaseModel
import com.miumiu.other.Constants.TYPE_CUR_ROUND_DRAW_INFO

data class RoundDrawInfo(
    val data: List<String>
) : BaseModel(TYPE_CUR_ROUND_DRAW_INFO)
