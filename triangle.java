public class triangle {
    public static void shape(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 2 * h - 1; j++) {
                if (j >= h - i - 1 && j <= h + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        shape(8);
        // if("gdgd".compa)
    }
}
