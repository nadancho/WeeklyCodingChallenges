import java.util.*;

public class LoopDetection{

    public static Node LoopDetect(LinkedList X){

        List<Node> dupe = new ArrayList<>();
        while(X.hasNext()){
            Node node = X.next();
            if(dupe.contains(node)){
                return node;
            }
            else {
                dupe.add(node);
                node = node.next();
                continue;
            }
        }
    }
}