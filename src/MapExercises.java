import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> m = new HashMap<>();
        char c = 'a';
        for(int i = 1; i < 27; i++){
            m.put(c, i);
            c++;
        }
        return m;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> squares = new HashMap<>();
        for(int i : nums){
            squares.put(i, i*i);
        }
        return squares;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> count_words = new TreeMap<>();
        for(String s : words){
            if(!count_words.containsKey(s)){
                count_words.put(s, 1);
            }else{
                count_words.put(s, count_words.get(s)+1);
            }
        }
        return count_words;
    }
}
