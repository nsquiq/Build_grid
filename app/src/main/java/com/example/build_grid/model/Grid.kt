package com.example.build_grid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Grid(
    @StringRes val name: Int,
    val counting: Int,
    @DrawableRes val imageRes: Int )