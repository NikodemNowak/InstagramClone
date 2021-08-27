package com.nikodem.instagramclone.ui.home

import android.os.Bundle
import android.view.View
import com.nikodem.instagramclone.R
import com.nikodem.instagramclone.databinding.FragmentHomeBinding
import com.nikodem.instagramclone.utils.BaseFragment

class HomeFragment :
    BaseFragment<HomeFragmentViewState, HomeFragmentViewModel, FragmentHomeBinding>(
        contentLayout = R.layout.fragment_home, viewModelKClass = HomeFragmentViewModel::class
    ) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
//            setDisplayHomeAsUpEnabled(true)
//            setHomeButtonEnabled(true)
//            setCustomView(R.layout.toolbar_home)
//        }
    }
}

