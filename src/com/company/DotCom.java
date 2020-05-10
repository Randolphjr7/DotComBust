package com.company;

import java.util.ArrayList;

public class DotCom {

    private String name;

    private ArrayList<String> locationCells;

    public DotCom() {

    }

    public DotCom(String input) {
        name = input;
    }

    public void improvedSetLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if(index >= 0) {
            locationCells.remove(index);
            if(locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "miss";
            }
        }

        return result;
    }
}
