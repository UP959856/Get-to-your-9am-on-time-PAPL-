package Code;

import java.io.FileNotFoundException;

public class NodeMap {

private Node head;
private Node currentNode;

public NodeMap()  {
    
    NodeCollection nodeCollection;   //scope: constructor only, part of process, no requirement to keep;
    
    try {
        nodeCollection = new NodeCollection();
        head = nodeCollection.get(0);

    } catch (FileNotFoundException e) {

        e.printStackTrace();
        return;

    }
    
    buildMap(nodeCollection);
    currentNode = head;
}

public Node currentNode() {return currentNode;}

public void decisionOne(){
    currentNode = currentNode.getOptionOneNode();
}

public void decisionTwo(int decision) {
    switch (decision) {
        case 1:
            currentNode = currentNode.getOptionOneNode();
            break;
        case 2:
            currentNode = currentNode.getOptionTwoNode();
            break;
     }
}

private void buildMap(NodeCollection NodeCollection){
    if(NodeCollection == null){return; }
    for(Node source : NodeCollection.arrayList()){
        int optionOneID = source.getOptionOneID();
        int optionTwoID = source.getOptionTwoID();
        Node optionOneNode = NodeCollection.locateNodeBy(optionOneID);
        Node optionTwoNode = NodeCollection.locateNodeBy(optionTwoID);
        source.setOptionOneNode(optionOneNode);
        source.setOptionTwoNode(optionTwoNode);
    }
}

public String optionOnePath(){

    Node node = head;
    String string = "Option 1\n";

    while(node != null) {

        string += node.toString() + "\n";
        node = node.getOptionOneNode();
        if (node.getCurrentNodeID() == 0) {node = null;}

    }

    return string;
}

public String optionTwoPath(){

    Node node = head;
    String string = "Option 2\n";

    while(node != null) {

        string += node.toString() + "\n";
        node = node.getOptionTwoNode();
        if (node.getCurrentNodeID() == 0) {node = null;}

    }

    return string;
}


}
