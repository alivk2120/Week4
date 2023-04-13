import java.util.Scanner;
class Prog2{
  Scanner s=new Scanner(System.in);
  int arr[]={23,45,20,40,66,60,54,10,80,70,53,68,92};
  
  

  public void Prob(){
    System.out.println("Enter the number");
    int num=s.nextInt();
    int count=0;
 for(int i=0;i<arr.length;i++){
   for(int j=i+1;j<arr.length;j++){
     int sum=arr[i]+arr[j];
     if(sum==num){
       System.out.println("The numbers are in "+i+" and "+j+" position");
       count++;
     }
   }
 }
    if(count==0){
      System.out.println("No outputs found");
    }
  
}
public static void main(String args[]){
  Prog2 obj=new Prog2();
  
  obj.Prob();
}
}