class FrequencyofNumInArray{
    public static void main(String args[]){
        int arr[]={2,3,33,23,3,32,3,4,3,54,2,1};
        int num=3;
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count ++;
            }
        }

        System.out.println("Frequency of "+num+" number is "+count);
    }
}