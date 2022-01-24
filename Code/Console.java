package Code;

import java.util.Scanner;

@SuppressWarnings("ALL")

public class Console {

static NodeMap map;
static Scanner io;

public Console(NodeMap map) {

    io = new Scanner(System.in);
//Keeps the program running until it runs out of nodes or reaches the end.
    while(map.currentNode() != null){

        print(map.currentNode().getDescription());
        print(map.currentNode().getOptionOneText());
        print(map.currentNode().getoptionTwoText());

//If statement will allow looping once the user reaches the end of the game.

        if (map.currentNode().getoptionTwoText().equals("-")) {

            pressEnterToContinue();
            map.optionOnePath();

        } else {

            map.decision(fromConsoleGetInt("Press 1 or 2"));


        }
        
    }
    
}

//Obtains the numerical input and returns the decision.
public  int fromConsoleGetInt(String prompt){

    print(prompt);
    int returnValue = io.nextInt();
    return returnValue;

}

//Allows the user to press enter to continue.
public  void pressEnterToContinue(){
    
    print("Press the Enter key to continue...");
    try {System.in.read();}
    catch(Exception e) {}

}

public void print(String info){System.out.println(info);}
    
}
