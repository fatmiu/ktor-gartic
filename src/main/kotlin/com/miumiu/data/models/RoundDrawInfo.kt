package com.miumiu.data.models

import com.miumiu.other.Constants.TYPE_CUR_ROUND_DRAW_INFO

data class RoundDrawInfo(
    val data: List<String>
) : BaseModel(TYPE_CUR_ROUND_DRAW_INFO)
