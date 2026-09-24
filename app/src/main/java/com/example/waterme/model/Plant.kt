

package com.example.waterme.model

import android.os.Parcelable
import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

/**
 * Data class for representing the information required for each plant card.
 * */
@Parcelize
data class Plant(
    @StringRes val name: Int,
    @StringRes val type: Int,
    @StringRes val description: Int,
    @StringRes val schedule: Int
): Parcelable
