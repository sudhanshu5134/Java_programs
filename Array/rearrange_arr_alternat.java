public class rearrange_arr_alternat {
    void rearrange (int[]arr){
        int n =arr.length;
        int []pos= new int[n];
        int []neg = new int[n];
        int p=0,s=0;

        for(int num:arr){
            if (num>=0) pos[p++]=num;
            else{
                neg[s++]=num;
            }
        }
        //rearrange
        int i=0,j=0,k=0;
            while(i<p&&j<s){
            arr[k++]=pos[i++];
            arr[k++]=neg[j++];
        }
        //remaining
        while(i<p){
           arr[k++]=pos[i++];
        }
        while(j<s){
            arr[k++]=neg[j++];
        }
         for(int x :arr){
                System.out.print(x +" ");
            }
           System.out.println();
    
   
           
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,-4,-1,4,-5,-6,5};
            rearrange_arr_alternat sp=new rearrange_arr_alternat();
           sp.rearrange(arr);
            
        }
    }
