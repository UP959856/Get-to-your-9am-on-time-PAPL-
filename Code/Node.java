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
public void currentNode(int nodeID, int optionOneID, int optionTwoID, String description, String optionOneText, String optionTwoText) {
    
    this.currentNodeID = nodeID;
    this.optionOneID = optionOneID;
    this.optionTwoID = optionTwoID;
    this.description = description;
    this.optionOneText = optionOneText;
    this.optionTwoText = optionTwoText;

}

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

public String getoptionTwoText() {return optionTwoText;}
public void setOptionTwoText(String optionTwoText) {this.optionTwoText = optionTwoText;}

//Getters and setters for each of the two option nodes.
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

public static void mapNode(Node n, String line){

    String[] stringArray = line.split(",");
    n.setCurrentNodeID(Integer.parseInt(stringArray[0]));
    n.setOptionOneID(Integer.parseInt(stringArray[1]));
    n.setOptionTwoID(Integer.parseInt(stringArray[2]));
    n.setDescription(stringArray[3]);
    n.setOptionOneText(stringArray[4]);
    n.setOptionTwoText(stringArray[5]);

}

//public static void main(String[] args){

//    String Line0 = "1,2,4, You awaken from a strange dream and you look at your phone and realise the time is 8.30am. It is a bleak grey monday morning and you have a 9am. You think to yourself 'I better get to my 9am on time.' as a wave of anxiety hits., Get up and ready to go, Pursue the Dream";
//    String Line1 = "2,3,5, You are by the front door., Smoke cigarette in backyard, Head outside";
//    String Line2 = "3,4,5, The nicotine strikes you with a headrush and you begin to feel a little too comfortable. (+0.5 coolness -1 time points), Put your head back, Fight the urges";

//    Node n0 = new Node();
//    mapNode(n0, Line0);
//    Node n1 = new Node();
//    mapNode(n1, Line1);
//    Node n2 = new Node();
//    mapNode(n2, Line2);

//    n0.setOptionOneNode(n1);
//    n1.setOptionTwoNode(n2);

//    System.out.println(n0.toString());
//   System.out.println(n1.toString());
//    System.out.println(n2.toString());

//}

}


