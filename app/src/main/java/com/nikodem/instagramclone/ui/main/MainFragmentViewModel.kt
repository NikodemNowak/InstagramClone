package com.nikodem.instagramclone.ui.main

import com.nikodem.instagramclone.utils.BaseViewModel
import com.nikodem.instagramclone.utils.ViewState

class MainFragmentViewModel :
    BaseViewModel<MainFragmentViewState>(initialState = MainFragmentViewState()) {
}

data class MainFragmentViewState(override val isLoading: Boolean = false) : ViewState