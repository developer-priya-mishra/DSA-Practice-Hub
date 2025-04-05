
class DeletionInArrayAtBegining {

    public static void main(String args[]) {
        int arr[] = new int[10];

        int size = 5;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        arr[0] =arr[4];
        arr[4]=0;

        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}

class DeletionInArrayInBetween {

    public static void main(String args[]) {
        int arr[] = new int[10];
        int position = 3;

        int size = 5;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 5;

        arr[2] =arr[4];
        arr[4]=0;

        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}

class DeletionInArrayAtTheEnd {

    public static void main(String args[]) {
        int arr[] = new int[10];

        int size = 5;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        arr[size - 1] = 0;
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
