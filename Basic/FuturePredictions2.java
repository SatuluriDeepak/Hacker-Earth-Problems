import java.util.*;
 
public class FuturePredictions2 {
    
    private static final String SIX_ZERO = "000000";
    private static final String SIX_ONE = "111111";
    private static final String SORRY_SORRY = "Sorry, sorry!";
    private static final String GOOD_LUCK = "Good luck!";
    
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.contains(SIX_ONE) || str.contains(SIX_ZERO)) {
            System.out.println(SORRY_SORRY);
        }
        else {
            System.out.println(GOOD_LUCK);
        }
    }
}