public class Find_sqrt_BinarySearch {
    private static int Finding_sqrt(int num){
        int low=0;
        int high=num;
        int ans=1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if ((mid*mid)<=num){
                low=mid+1;
                ans=mid;
            }
            else{high=mid-1;}
        }
        return ans;
    }
    public static void main(String[] args) {
        int result = Finding_sqrt(28);
        System.out.println(result);
    }
}
