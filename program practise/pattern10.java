class pattern10{

    public static void main(String[] args) {
        int rows = 5;

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
