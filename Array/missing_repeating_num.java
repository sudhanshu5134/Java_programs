public class missing_repeating_num {
    void find_miss_rep_num(int arr[]){
        int n=arr.length;
        long s=0,p=0;
        for(int x:arr){
            s+= x;
            p+= x*x;
        }
        long Sn = (long)n*(n+1)/2;
        long Pn = (long)n*(n+1) *(2*n+1)/6;
        
        long diff = s - Sn;
        long diffsq = p -Pn;

        long sum = diffsq/diff;

        long repeating = (diff+sum)/2;
        long missing = repeating - diff;

        System.out.println("repeating num : "+ repeating+" missing num : "+ missing);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,3,5,4};
        missing_repeating_num sp = new missing_repeating_num();
        sp.find_miss_rep_num(arr);
    }
}
