package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NodeCollection {

private ArrayList<Node> nodes;
static NodeCollection NodeCollection;

Node mapFields(String nodeData){

    String[] stringArray = nodeData.split(",");
    Node n = new Node();

    n.setCurrentNodeID(stringArray[0]);
    n.setOptionOneID(stringArray[1]);
    n.setOptionTwoID(stringArray[2]);
    n.setDescription(stringArray[3]);
    n.setOptionOneText(stringArray[4]);
    n.setOptionTwoText(stringArray[5]);
    return n;

}

private void buildMap(NodeCollection NodeCollection){

    if (NodeCollection == null){return;}
    for(Node source: NodeCollection.arrayList()){

        String optionOneID = source.getOptionOneID();
        String optionTwoID = source.getOptionTwoID();
        Node optioneOneNode = NodeCollection.locateNodeBy(optionOneID);
        Node optionTwoNode = NodeCollection.locateNodeBy(optionTwoID);
        source.setOptionOneID(optionOneID);
        source.setOptionTwoID(optionTwoID);
        
    }
}
    

private Node locateNodeBy(String optionOneID) {
    return null;
}

public static void main(String[] args){

    try {

        java.util.Scanner nodeDatabase = new Scanner(new File("Code/NodeDatabase.csv"));
        while(nodeDatabase.hasNextLine()){

            String nodeData = nodeDatabase.nextLine();
            Node.mapFields(nodeData);

        }

        NodeCollection = new NodeCollection();

    }

    catch (FileNotFoundException e){

        System.out.println(e.getMessage());
        e.printStackTrace();

    }

    System.out.println(NodeCollection.toString());

}

}
