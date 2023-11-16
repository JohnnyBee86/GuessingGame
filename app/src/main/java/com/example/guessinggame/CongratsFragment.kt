package com.example.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class CongratsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_congrats, container, false)
        val newPlayer = view.findViewById<Button>(R.id.newPlayerBtn)

        newPlayer.setOnClickListener{
            view.findNavController().navigate(R.id.welcomeFragment)
        }

        return view
    }
}