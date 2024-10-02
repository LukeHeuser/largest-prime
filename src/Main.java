public class Main {

    public static void main(String[] args) {
        getLargestPrime(21);
        getLargestPrime(121);
        getLargestPrime(98);
        getLargestPrime(-45);
        getLargestPrime(298);
        getLargestPrime(2);
    }
    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }
}
