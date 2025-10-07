public class Search_rotated_sorted_arr {
    public int sorting(int arr[],int start,int end,int target){
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target) return mid ;

            if (arr[start]<=arr[mid]){
                if (arr[start]<= target && target<=arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            if (arr[mid]<=arr[end]){
                if (arr[mid]<= target && target<=arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[]= {5,6,7,0,1,2,3,4,5};
        Search_rotated_sorted_arr sp = new Search_rotated_sorted_arr();
        int result=sp.sorting(arr, 0, arr.length-1, 4);
        System.out.println(result);
    }
}
