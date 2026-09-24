

package com.example.waterme.data

import androidx.annotation.StringRes
import java.util.concurrent.TimeUnit

/**
 * Data class for representing the information required for reminder dialogs items.
 * */
data class Reminder(
    @StringRes val durationRes: Int,
    val duration: Long,
    val unit: TimeUnit,
    val plantName: String
)
