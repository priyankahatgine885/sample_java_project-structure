package corejava.collection.assignmentset2.question9.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
   public boolean isAnagram(String stringFirst, String stringSecond) {
        stringFirst = stringFirst.toLowerCase();
        stringSecond = stringSecond.toLowerCase();

        if (stringFirst.length() != stringSecond.length())
            return false;

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (int i = 0; i < stringFirst.length(); i++) {
            list1.add(stringFirst.charAt(i));
        }
        for (int i = 0; i < stringSecond.length(); i++) {
            list2.add(stringSecond.charAt(i));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
