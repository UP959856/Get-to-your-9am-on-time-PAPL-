

public class NodeTest {

public static void main(String[] args){

    String line0 = "1,2,4, You awaken from a strange dream and you look at your phone and realize the time is 8.30am. It is a bleak grey monday morning and you have a 9am. You think to yourself 'I better get to my 9am on time.' as a wave of anxiety hits., Get up and ready to go, Pursue the Dream";
    String line1 = "2,3,5, You are by the front door., Smoke cigarette in backyard, Head outside";
    String line2 = "4,0,0, (Ending 1) You fall asleep, Restart";

    Node n0 = new Node();
    mapNode(n0, line0);
    Node n1 = new Node();
    mapNode(n1, line1);
    Node n2 = new Node();
    mapNode(n2, line2);

    n0.setOptionOneNode(n1);
    n0.setOptionTwoNode(n2);

    print(n0.toString());
    print(n0.getOptionOneNode().toString());
    print(n0.getOptionTwoNode().toString());

    
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

public static void print(String info){System.out.println(info);}
    
}
