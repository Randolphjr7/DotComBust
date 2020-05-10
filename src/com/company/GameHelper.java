package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {

    private String inputLine = null;

    public String askUsers(String prompt) {

        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
                    inputLine = is.readLine();
                    if(inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public int placeDotCom() {

        
        return -1;
    }


    public String getInputLine() {
        System.out.println("Input Line is: " + inputLine);
        return inputLine;
    }
}
