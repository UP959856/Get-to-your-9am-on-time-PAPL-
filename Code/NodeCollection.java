package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NodeCollection {

private ArrayList<Node> nodes;

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

static NodeCollection NodeCollection;
public static void main(String[] args) throws FileNotFoundException{

    try {

        NodeCollection  = new NodeCollection();
        java.util.Scanner nodeDatabase = new Scanner(new File("Code/NodeDatabase.csv"));
        while(nodeDatabase.hasNextLine()){

            String nodeData = nodeDatabase.nextLine();
            //System.out.println(nodeData.toString());
            Node.mapFields(nodeData);
            //NodeCollection.mapFields(nodeData);

        }

    }

    catch (FileNotFoundException e){

        System.out.println(e.getMessage());
        e.printStackTrace();
        return;

    }

    System.out.println(NodeCollection.toString());

}

public String toString(){

    String str = "";

    for(Node n: nodes){

        str += n.toString() + "\n";
        
    }
    return str;
}

}
