package com.company;

import java.util.ArrayList;

public class DotComBust {

    GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

    private int numOfGuesses;

    public void setUpGame() {
        // first make some dotComs and give them locations
        dotComsList.add( new DotCom("Pets.com"));
        dotComsList.add( new DotCom("eToys.com"));
        dotComsList.add( new DotCom("Go2.com"));

        System.out.println("Your Goal is to sink three dot coms");
        System.out.println("\nPets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them in the fewest possible guesses");
        System.out.println("      a  b  c  d  e  f ");
        System.out.println("   0 [ ][ ][ ][ ][ ][ ]");
        System.out.println("   1 [ ][ ][ ][ ][ ][ ]");
        System.out.println("   2 [ ][ ][ ][ ][ ][ ]");
        System.out.println("   3 [ ][ ][ ][ ][ ][ ]");
        System.out.println("   4 [ ][ ][ ][ ][ ][ ]");
        System.out.println("   5 [ ][ ][ ][ ][ ][ ]");



        int counter = 0;
        for(DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
            counter++;
        }

    }

    public void startPlaying() {
        System.out.println("The dotComsList is empty: " + dotComsList.isEmpty());
        while(!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for(int x = 0; x < dotComsList.size(); x++) {
            result = dotComsList.get(x).checkYourself(userGuess);

            if(result.equals("hit")) {
                break;
            }
            if(result.equals("kill")) {
                dotComsList.remove(x);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("\nAll DOT COMS HAVE BEEN ELIMINATED");
        if(numOfGuesses <= 15) {
            System.out.println("\n It only took you: " + getNumOfGuesses() + " guesses");
        } else {
            System.out.println("\n Wow. You're really good. You took " + getNumOfGuesses() + " guesses");
        }
    }

    public int getNumOfGuesses() {
        return numOfGuesses;
    }

}
