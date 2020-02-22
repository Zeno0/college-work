 import java.util.Scanner;

public class test0{
    char arr[] ;
  //Constructor
    public test(String x){
        arr = new char[x.length()];
    }
   //display method
    public void display(String x){
        for(int i=0; i<x.length();i++){
            arr[i]= x.charAt(i);
              }
        System.out.println("Character Array is: ");
        for(int i=0; i<x.length();i++){
            System.out.printf("%s,",arr[i]);
              }
       }  // method close

 // main   
 public static void main (String args[]){
   
        System.out.println("please enter whatever you want in one line ");
        Scanner scan = new Scanner(System.in);
       String x = scan.nextLine(); 
       test t =new test(x);
        System.out.println("String entered by the user is "+x);
        t.display(x);
    }
}
