

import java.util.Scanner;
//import java.util.Random;

@SuppressWarnings("ALL")

public class Console {

static NodeMap map;
static Scanner io;

public Console(NodeMap map) {


    io = new Scanner(System.in);
    PlayerStats playerStats = new PlayerStats();
    
//Keeps the program running until it runs out of nodes or reaches the end.
    while(map.currentNode() != null){

        Boolean canPassOptionOne;
        Boolean canPassOptionTwo;

        print(map.currentNode().getDescription());
        print(map.currentNode().getOptionOneText());
        print(map.currentNode().getOptionTwoText());

        print(playerStats.toString());

//Adds points gained from current node if points are to be gained.
        playerStats.addCoolnessPoints(map.currentNode().getCoolnessGained());
        playerStats.addTimePoints(map.currentNode().getTimeGained());

//If statement will allow looping once the user reaches the end of the game.
        if (map.currentNode().getOptionTwoText().equals("-")) {

            map.decision(fromConsoleGetInt("Select Option 1 to restart"));

        } 

        //Mechanism to search for stats requirements to move to nodes. Checks through each node individually.
        
        else {

            if(map.currentNode().optionOneHasRequirement() == true){

                canPassOptionOne = playerStats.hasStats(playerStats.coolness, playerStats.time,
                 map.currentNode().getOptionOneCoolnessRequirement(), map.currentNode().getOptionOneTimeRequirement());

            }

            else {canPassOptionOne = false;}

            if (map.currentNode().optionTwoHasRequirement() == true){

                canPassOptionTwo = playerStats.hasStats(playerStats.coolness, playerStats.time,
                 map.currentNode().getOptionTwoCoolnessRequirement(), map.currentNode().getOptionTwoTimeRequirement());



            }

            else {canPassOptionTwo = false;}

            if(canPassOptionOne == true && canPassOptionTwo == true) {

                map.decision(fromConsoleGetInt("Press 1 or 2"));

            }

            else {

                if(canPassOptionOne == true){map.decision(fromConsoleGetOne("You can only pass through option 1"));}
                else if(canPassOptionTwo == true){map.decision(fromConsoleGetTwo("You can only pass through option 2"));}

            }


        }
        
    }
    
}

//Obtains the numerical input and returns the decision.
public  int fromConsoleGetInt(String prompt){

    print(prompt);
    int returnValue = io.nextInt();
    //int returnValue = randNumber();
    return returnValue;

}

public  int fromConsoleGetOne(String prompt){

    int returnValue = 0;

    print(prompt);
    while(returnValue != 1){
    returnValue = io.nextInt();
    //int returnValue = randNumber();
    }

    return returnValue;

}

public  int fromConsoleGetTwo(String prompt){

    int returnValue = 0;

    print(prompt);
    while(returnValue != 2){
    returnValue = io.nextInt();
    //int returnValue = randNumber();
    }

    return returnValue;

}

//Allows the user to press enter to continue.
public  void pressEnterToContinue(){
    
    print("Press the Enter key to continue...");
    try {System.in.read();}
    catch(Exception e) {}

}

public void print(String info){System.out.println(info);}

//private int randNumber(){
//
//    Random rand = new Random();
//    int randomInteger = rand.nextInt((2 - 1) + 1) + 1;
//    return randomInteger;
//
//}


}