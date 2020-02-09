import java.util.*;


public class string {
    
    
    private char[] stringT0Char(String in){  // method to convert string to character
        char[] arr = new char[in.length()];
        for(int i=0; i<in.length(); i++){
            arr[i]= in.charAt(i);
        }
        System.out.println("Character array of String "+in+" is: "+Arrays.toString(arr));
        
      return arr;
    }
    private void indexOfString(String in){   //finding index of string
        char[] arr = new char[in.length()];
        for(int i=0; i<in.length(); i++){
            arr[i]= in.charAt(i);
        }
        
        for(int j=0;j<in.length();j++){
            System.out.println("At "+j+" index of String: "+in+" is character "+arr[j]);
        }
    }
    private void findString(String in,String token){
        int lenoftoken= token.length();
        int count=0;
        String found = null;
        char[] arrofin = new char[in.length()];   // array of target string
        for(int i=0; i<in.length(); i++){
            arrofin[i]= in.charAt(i);
        }
        char[] arroftoken = new char[token.length()];   // array of token string
        for(int i=0; i<token.length(); i++){
            arroftoken[i]= token.charAt(i);
        }
        if(in.contains(token)){
           System.out.println(token +" is found in "+in);
       }
       else{
           System.out.println(token+" not found 404 ");
       }
        for(int i=0; i<in.length();i++){
            for(int j=0; j< token.length();j++){
                if(arrofin[i] == arroftoken[j]){
                    //lenoftoken--;
                    System.out.println("character "+token.charAt(j)+ " is found at "+i+" of "+in);
                  //  System.out.println(i +" "+j);                  
            }
                else{
                    
                }
        } 
        }
    }
    public static void main (String args[]){
        string s = new string();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input1 = scan.nextLine();
        System.out.println("String entered by the user is: "+input1);
        s.stringT0Char(input1);
        s.indexOfString(input1);
        System.out.println("Enter the String: ");
        String input2 = scan.nextLine();
        System.out.println("String entered by the user is: "+input2);
        s.stringT0Char(input2);
        s.indexOfString(input2);
        String concat = input1.concat(input2);
        System.out.println("Concated string is: "+concat);
        System.out.println("What do you want to find in "+input1+" ?");
        String input3 = scan.nextLine();
        s.findString(input1, input3);
        
    }
    
}
