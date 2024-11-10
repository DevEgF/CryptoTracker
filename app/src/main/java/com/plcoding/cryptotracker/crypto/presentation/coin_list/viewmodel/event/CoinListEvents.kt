package com.plcoding.cryptotracker.crypto.presentation.coin_list.viewmodel.event

import com.plcoding.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvents {
    data class Error(val error: NetworkError) : CoinListEvents
}