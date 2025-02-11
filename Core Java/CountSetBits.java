public class CountSetBits {
    
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            // Increment the count if the least significant bit is 1
            count += (n & 1);
            // Right shift n by 1 to check the next bit
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        // Test cases
        int n1 = 6;
        int n2 = 8;
        int n3 = 3;

        System.out.println("Count of set bits in " + n1 + " is: " + countSetBits(n1)); // Output: 2
        System.out.println("Count of set bits in " + n2 + " is: " + countSetBits(n2)); // Output: 1
        System.out.println("Count of set bits in " + n3 + " is: " + countSetBits(n3)); // Output: 2
    }
}
