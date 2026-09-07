//Implementing Bubble Sort Algorithm(to sort an Array)
class Main{
  void bubble_Sort(int []arr){
    int n=arr.length;
    //Bubble Sort pushes the max element to the last by adjacent swaps
    for(int i=n-1;i>=1;i--){
      for(int j=0;j<=i-1;j++){
        if(arr[j]>arr[j+1]){
          //swap
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  
  public static void main(String[] args){
    int[] arr={6,8,4,3,9,1};
    bubble_Sort(arr);
  }
}
