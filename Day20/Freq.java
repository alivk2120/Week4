class Freq{
  public static void main(String args[]){
    String str="mnnmnk";
    int count=0,cnt=0;
    for(int i=0;i<str.length();i++){  
      for(int j=i+1;j<str.length();j++){  
        if(str.charAt(i)==str.charAt(j)){   
          count++;
        }
      }
      if(count==str.length()-(count+2)){
        cnt++;
        break;
      }
      count=0;
    }
    if(cnt==0){
      System.out.println("This is not correct string");
    }
    else{
      System.out.println("This is corect string");
    }
  }
}