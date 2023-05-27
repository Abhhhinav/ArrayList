package ArrayList;
import java.util.*;
public class MultiDim {
    public static void main(String[] args) {
       
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();

     //     ArrayList<Integer>list = new ArrayList<>();
     //     list.add(1);
     //     list.add(2);
     //     mainlist.add(list);

     //     ArrayList<Integer>list2 = new ArrayList<>();
     //     list2.add(3);
     //     list2.add(4);
     //     mainlist.add(list2);

     //    for(int i=0;i<mainlist.size();i++){
     //     ArrayList<Integer>Curr = mainlist.get(i);
     //      for(int j=0;j<Curr.size();j++){
     //         System.out.print(Curr.get(j) + " ");
     //      }
     //      System.err.println();
     //    }

     ArrayList<Integer>list1 = new ArrayList<>();
     ArrayList<Integer>list2 = new ArrayList<>();
     ArrayList<Integer>list3 = new ArrayList<>();
    
     for(int i =1; i <=5;i++ ){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
     }
    
      mainlist.add(list1);
      mainlist.add(list2);
      mainlist.add(list3);
      System.out.println(mainlist);

      for(int i=0;i<mainlist.size();i++){
      ArrayList<Integer>Curr = mainlist.get(i);
        for(int j =0;j<Curr.size();j++){
            System.out.print(Curr.get(j)+" ");
        }
        System.out.println();
       }
    }
}
