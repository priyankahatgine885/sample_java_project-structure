package corejava.collection.assignmentset2.question9.main;

import corejava.collection.assignmentset2.question9.solution.Anagram;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        final String stringFirst = "listen";
        final String stringSecond = "enlists";
        if (anagram.isAnagram(stringFirst, stringSecond)) {
            System.out.println(stringFirst + " and " + stringSecond + " are Anagrams");
        } else {
            System.out.println(stringFirst + " and " + stringSecond + " are NOT Anagrams");
        }
    }
}
