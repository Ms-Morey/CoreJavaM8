public class ThreeDimensionalArrayExample {
    public static void main(String[] args) {
        // Initializing a 3D array
        int[][][] arr = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // Printing using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // Printing using while loop
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                int k = 0;
                while (k < arr[i][j].length) {
                    System.out.print(arr[i][j][k] + " ");
                    k++;
                }
                System.out.println();
                j++;
            }
            i++;
        }

        // Printing using do-while loop
        System.out.println("\nUsing do-while loop:");
        i = 0;
        do {
            int j = 0;
            do {
                int k = 0;
                do {
                    System.out.print(arr[i][j][k] + " ");
                    k++;
                } while (k < arr[i][j].length);
                System.out.println();
                j++;
            } while (j < arr[i].length);
            i++;
        } while (i < arr.length);

        // Printing using foreach loop
        System.out.println("\nUsing foreach loop:");
        for (int[][] twoDArray : arr) {
            for (int[] oneDArray : twoDArray) {
                for (int element : oneDArray) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
}
