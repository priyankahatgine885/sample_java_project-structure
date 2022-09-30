package corejava.collection.assignmentset2.question8.solution;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public boolean isIsogram(String word) {
        Set<Character> set = new HashSet<>();
        word = word.toLowerCase();
        char[] arr = word.toCharArray();
        for (char ch : arr) {
            set.add(ch);
        }
        return (set.size() == word.length());
    }
}
