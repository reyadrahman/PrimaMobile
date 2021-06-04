package com.dinaraparanid.prima.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dinaraparanid.prima.R

class FavouriteTracksFragment : Fragment() {
    companion object {
        @JvmStatic
        fun newInstance(): FavouriteTracksFragment = FavouriteTracksFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favourite_tracks, container, false)
    }
}