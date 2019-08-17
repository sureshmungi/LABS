package capgemini_labbook;


import java.util.function.BiConsumer;


public class Lab13_Ex1_Power {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> power = (a, b) -> System.out.println((int) (Math.pow(a, b)));
        power.accept(2, 3);
    }
}
 




