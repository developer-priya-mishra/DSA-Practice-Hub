
class BinarySearch {

    public static void main(String args[]) {
        int arr[] = {1,2,34,54,56,67,78,85,99,102,2238};

        int num = 56;
        int low=0;
        int high=arr.length-1;
        boolean isFound = false;
        
        while (high>=low) { 
            int mid = (low + high)/2;
            if(arr[mid] == num){
                System.out.println("Number found at index no : "+ mid);
                isFound = true;
                break;
            }else if(arr[mid] > num){
                high = high -1;
            }else {
                low = low +1;
            }

        }
        

        if (!isFound) {
            System.out.println("Number not found");
        }
    }
}
