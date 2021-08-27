package com.nikodem.instagramclone.ui.home

import com.nikodem.instagramclone.utils.BaseViewModel

class HomeFragmentViewModel :
    BaseViewModel<HomeFragmentViewState>(initialState = HomeFragmentViewState()) {
}

data class HomeFragmentViewState(override val isLoading: Boolean = false) :
    com.nikodem.instagramclone.utils.ViewState