public class Reduce {
    public static void main(String[] args) {
        int steps = 0, n = 100;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
