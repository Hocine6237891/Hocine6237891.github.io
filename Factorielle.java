public class Factorielle {
    public int calculerFactorielle(int n) {
        if (n == 0) {
            return 1;
        }
        int factorielle = 1;
        for (int i = 0; i < n; i++) {
            factorielle *= i;

        }
        return factorielle;
    }

    public static void main(String[] args) {
        System.out.println(new Factorielle().calculerFactorielle(1));
    }
}

