import java.util.HashMap;
import java.util.Map;


//Loop over the given array of strings to build a result string like this:
// when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
// Return the empty string if no string appears a 2nd time.

//wordAppend(["a", "b", "a"]) → "a"
//wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
//wordAppend(["a", "", "a"]) → "a"

public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> myMap = new HashMap<>();
        String result = "";

        for (int i = 0; i < strings.length; i++) {
            myMap.put(strings[i], myMap.getOrDefault(strings[i], 0) + 1);

            if (myMap.get(strings[i]) % 2 == 0) {
                result += strings[i];
            }
        }
        return result;


    }

    public static void main(String[] args){
        String []strings = {"a","","b","a","a","b"};
        WordAppend obj = new WordAppend();
        System.out.println(obj.wordAppend(strings));
    }
}
