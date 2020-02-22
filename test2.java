 import java.util.Scanner;
 public class test2{
    char arr[] ;
    char c_arr[];
    
   // Constructor
    public test(String x){
        arr = new char[x.length()];
    }
    // concat method
    public void concat(String x,String y ){
        int pos=0;
        System.out.println("Here custom method is used. ");
        c_arr = new char[x.length()+y.length()];
        char temp[] = new char[y.length()];
        for(int i=0; i<x.length();i++){
             arr[i]= x.charAt(i);
        }
        for(int i=0; i<y.length();i++){
              temp[i]= y.charAt(i);
        }
       for(char e: arr){
           c_arr[pos]=e;
           pos++;
       }
       for(char e: temp){
           c_arr[pos]=e;
           pos++;
       }
       System.out.println("Concated String of "+x+" and "+y+" is: "+new String(c_arr));
       
    }// close method
    // main
    public static void main (String args[]){
   
        System.out.println("please enter whatever you want in one line ");
        Scanner scan = new Scanner(System.in);
       String x = scan.nextLine(); 
       test t =new test(x);
       String y = "whatever";
        System.out.println("String entered by the user is "+x);
        t.concat(x, y);   // method invoked
        System.out.println("Concat of String by using in-built function: "+x.concat(y));
    }
}
