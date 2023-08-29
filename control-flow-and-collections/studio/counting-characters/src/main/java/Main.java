import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
                " into a form that can be factored allowing that side of the equation to equal zero. Once you’ve " +
                "done that, it’s pretty straightforward from there.";

        String[] letters = quote.split("");
        ArrayList<String> listLetters = new ArrayList<>(Arrays.asList(letters));

        HashMap<String, Integer> hashList = new HashMap<>();
        for (String i : listLetters) {
            hashList.putIfAbsent(i, Collections.frequency(listLetters, i));
        }
        System.out.println(hashList);
    }
}