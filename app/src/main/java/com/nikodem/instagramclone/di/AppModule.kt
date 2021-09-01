package com.nikodem.instagramclone.di

import com.nikodem.instagramclone.ui.home.HomeFragmentViewModel
import com.nikodem.instagramclone.ui.main.MainFragmentViewModel
import com.nikodem.instagramclone.ui.main_activities.MainFragmentActivitiesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {
        HomeFragmentViewModel()
    }

    viewModel {
        MainFragmentViewModel()
    }

    viewModel{
        MainFragmentActivitiesViewModel()
    }
}