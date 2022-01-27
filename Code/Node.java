package Code;

class Node{


//Each of the data any given node contains.
private int currentNodeID;
private int optionOneID;
private int optionTwoID;
private String description;
private String optionOneText;
private String optionTwoText;

//Lets nodes be linked together.
private Node optionOneNode;
private Node optionTwoNode;

//Current Node Information
public void currentNode(int nodeID, int optionOneID, int optionTwoID, String description,
 String optionOneText, String optionTwoText) {
    
    this.currentNodeID = nodeID;
    this.optionOneID = optionOneID;
    this.optionTwoID = optionTwoID;
    this.description = description;
    this.optionOneText = optionOneText;
    this.optionTwoText = optionTwoText;

}

public Node(){}

//Getters and Setters for each attribute in a Node.
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

public String getOptionTwoText() {return optionTwoText;}
public void setOptionTwoText(String optionTwoText) {this.optionTwoText = optionTwoText;}

//Getters and setters for each of the two option nodes to allow for mapping.
public Node getOptionOneNode(){return optionOneNode;}
public void setOptionOneNode(Node optionOne){this.optionOneNode = optionOne;}

public Node getOptionTwoNode(){return optionTwoNode;}
public void setOptionTwoNode(Node optionTwo){this.optionTwoNode = optionTwo;}

@Override

//Displays Current nodes information.
public String toString(){

    return "Current Node: " + currentNodeID +
    ", Description: " + description + ", Option One ID: " +
    optionOneID + ", Option One Text: " + optionOneText + ", Option Two ID: "
    + optionTwoID + ", Option Two Text: " + optionTwoText;

}

}


