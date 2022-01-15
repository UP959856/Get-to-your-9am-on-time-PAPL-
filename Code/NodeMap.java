package Code;

public class NodeMap {
    
public Node locateNodeBy(String currentNodeID){

    for(Node n : nodes){
        if(currentNodeID == n.getCurrentNodeID()){return n;}

    }

return new Node();

}
}
