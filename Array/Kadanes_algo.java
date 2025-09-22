public class Kadanes_algo {
    void MaxSubarraySum(int []arr){
       int maxsum =arr[0];
       int currentsum =arr[0];
       int start=0 ,end=0,s=0;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>currentsum +arr[i]){
                currentsum = arr[i];
                s=i;
            }else{
                currentsum += arr[i];
            }
        
        if(currentsum >maxsum){
            maxsum=currentsum;
            start=s;
            end=i;
        }
    }
    System.out.println("maxsum is :" + maxsum);
    for(int i=start;i<=end;i++){
        System.out.print(arr[i] + " ");
    }
    
    }
    public static void main(String[] args) {
        int []arr= { -2,1,3,4,-1,-2,1,5,4};
        Kadanes_algo sp = new Kadanes_algo();
        sp.MaxSubarraySum(arr);
        
    }
}
