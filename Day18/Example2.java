public class Example2 {
        
    public static void main(String[] args) {
        
        StringBuilder str=new StringBuilder("welComE 824867 ^$$%^% to BITlABS");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++) {
 
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
              
                sb.append((char)(str.charAt(i)+32));
            }
            else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
                sb.append((char)(str.charAt(i)-32));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
        
        
         
    }
               
}