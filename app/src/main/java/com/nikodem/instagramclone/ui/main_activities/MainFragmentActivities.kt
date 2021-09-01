package com.nikodem.instagramclone.ui.main_activities

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.nikodem.instagramclone.R
import com.nikodem.instagramclone.databinding.FragmentMainActivitiesBinding
import com.nikodem.instagramclone.ui.home.HomeFragment
import com.nikodem.instagramclone.utils.BaseFragment

class MainFragmentActivities :
    BaseFragment<MainFragmentActivitiesViewState, MainFragmentActivitiesViewModel, FragmentMainActivitiesBinding>(
        contentLayout = R.layout.fragment_main_activities, viewModelKClass = MainFragmentActivitiesViewModel::class
    ) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            val pagerAdapter = ScreenSlidePagerAdapter(this@MainFragmentActivities)
            viewPagerActivities.adapter = pagerAdapter
            viewPagerActivities.isUserInputEnabled = false

            TabLayoutMediator(tabLayout, viewPagerActivities) { tab, position ->

            }.attach()

            with(tabLayout) {
                getTabAt(0)?.setIcon(R.drawable.ic_home)
                getTabAt(1)?.setIcon(R.drawable.ic_search)
                getTabAt(2)?.setIcon(R.drawable.ic_add_box)
                getTabAt(3)?.setIcon(R.drawable.ic_shopping_bag)
                getTabAt(4)?.setIcon(R.drawable.ic_avatar)
            }

        }
    }

    private inner class ScreenSlidePagerAdapter(fa: Fragment) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = NUMBER_OF_PAGES

        override fun createFragment(position: Int): Fragment = when (position) {
            0 -> HomeFragment()
            else -> {
                throw IllegalArgumentException()
            }
        }
    }

    companion object {
        const val NUMBER_OF_PAGES = 5
    }
}