public class MinMaxValue {
     public int[] minmax(int []arr){
         int min = arr[0];
         int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return new int[] {min, max};
         
    }
    public static void main(String[] args) {
        int []arr = {2,4,5,7,44,67,3,5,886,38,4,675};
        MinMaxValue sp = new MinMaxValue();
        int[] result = sp.minmax(arr);
        System.out.println("min: " + result[0] + ", max: " + result[1]);
    }
}
