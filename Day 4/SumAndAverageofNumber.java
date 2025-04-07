class SumAndAverageofNumber{
    public static void main(String args[]){
        int arr[]={2,3,33,23,3,32,3,4,3,54,2,1};
        int sum=0;
        int length=arr.length;

        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }

        int average = sum / length;

        System.out.println("Sum of array is "+sum+" and average is "+average);
    }
}