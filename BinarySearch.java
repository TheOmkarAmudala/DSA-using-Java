public class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 2;
        BinarySearch(arr, target); 
    }

   static int BinarySearch(int[] arr, int target){
    int s = 0;
    int e = arr.length;
    while(s<= e){
        int mid = s + ((e - s)/2);
        if(arr[mid] == target){
            System.out.println(mid);
           return mid;
        }
        else if (arr[mid] > target){
             e = mid;
        }
        else{
            mid = s;
        }
          
    }
    return -1;
   }
}

