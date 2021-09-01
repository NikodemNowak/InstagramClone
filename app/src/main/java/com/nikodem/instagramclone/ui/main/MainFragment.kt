package com.nikodem.instagramclone.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nikodem.instagramclone.R
import com.nikodem.instagramclone.databinding.FragmentMainBinding
import com.nikodem.instagramclone.ui.main_activities.MainFragmentActivities
import com.nikodem.instagramclone.utils.BaseFragment

class MainFragment :
    BaseFragment<MainFragmentViewState, MainFragmentViewModel, FragmentMainBinding>(
        contentLayout = R.layout.fragment_main,
        viewModelKClass = MainFragmentViewModel::class
    ) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            val pagerAdapter = ScreenSlidePagerAdapter(this@MainFragment)
            viewPager.adapter = pagerAdapter
        }
    }

    private inner class ScreenSlidePagerAdapter(fa: Fragment) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = NUMBER_OF_PAGES

        override fun createFragment(position: Int): Fragment = when (position) {
            0 -> MainFragmentActivities()
            else -> {
                throw IllegalArgumentException()
            }
        }
    }

    companion object {
        const val NUMBER_OF_PAGES = 5
    }
}