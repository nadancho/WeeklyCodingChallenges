import java.util.*;

public class Intersection{

    public static String IntersectionFinder(LinkedList A, LinkedList B){
        String result = "There is no intersection.";

        for(int j = 0; j < A.size(); j++){
            for(int k = 0; k < B.size(); j++){
                if( A.get(j) == B.get(k) ){
                    //returning directly here to get out of loop.
                    //Cannot use break here.
                    return "the intersection is at the node" + B.get(k);
                }
            }
        }
        return result;
    }

}