# GuessingGame
An Android high or low guessing game
- The game will ask players to guess if the number it's 'thinking' of is higher or lower than a 'given' number
- Both numbers will be randomly generated for each guess between 1 and 10 (inclusive)
- The 'given' number is re-rolled if it is the same as the 'thinking'
- After 5 correct guesses the game will end

## Android features used will include:
- Fragments
- Event Handling (on click listeners)
- Navigation Achitecture
- Safe Args

## Completed as of 7 Nov 23:
- Initial project build
- Created Welcome, Game, and Congrats fragments
- Populated and Constrained project elements (i.e. Textviews, Text Input Area, and Buttons) for all fragments
- Created Nav Graph layout (see photo below) with the 'back' action on the Congrats fragment 'popping' to the Welcome fragment

![LayoutAndNavSetUp](https://github.com/JohnnyBee86/GuessingGame/assets/130700641/b66d629e-a1d6-46d9-a2c5-8bea368c1cd4)

- Implemented code to navigate from Welcome to Game fragment
- Implemented and tested functional game code

## Completed as of 16 Nov 23:
- Implemented code to enable the New Player button on the Congrats fragment to navigate to the Welcome fragment
- Implemented code to enable the Play Again button on the Congrats fragment to navigate to the Game fragment
- Implemented SafeArgs
- Implemented code on all fragments to send the player's name to necessary fragments i.e.:
      Welcome fragment to Game fragment
      Game fragment to Congrats fragment
      Congrats fragment to Game fragment

- Tested functionality of game, SafeArgs, and code placing player's name (at varying lengths) in TextViews

- Final nav_graph:

![FinalNavGraph](https://github.com/JohnnyBee86/GuessingGame/assets/130700641/0dd04d47-bbc9-4c54-aa31-45e8ee38c7a5)
