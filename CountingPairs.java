package hackerrank;

import java.util.Arrays;
import java.util.List;

public class MudWall {

public static int maxHeight(List<Integer> stickPositions, List<Integer> stickHeights) {
    int n = stickPositions.size();
    int max = 0;

    for (int i=0; i<n-1; i++) {
        if (stickPositions.get(i)<stickPositions.get(i+1)-1) {
            int hytDiff =  stickHeights.get(i+1) - stickHeights.get(i);
            int noOfMuds = stickPositions.get(i+1) - stickPositions.get(i) - 1;
            int tempValue = 0;
            if (noOfMuds > hytDiff) {
                int low = Math.max(stickHeights.get(i+1), stickHeights.get(i)) + 1;
                int remainingGap = noOfMuds - hytDiff - 1;
                tempValue = low + remainingGap/2;

            } else {
                tempValue = Math.min(stickHeights.get(i+1), stickHeights.get(i)) + noOfMuds;
            }

            max = Math.max(max, tempValue);
        }
    }

    return max;
}

public static void main(String[] args){
    List<Integer> sPosition =  Arrays.asList(7,12,16,22,26,29);
    List<Integer> sHeights =  Arrays.asList(8,8,9,8,8,11);
    System.out.println(maxHeight(sPosition, sHeights));
}


}
