package ArrayList;
import java.util.*;
public class Monotonic {

    public static boolean ismono(ArrayList<Integer>A) {
         boolean inc = true;
         boolean dec = true;
         for(int i=0;i<A.size()-1;i++){
            if(A.get(i) > A.get(i+1))
              inc = false;
            if(A.get(i) < A.get(i+1))
              dec = false;
        }
        return inc||dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(2);
        A.add(5);
        A.add(9);
        A.add(10);
        System.out.println(ismono(A));
    }
}