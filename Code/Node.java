package Code;

class Node{

private int currentNodeID;
private int optionOneID;
private int optionTwoID;
private String description;
private String optionOneText;
private String optionTwoText;

public void currentNode(int nodeID, int optionOneID, int optionTwoID, String description, String optionOneText, String optionTwoText) {
    
    this.currentNodeID = nodeID;
    this.optionOneID = optionOneID;
    this.optionTwoID = optionTwoID;
    this.description = description;
    this.optionOneText = optionOneText;
    this.optionTwoText = optionTwoText;

}

public int getCurrentNodeID() {return currentNodeID;}
public void setCurrentNodeID(int currentNodeID) {this.currentNodeID = currentNodeID;}

public int getOptionOneID() {return optionOneID;}
public void setOptionOneID(int optionOneID) {this.optionOneID = optionOneID;}

public int getOptionTwoID() {return optionTwoID;}
public void setOptionTwoID(int optionTwoID) {this.optionTwoID = optionTwoID;}

public String getDescription() {return description;}
public void setDescription(String description) {this.description = description;}

public String getOptionOneText() {return optionOneText;}
public void setOptionOneText(String optionOneText) {this.optionOneText = optionOneText;}

public String getoptionTwoText() {return optionTwoText;}
public void setOptionTwoText(String optionTwoText) {this.optionTwoText = optionTwoText;}

@Override
public String toString(){

    return "Current Node: " + currentNodeID +
    ", Description: " + description + ", Option One ID: " +
    optionOneID + ", Option One Text: " + optionOneText + ", Option Two ID: "
    + optionTwoID + ", Option Two Text: " + optionTwoText;

}

public static void main(String[] args){

    String testLine = "1,2,4, You awaken from a strange dream and you look at your phone and realise the time is 8.30am. It is a bleak grey monday morning and you have a 9am. You think to yourself 'I better get to my 9am on time.' as a wave of anxiety hits., Get up and ready to go, Pursue the Dream";
    String[] stringArray = testLine.split(testLine, ',');
    Node n = new Node();

    //n.setCurrentNodeID(stringArray[0]);
    //n.setOptionOneID(stringArray[1]);
    //n.setOptionTwoID(stringArray[2]);
    n.setDescription(stringArray[3]);
    n.setOptionOneText(stringArray[4]);
    n.setOptionTwoText(stringArray[5]);

    System.out.println(n.toString());

}


}


