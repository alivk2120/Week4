import java.util.Scanner;
class Rotation{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={23,45,67,89,54,32,37};
    System.out.println("Enter the number");
    int num=s.nextInt();
    if(num<arr.length){
    for(int i=0;i<num;i++){
      int temp=arr[0];
      for(int j=0;j<arr.length-1;j++){
        arr[j]=arr[j+1];
      }
      arr[arr.length-1]=temp;
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ " ");
    }
    }
    else{
      System.out.println("Enter a valid number");
    }
  }
}