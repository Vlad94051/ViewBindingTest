package ru.tms.viewbindingtest.navigation

import android.os.Parcelable
import androidx.navigation.NavArgs
import kotlinx.parcelize.Parcelize

@Parcelize
data class Info(
    val name: String,
    val age: Int
) : Parcelable
