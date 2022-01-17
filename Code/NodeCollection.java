package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NodeCollection {

private static ArrayList<Node> nodes;

Node mapFields(String nodeData){

    String[] stringArray = nodeData.split(",");
    Node n = new Node();

    n.setCurrentNodeID(Integer.parseInt(stringArray[0]));
    n.setOptionOneID(Integer.parseInt(stringArray[1]));
    n.setOptionTwoID(Integer.parseInt(stringArray[2]));
    n.setDescription(stringArray[3]);
    n.setOptionOneText(stringArray[4]);
    n.setOptionTwoText(stringArray[5]);
    return n;

}

NodeCollection NodeCollection;

public NodeCollection() throws FileNotFoundException{

    NodeCollection = new NodeCollection();
    java.util.Scanner nodeDatabase = new Scanner(new File("Code/NodeDatabase.csv"));
        
    while(nodeDatabase.hasNextLine()){

        String nodeData = nodeDatabase.nextLine();
        nodes = new ArrayList<Node>();
        Node node;
        node = mapFields(nodeData);
        nodes.add(node);

    }

}

public ArrayList<Node> arrayList(){return nodes;}

public Node get(int index){return nodes.get(index);}

public Node locateNodeBy(int nodeID) {

    for (Node n : nodes) {
        if (nodeID == n.getCurrentNodeID()) {

            return n;

        }
    }
    
    return new Node();
}


public String toString(){

    String str = "";

    for(Node n: nodes){

        str += n.toString() + "\n";
        
    }
    return str;
}

}
