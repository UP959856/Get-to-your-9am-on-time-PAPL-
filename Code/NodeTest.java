package Code;

public class NodeTest {

public static void main(String[] args){

    Node n = new Node();

    String line = "1,2,4, You awaken from a strange dream and you look at your phone and realise the time is 8.30am. It is a bleak grey monday morning and you have a 9am. You think to yourself 'I better get to my 9am on time.' as a wave of anxiety hits., Get up and ready to go, Pursue the Dream";
    
    String[] stringArray = line.split(",");
    n.setCurrentNodeID(Integer.parseInt(stringArray[0]));
    n.setOptionOneID(Integer.parseInt(stringArray[1]));
    n.setOptionTwoID(Integer.parseInt(stringArray[2]));
    n.setDescription(stringArray[3]);
    n.setOptionOneText(stringArray[4]);
    n.setOptionTwoText(stringArray[5]);
     
    System.out.println(n.toString());
    
}
    
}
