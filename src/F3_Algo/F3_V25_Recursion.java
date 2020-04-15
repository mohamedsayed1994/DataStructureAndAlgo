package F3_Algo;

public class F3_V25_Recursion {
    // calculate the factorial 5! = 1*2*3*4*5
    public static void main(String[] args) {
        System.out.println(recFactorial(5));
        System.out.println(iterativeFactorial(5));
        int i = 7/2;
        System.out.println(i);
    }

    public static int recFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
