//Implementation of INsertion Algorithm(to sort an array)
class main{
  void insertion_Sort(int[] arr){
    int n=arr.length;
    // takes an element and place it in its correct position
    for(int i=0;i<n;i++){
      int j=i;
      while(j>0 && arr[j-1]>arr[j]){
        inr temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
        j--;
      }
    }
  }
  public static void main(String[] args){
    int[] arr={4,3,7,5,9,2};
    insertion_Sort(arr);
  }
}
