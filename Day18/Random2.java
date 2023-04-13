java Ranomimport java.util.Random;
import java.util.Scanner;
class Random2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Random random=new Random();
    int range=100;
    String str2="Paper";
    String str3="Scissors";
    int str=random.nextInt(range);
    System.out.println(str);
  }
}