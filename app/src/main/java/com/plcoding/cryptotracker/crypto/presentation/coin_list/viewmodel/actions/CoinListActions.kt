package com.plcoding.cryptotracker.crypto.presentation.coin_list.viewmodel.actions

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListActions {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListActions
}