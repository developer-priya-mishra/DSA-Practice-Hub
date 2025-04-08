class SecondLargestElement{
    public static void main(String args[]){
        int arr[]={32,45,24,1,2,32,23,11,10,67};
        int largestELement=arr[0];
        int secondlargestElement=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestELement) {
                secondlargestElement = largestELement;
                largestELement = arr[i];
            }
        }

        System.out.println("Second Largest element is : "+secondlargestElement);

    }
}