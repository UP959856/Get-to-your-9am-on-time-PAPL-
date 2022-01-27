
class Node{


//Each of the data any given node contains.
private int currentNodeID;
private int optionOneID;
private int optionTwoID;
private String description;
private String optionOneText;
private String optionTwoText;
private boolean optionOneHasRequirement;
private boolean optionTwoHasRequirement;
private int optionOneCoolnessRequirement;
private int optionOneTimeRequirement;
private int optionTwoCoolnessRequirement;
private int optionTwoTimeRequirement;
private int coolnessGained;
private int timeGained;

//Lets nodes be linked together.
private Node optionOneNode;
private Node optionTwoNode;

//Current Node Information
public void currentNode(int nodeID, int optionOneID, int optionTwoID, String description,
 String optionOneText, String optionTwoText, boolean optionOneHasRequirement, boolean optionTwoHasRequirement, 
 int optionOneCoolnessRequirement, int optionOneTimeRequirement, int optionTwoCoolnessRequirement, int optionTwoTimeRequirement, 
 int coolnessGained, int timeGained) {
    
    this.currentNodeID = nodeID;
    this.optionOneID = optionOneID;
    this.optionTwoID = optionTwoID;
    this.description = description;
    this.optionOneText = optionOneText;
    this.optionTwoText = optionTwoText;

    this.optionOneHasRequirement = optionOneHasRequirement;
    this.optionTwoHasRequirement = optionTwoHasRequirement;

    this.optionOneCoolnessRequirement = optionOneCoolnessRequirement;
    this.optionOneTimeRequirement = optionOneTimeRequirement;

    this.optionTwoCoolnessRequirement = optionTwoCoolnessRequirement;
    this.optionTwoTimeRequirement = optionTwoTimeRequirement;

    this.coolnessGained = coolnessGained;
    this.timeGained = timeGained;


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
////////////////////////////////////////////////////////////////////////////////////////////////////////

//Getters and setters for nodes having requirements
public boolean optionOneHasRequirement() {return optionOneHasRequirement;}
public void setOptionOneHasRequirement(boolean optionOneHasRequirement){this.optionOneHasRequirement = optionOneHasRequirement;}

public boolean optionTwoHasRequirement() {return optionTwoHasRequirement;}
public void setOptionTwoHasRequirement(boolean optionTwoHasRequirement){this.optionTwoHasRequirement = optionTwoHasRequirement;}
////////////////////////////////////////////////////////////////////////////////////////////////////////

//Getters and setters for option One requirements
public int getOptionOneCoolnessRequirement() {return optionOneCoolnessRequirement;}
public void setOptionOneCoolnessRequirement(int optionOneCoolnessRequirement) {this.optionOneCoolnessRequirement = optionOneCoolnessRequirement;}

public int setOptionOneTimeRequirement() {return optionOneTimeRequirement;}
public void setOptionOneTimeRequirement(int optionOneTimeRequirement) {this.optionOneTimeRequirement = optionOneTimeRequirement;}
////////////////////////////////////////////////////////////////////////////////////////////////////////

//Getters and setter for option Two requirements.
public int getOptionTwoCoolnessRequirement() {return optionTwoCoolnessRequirement;}
public void setOptionTwoCoolnessRequirement(int optionTwoCoolnessRequirement) {this.optionTwoCoolnessRequirement = optionTwoCoolnessRequirement;}

public int setOptionTwoTimeRequirement() {return optionTwoTimeRequirement;}
public void setOptionTwoTimeRequirement(int optionTwoTimeRequirement) {this.optionTwoTimeRequirement = optionTwoTimeRequirement;}
////////////////////////////////////////////////////////////////////////////////////////////////////////

//Getters and setters for stat gains after arriving at current node.
public int getCoolnessGained() {return coolnessGained;}
public void setCoolnessGained(int coolnessGained) {this.coolnessGained = coolnessGained;}

public int getTimeGained() {return timeGained;}
public void setTimeGained(int timeGained) {this.timeGained = timeGained;}
////////////////////////////////////////////////////////////////////////////////////////////////////////

//Getters and setters for each of the two option nodes to allow for mapping.
public Node getOptionOneNode(){return optionOneNode;}
public void setOptionOneNode(Node optionOne){this.optionOneNode = optionOne;}

public Node getOptionTwoNode(){return optionTwoNode;}
public void setOptionTwoNode(Node optionTwo){this.optionTwoNode = optionTwo;}
////////////////////////////////////////////////////////////////////////////////////////////////////////
@Override

//Displays Current nodes information.
public String toString(){

    return "Current Node: " + currentNodeID +
    ", Description: " + description + ", Option One ID: " +
    optionOneID + ", Option One Text: " + optionOneText + ", Option Two ID: "
    + optionTwoID + ", Option Two Text: " + optionTwoText + 
    ", option1HasRequirement: " + optionOneHasRequirement + ", option2HasRequirement: " + optionTwoHasRequirement + 
    ", option 1 coolness: " + optionOneCoolnessRequirement +  ", option 1 time: " + optionOneTimeRequirement +
    ", option 2 coolness: " + optionTwoCoolnessRequirement + ", option 2 time: " + optionTwoTimeRequirement +
    ", coolness gained: " + coolnessGained + ", time gained: " + timeGained;

}

}


