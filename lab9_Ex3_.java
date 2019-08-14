package capgemini_labbook;

import java.util.*;
class GetSquares {
    public static HashMap<Integer, Integer> getSquare(int[] arr) {
    HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
    for(int i=0;i<5;i++){
        h1.put(arr[i],arr[i]*arr[i]);      
    }
    return h1;
    }
}
public class lab9_Ex3_{
public static void main(String args[]) {
    int[] arr=new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers");
    for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
    }
    GetSquares g = new GetSquares();
    HashMap<Integer, Integer> h = g.getSquare(arr);
    sc.close();
    System.out.println(h);
      
}
}
