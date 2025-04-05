
class InsertionInArrayAtBegining {

    public static void main(String args[]) {
        int arr[] = new int[10];
        int num=0;

        int size = 5;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int i=size ; i>0 ;i--){
            arr[i] = arr[i-1];
        }

        arr[0] = num;

        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i]+",");
        }

    }
}


class InsertionInArrayInBetween {

    public static void main(String args[]) {
        int arr[] = new int[10];
        int num=3;
        int position=3;

        int size = 5;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        for(int i=size ; i>=position;i--){
            arr[i] = arr[i-1];
        }

        arr[position-1] = num;
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i]+",");
        }

    }
}


class InsertionInArrayAtTheEnd {

    public static void main(String args[]) {
        int arr[] = new int[10];
        int num=6;
        int position=6;

        int size = 5;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        arr[position-1] = num;
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i]+",");
        }

    }
}
