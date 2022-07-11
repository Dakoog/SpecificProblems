package maths;

public class PrimeNumbers {
    public static void main(String[] args) {
        int rangeFrom = 100;
        int rangeTo = 200;
        System.out.printf("Prime numbers in the range  <%d ; %d> :", rangeFrom, rangeTo);
        for (int i = rangeFrom; i <= rangeTo; i++) {
            if (isPrimeNumbers(i)) {
                System.out.printf(" %d ", i);
            }
        }

    }

    public static boolean isPrimeNumbers(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
