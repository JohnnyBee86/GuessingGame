# GuessingGame
An Android high or low guessing game created and written by [John Bartholomew](https://github.com/JohnnyBee86)
- Players can choose to enter a name or use the default of 'Player' on the Welcome screen
- Then the game asks players to guess if the number it's 'thinking' of is higher or lower than a 'given' number
- Both numbers are randomly generated for each guess between 1 and 10 (inclusive)
- The 'given' number is re-rolled if it is the same as the 'thinking' number
- The player's score is updated with each correct guess
- After 5 correct guesses the game ends
- The game then goes to a Congratulations screen where they can choose to play again or return to the Welcome screen

## Android features used:
- Fragments
- Event Handling (on click listeners)
- Navigation Achitecture
- Safe Args
- Toasts

## Completed as of 7 Nov 23:
- Initial project build
- Created Welcome, Game, and Congrats fragments
- Populated and Constrained project elements (i.e. TextViews, EditText, and Buttons) for all fragments
- Created Nav Graph layout (see photo below) with the 'back' action on the Congrats fragment 'popping' to the Welcome fragment

![LayoutAndNavSetUp](https://github.com/JohnnyBee86/GuessingGame/assets/130700641/b66d629e-a1d6-46d9-a2c5-8bea368c1cd4)

- Implemented code to navigate from the Welcome to the Game fragment
- Implemented and tested game code:
     - Game code functional

- Created README and filled out to match progress as of 7 Nov 23

## Completed as of 16 Nov 23:
- Implemented code to enable the New Player button on the Congrats fragment to navigate to the Welcome fragment
- Implemented code to enable the Play Again button on the Congrats fragment to navigate to the Game fragment
- Implemented SafeArgs
- Implemented code on all fragments to send the player's name to necessary fragments i.e.:
     - Welcome fragment to Game fragment
     - Game fragment to Congrats fragment
     - Congrats fragment to Game fragment

- Tested functionality of game, SafeArgs, and code placing player's name (at varying lengths):
     - Upon testing, found an empty string was being allowed
     - Implemented code to ensure the 'player name' string is not empty before prceeding
     - Added a 'toast' to instruct the player that a name is required

- Final nav_graph:

![FinalNavGraph](https://github.com/JohnnyBee86/GuessingGame/assets/130700641/0dd04d47-bbc9-4c54-aa31-45e8ee38c7a5)

- Updated README to match progess as of 16 Nov 23
