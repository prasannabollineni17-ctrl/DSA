//Implementing Selection Sort Alogirithm(to sort an Array)
class Main{
  void selection_Sort(int[] arr){
    int n=arr.length;
    for(int i=0;i<=n-2;i++){
      //finding minimum
      int min_index=i;
      for(int j=i;j<=n-1;j++){
        if(arr[j]<arr[min_index])  {
          min_index=j;
        }
      }
      //Swapping
      int temp=arr[i];
      arr[i]=arr[min_index];
      arr[min_index]=temp;
    }
  }
  public static void main(String[] args){
    int arr={7,5,6,4,3,8,9};
    selection_Sort(arr);
  }
}
