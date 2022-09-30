package corejava.collection.assignmentset2.question7.solution;

public class SubSet {
    public boolean isSubSet(int[] firstArray, int[] secArray) {
        int j;
        if (firstArray.length > secArray.length) {
            return false;
        } else {
            for (int k : firstArray) {
                for (j = 0; j < secArray.length; j++) {
                    if (k == secArray[j])
                        break;
                }
                if (j == secArray.length)
                    return false;
            }
        }
        return true;
    }
}
