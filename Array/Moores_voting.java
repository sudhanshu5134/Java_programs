public class Moores_voting {
    void find_candidate(int arr[]){
        int count=0;
        int candidate = 0;
        for(int num:arr){
            if(count == 0){
                candidate = num;
                count=1;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        // validating the majority
        count=0;
        for(int x : arr){
            if (candidate == x)

            {
                count++;
            }
        }
         if (count>arr.length/2){
            System.out.println(candidate);
         }else{
            System.out.println("no candidate got majority");
         } 
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3};
        Moores_voting sp=new Moores_voting();
        sp.find_candidate(arr);
    }
}
