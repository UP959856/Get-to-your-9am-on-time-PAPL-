package Code;

import java.io.FileNotFoundException;

public class NodeCollectionTest {

static NodeCollection NodeCollection;
public static void main(String[] args) throws FileNotFoundException {

    try {

        NodeCollection = new NodeCollection();

    } catch (FileNotFoundException e) {

        print(e.getMessage());
        return;

    }

    print(NodeCollection.toString());
    
}

public static void print(String info){System.out.println(info);}

    
}
