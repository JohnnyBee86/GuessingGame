package com.example.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

class CongratsFragment : Fragment() {
    // Declare textview
    private lateinit var congratsDisplay:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_congrats, container, false)

        // Retrieve playerName from safe args and create delivery action
        val playerName = GameFragmentArgs.fromBundle(requireArguments()).playerName
        val action = CongratsFragmentDirections.actionCongratsFragmentToGameFragment(playerName)

        // assign textview
        congratsDisplay = view.findViewById(R.id.congratsText)

        // Generate Congrats message with playerName from safe args
        congratsDisplay.text = getString(R.string.congrats_topper) + " " + playerName + "!"

        // Declare 'Play Again' button and on click listener
        val playAgain = view.findViewById<Button>(R.id.playAgainBtn)
        playAgain.setOnClickListener{
            view.findNavController().navigate(action)
        }

        // Declare 'New Player' button and on click listener
        val newPlayer = view.findViewById<Button>(R.id.newPlayerBtn)
        newPlayer.setOnClickListener{
            view.findNavController().navigate(R.id.welcomeFragment)
        }

        return view
    }
}