package com.plcoding.cryptotracker.core.presentation.util

import android.content.Context
import com.plcoding.cryptotracker.R
import com.plcoding.cryptotracker.core.domain.util.NetworkError

fun NetworkError.toStringRes(context: Context): String {
    val resId = when (this) {
        NetworkError.REQUEST_TIMEOUT -> R.string.error_request_timeout
        NetworkError.TOO_MANY_REQUESTS -> R.string.error_to_many_requests
        NetworkError.NO_INTERNET_CONNECTION -> R.string.error_no_internet_connection
        NetworkError.SERVER_ERROR -> R.string.error_somenthing_went_wrong
        NetworkError.SERIALIZATION_ERROR -> R.string.error_serialization
        NetworkError.UNKNOWN_ERROR -> R.string.unknown_error
    }

    return context.getString(resId)
}