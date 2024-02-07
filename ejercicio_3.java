public class ejercicio_3 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        int[] multiplesOfFive = getMultiplesOfFive(begin, end);
        int sum = calculateSum(multiplesOfFive);

        System.out.println("Multiples of 5:");
        for (int multiple : multiplesOfFive) {
            System.out.println(multiple);
        }

        System.out.println("Sum of multiples of 5: " + sum);
        System.out.println("Number of multiples of 5: " + multiplesOfFive.length);
    }

    public static int[] getMultiplesOfFive(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }

        int[] multiples = new int[count];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiples[index] = i;
                index++;
            }
        }

        return multiples;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

