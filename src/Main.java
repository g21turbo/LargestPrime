public class Main {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(35000));
        System.out.println(getLargestPrime(1000));
        System.out.println(getLargestPrime(12554));

    }

    public static int getLargestPrime(int number) {

        // Check if the input number is less than 2
        if (number < 2) {
            // Return -1 for numbers less than 2, as they don't have prime factors
            return -1;
        }

        // Initialize a variable to store the largest prime factor found
        int factor = -1;

        // Iterate through potential factors starting from 2
        for (int i = 2; i * i <= number; i++) {
            // Check if i is a factor of the given number
            if (number % i != 0) {
                // If not, continue to the next iteration
                continue;
            }

            // Update the factor variable to the current factor i
            factor = i;

            // Reduce the given number by dividing it by i as many times as possible
            while (number % i == 0) {
                number /= i;
            }
        }

        // Check if all prime factors have been found
        // If true, return the largest prime factor (stored in the 'factor' variable)
        // If false, return the remaining prime number
        return number == 1 ? factor : number;
    }




}