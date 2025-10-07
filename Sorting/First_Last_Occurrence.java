public class First_Last_Occurrence {
    public static int FirstOccurence(int []arr,int target){
        int start =0;
        int end = arr.length-1;
        int first =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) {
                first = mid;
                end = mid-1;
            }
            else if (arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        return first;
    }
    public static int LastOccurence(int []arr,int target){
        int start =0;
        int end = arr.length-1;
        int last =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) {
                last = mid;
                start = mid+1;
            }
            else if (arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        return last;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,4,4,4,4,4,4,5};
        int first = FirstOccurence(arr, 4);
        int last = LastOccurence(arr, 4);
        System.out.println("["+first +","+ last +"]");
    }
}
