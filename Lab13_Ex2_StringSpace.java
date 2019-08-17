package capgemini_labbook;
import java.util.function.Consumer;
public class Lab13_Ex2_StringSpace {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.substring(i, i + 1) + " ");
            }
            ;
        };
        consumer.accept("Customer_Suresh");
    }


}





