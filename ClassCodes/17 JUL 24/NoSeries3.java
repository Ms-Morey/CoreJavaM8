//2 6 22 278 65814 65814 65814 65814 65814 65814
class NoSeries3 {
    public static void main(String[] args) {
        int num = 2;
        long sum = 2;
        int sqr = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(sum + " ");
            sqr = num * num;  // Calculate the square of num
            sum = sum + sqr;  // Update sum by adding the square of num
            num = sqr;        // Update num to the square of itself
        }
    }
}
