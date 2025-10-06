public class Binary_search {
public int searching(int arr[], int target){
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return -1;
}

      
    
    public static void main(String[] args) {
        int arr3[] ={1,3,5,7,9,11,13,15,17,18,19};
     
     
        Binary_search sp=new Binary_search();
        int result= sp.searching(arr3,18);
        System.out.println(result);
    }
}