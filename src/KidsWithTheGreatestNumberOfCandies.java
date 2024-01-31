import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maximum = 0;
        for (int noOfCandy : candies) {
            if (noOfCandy > maximum) {
                maximum = noOfCandy;
            }
        }
        for (int noOfCandy : candies) {
            ans.add(noOfCandy + extraCandies >= maximum);
        }
        return ans;
    }
}
