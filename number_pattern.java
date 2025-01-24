public class number_pattern {
    public static void main(String[] args) {
        int num = 8;
        int arr[][] = new int[num][];
        for (int i = 0; i < num; i++) {
            arr[i] = new int[i + 1];
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/**
 * 1
 * 1 0
 * 1 0 1
 * 1 0 1 0
 */
