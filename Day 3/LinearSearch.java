
class LinearSearch {

    public static void main(String args[]) {
        int arr[] = {1, 34, 23, 21, 34, 22, 34, 78};

        int num = 45;
        boolean isFound = false;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == num) {
                System.out.println("Number found at index no : " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Number not found");
        }
    }
}
