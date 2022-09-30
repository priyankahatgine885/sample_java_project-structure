package corejava.collection.assignmentset2.question7.solution;

public class SuperSet {
    public boolean isSuperSet(int[] firstArray, int[] secArray) {
        int j;
        if (firstArray.length < secArray.length) {
            return false;
        } else {
            for (int k : secArray) {
                for (j = 0; j < firstArray.length; j++) {
                    if (firstArray[j] == k)
                        break;
                }
                if (j == secArray.length)
                    return false;
            }
        }
        return true;
    }
}
