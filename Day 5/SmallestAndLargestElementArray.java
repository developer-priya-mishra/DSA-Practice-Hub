class SmallestAndLargestElementArray{
    public static void main(String args[]){
        int arr[]={32,45,24,1,2,32,23,11,10,67};
        int smallestElement=arr[0];
        int largestElement=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestElement) {
                smallestElement = arr[i];
            }else if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }

        System.out.println("Largest element is : "+largestElement);
        System.out.println("Smallest element is : "+smallestElement);

    }
}