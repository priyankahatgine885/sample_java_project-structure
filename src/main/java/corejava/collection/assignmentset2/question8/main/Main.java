package corejava.collection.assignmentset2.question8.main;

import corejava.collection.assignmentset2.question8.solution.Isogram;

public class Main {
    public static void main(String[] args) {
        Isogram isogram = new Isogram();
        final String givenWord = "Machine";
        boolean result =isogram.isIsogram(givenWord);
        if (result) {
            System.out.println(givenWord + " is an isogram");
        } else {
            System.out.println(givenWord + " is not isogram");
        }
    }
}
