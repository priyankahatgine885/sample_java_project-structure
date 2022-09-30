package corejava.collection.assignmentset2.question7.solution;

public class Equals {
    public boolean isEqual(int[] firstArray, int[] secArray) {
        if (firstArray.length != secArray.length) {
            return false;
        } else {
            int j;
            for (int k : firstArray) {
                for (j = 0; j < secArray.length; j++) {
                    if (secArray[j] == k)
                        break;
                }
                if (j == firstArray.length)
                    return false;
            }
        }
        return true;
    }
}
