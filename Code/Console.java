package Code;

import java.util.Scanner;

@SuppressWarnings("ALL")

public class Console {

static NodeMap map;
static Scanner io;

public Console(NodeMap map) {

    io = new Scanner(System.in);

    while(map.currentNode() != null){

        print(map.currentNode().getDescription());
        print(map.currentNode().getOptionOneText());
        print(map.currentNode().getoptionTwoText());

        if (map.currentNode().getDescription().equals("-")) {
            pressEnterToContinue();
            map.optionTwoPath();
        } else {
            map.optionOnePath();
                    fromConsoleGetInt("Yes or No? (press 1 for Yes or 2 No)")

        }
        
    }
    
}

public  int fromConsoleGetInt(String prompt){

    print(prompt);
    int returnValue = io.nextInt();
    return returnValue;

}

public  void pressEnterToContinue(){
    
    print("Press the Enter key to continue...");
    try {System.in.read();}
    catch(Exception e) {}

}

public void print(String info){System.out.println(info);}
    
}
