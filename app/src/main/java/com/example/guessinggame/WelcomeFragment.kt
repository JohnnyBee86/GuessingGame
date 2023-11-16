package com.example.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        // Declare 'Play' button and variable to hold player name
        val playButton = view.findViewById<Button>(R.id.playBtn)
        val nameText = view.findViewById<EditText>(R.id.playerNameText)

        // Assign function of 'Play' button
        // Get player name and pass it to next GameFragment
        playButton.setOnClickListener{
            val playerName = nameText.text.toString()
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToGameFragment(playerName)
            view.findNavController().navigate(action)
        }

        return view
    }
}