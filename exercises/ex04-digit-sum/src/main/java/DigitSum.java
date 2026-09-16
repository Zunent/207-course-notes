/**
 * Exercise (Chapter 1: Introduction to Java) — while loops and integer
 * arithmetic.
 *
 * Complete {@link #digitSum(int)} below using a while loop.
 *
 * Relevant reading: 1.8.3. while Loops (and 1.2. Variables and Types).
 */
public class DigitSum {

    public static void main(String[] args) {
        // Should print 15 (1 + 2 + 3 + 4 + 5) once digitSum is implemented.
        System.out.println("digitSum(12345) = " + digitSum(12345));
    }

    /**
     * Returns the sum of the decimal digits of {@code n}. Negative numbers are
     * treated by their absolute value, so {@code digitSum(-123) == 6}.
     *
     * @param n any int
     * @return the sum of its decimal digits
     */
    public static int digitSum(int n) {
//        String digitString = String.valueOf(Math.abs(n));
//        int sum = 0;
//        for (int i = 0; i < digitString.length(); i++) {
//            sum += Character.getNumericValue(digitString.charAt(i));
//        }
//        return sum;
        // This solution is kinda funky, I don't like it very much.

        int num = Math.abs(n);
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
        // This solution is arguably more clean but gets into number construction funnies.
        // Also, it's ever so slightly slower (?)
    }
}
