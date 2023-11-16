
public class numbers {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;	// Display 10 numbers per line
		int count = 0;	// Count the number of numbers divisible by 5 and 6

		// Test all numbers from 100 to 1,000
		for (int i = 100; i <= 1000; i++) {
			// Test if number is divisible by 5 and 6
			if (i % 5 == 0 && i % 6 == 0) {
				count++;	// increment count
				// Test if numbers per line is 10
				if (count % NUMBERS_PER_LINE == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
		}

    }

}

class numbers2{
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;	// Number of numbers in each line displayed
		int count = 0; // Count the number divisible by 5 or 6, but not both

		for (int i = 100; i <= 200; i++) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				count++;
				if (count % NUMBERS_PER_LINE == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");			
			}
		}
		System.out.println();
    }
}