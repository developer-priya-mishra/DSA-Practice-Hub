class FrequencyofPositiveAndNegativeNumber{
    public static void main(String args[]){
        int arr[]={2,3,-33,23,-3,32,-3,4,-3,54,2,-1,0};
        int postiveNumberCount=0;
        int negativeNumberCount=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                postiveNumberCount++;
            }else{
                negativeNumberCount++;
            }
        }

        System.out.println("Frequency of positive number is "+postiveNumberCount+" and negative number is "+negativeNumberCount);
    }
}