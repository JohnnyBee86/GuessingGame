package com.example.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

class WelcomeFragment : Fragment() {

    private lateinit var nameText: EditText
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        // Declare 'Play' button and variable to hold player name
        val playButton = view.findViewById<Button>(R.id.playBtn)
        nameText = view.findViewById<EditText>(R.id.playerNameText)

        // Assign function of 'Play' button
        // Get player name and pass it to next GameFragment
        playButton.setOnClickListener{
            // Get name from EditText
            val playerName = nameText.text.toString()
            // Attach name to NavDirections
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToGameFragment(playerName)
            // If valid execute action
            checkName(action)
        }

        return view
    }

    // Function to check for a 'name'
    private fun checkName(action: NavDirections) {
        // If a name is not present?
        if (nameText.text.isEmpty()) {
            // If a name is not present show a toast with 'instructions'
            Toast.makeText(activity, getString(R.string.main_name_required), Toast.LENGTH_SHORT).show()
        }
        // If a name is present
        else {
            // Engage!
            findNavController().navigate(action)
        }
    }
}