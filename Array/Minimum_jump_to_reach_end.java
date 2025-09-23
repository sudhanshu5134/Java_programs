public class Minimum_jump_to_reach_end {
    int Min_jump (int []arr){
        int farthest = 0;
        int end =0;
        int jump =0;
        int n = arr.length;

        for(int i =0;i<n-1;i++){
            farthest = Math.max(farthest, i+arr[i]);
            if(i==end){
                jump++;
                end=farthest;
            }
            if(end>=n-1){
                break;
            }
           
        } return jump;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,0,0,2,0,4};
        Minimum_jump_to_reach_end sp =new Minimum_jump_to_reach_end();
        System.out.println("Minimum number of jump to reach end : "+ sp.Min_jump(arr));
    }
}
