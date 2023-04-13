import java.util.Scanner;
class Numbers{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={34,45,5,6,765,43,34};
    System.out.println("Enter the number");
    int num=s.nextInt();
    
    for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
      int sum=arr[i]+arr[j];
      if(sum==num){
        System.out.println("the number is in "+i+" and "+j+" index position");
      }
    }
    }
  }
}