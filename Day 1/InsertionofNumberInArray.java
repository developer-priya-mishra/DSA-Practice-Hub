class InsertionAtBeg {
    public static void main(String args[]) {
        int num = 0;
        int[] arr = new int[10];
        int size = 5;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = num;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
