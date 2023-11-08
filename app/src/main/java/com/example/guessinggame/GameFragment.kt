package com.example.guessinggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class GameFragment : Fragment() {
    // Declare score variable
    private var currentScore = 0
    private var thinkingNumber = 0
    private var givenNumber = 0
    private lateinit var givenDisplay:TextView
    private lateinit var scoreDisplay:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_game, container, false)

        // assign textviews
        givenDisplay = view.findViewById(R.id.given)
        scoreDisplay = view.findViewById(R.id.playerScore)

        // Declare 'Higher' guess button and on click listener
        val higherButton = view.findViewById<Button>(R.id.higherBtn)
        higherButton.setOnClickListener{
            guess(true)
        }

        // Declare 'Lower' guess button and on click listener
        val lowerButton = view.findViewById<Button>(R.id.lowerBtn)
        lowerButton.setOnClickListener{
            guess(false)
        }

        // Start game
        newNumber()
        updateScore(0)

        return view
    }

    // Function to check if guess id correct
    private fun guess(guess:Boolean){
        if (guess == correct()) {
            currentScore++
            if (currentScore >= 5) {
                findNavController().navigate(R.id.action_gameFragment_to_congratsFragment)
            }
            updateScore(currentScore)
            newNumber()
        }
        else{
            newNumber()
        }
    }

    // Function to check what the correct guess is
    private fun correct():Boolean {
        if (thinkingNumber > givenNumber) {
            return true
        }
        return false
    }


    // Function to update the displayed score
    private fun updateScore(newScore:Int) {
        scoreDisplay.text = getString(R.string.game_player_score) + " " + newScore
    }

    // Function to create 'Thinking' and 'Given' numbers
    private fun newNumber() {
        thinkingNumber = (1..10).random()
        givenNumber = (1..10).random()
        while (thinkingNumber == givenNumber) {
            givenNumber = (1..10).random()
        }
        givenDisplay.text  = getString(R.string.game_higher_or_lower) + " " + givenNumber
    }
}