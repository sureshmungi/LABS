package capgemini_labbook;

 

import java.util.function.Consumer;

 


public class Lab13_Ex5_Factorial {
    public static void fact(int a){
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
    public static void main(String[] args) {
        Consumer<Integer> fact = Lab13_Ex5_Factorial::fact;
        fact.accept(6);
    
    }
}