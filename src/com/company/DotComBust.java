package com.company;

import java.util.ArrayList;

public class DotComBust {

    GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    ArrayList<DotCom> aList = new ArrayList<DotCom>();

    private int numOfGuesses;

    public void setUpGame() {
        // first make some dotComs and give them locations
        dotComsList.add( new DotCom("Pets.com"));
        dotComsList.add( new DotCom("eToys.com"));
        dotComsList.add( new DotCom("Go2.com"));

        System.out.println("Your Goal is to sink three dot coms");
        System.out.println("\nPets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them in the fewest possible guesses");

        for(DotCom dotComToSet : dotComsList) {
            //ArrayList<String> newLocation = helper.placeDotCome();
        }
    }

    public int getNumOfGuesses() {
        System.out.println("numOfGuesses is: " + numOfGuesses);
        return numOfGuesses;
    }

}
