package corejava.collection.assignmentset2.question7.main;

import corejava.collection.assignmentset2.question7.solution.Equals;
import corejava.collection.assignmentset2.question7.solution.SubSet;
import corejava.collection.assignmentset2.question7.solution.SuperSet;

public class Main {
    public static void main(String[] args) {
        SubSet subSet = new SubSet();
        SuperSet superSet = new SuperSet();
        Equals equals = new Equals();
        int[] firstArray = {1, 2, 3,};
        int[] secondArray = {1, 2, 3, 4, 5};
        if (equals.isEqual(firstArray, secondArray)) {
            System.out.println("First array is equal to Second array ");
        } else if (subSet.isSubSet(firstArray, secondArray)) {
            System.out.println("First array is a subset of Second array ");
        } else if (superSet.isSuperSet(firstArray, secondArray)) {
            System.out.println("First array is a superset of Second array ");
        } else {
            System.out.println("First array is not a superset of, subset of or not equal to Second array \n");
        }
    }
}
