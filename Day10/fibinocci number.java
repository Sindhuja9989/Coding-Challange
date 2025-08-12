
public class Solution {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        int n1 = 2;
        int n2 = 3;
        int n3 = 4;

        System.out.println("F(" + n1 + ") = " + solution.fib(n1));
        System.out.println("F(" + n2 + ") = " + solution.fib(n2));
        System.out.println("F(" + n3 + ") = " + solution.fib(n3));
    }
}
