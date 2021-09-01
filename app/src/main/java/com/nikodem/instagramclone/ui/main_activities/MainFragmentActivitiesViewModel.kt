package com.nikodem.instagramclone.ui.main_activities

import com.nikodem.instagramclone.utils.BaseViewModel
import com.nikodem.instagramclone.utils.ViewState

class MainFragmentActivitiesViewModel :
    BaseViewModel<MainFragmentActivitiesViewState>(initialState = MainFragmentActivitiesViewState()) {
}

data class MainFragmentActivitiesViewState(override val isLoading: Boolean = false) : ViewState