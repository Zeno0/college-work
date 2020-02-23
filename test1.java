 import java.util.Scanner;


public class test1{
    char arr[] ;
    int length;
    // Constructor
    public test1(String x){
        arr = new char[x.length()];
    }
    // calculate length method
    public void calclenght(String x){
        System.out.println("Here custom method is used. ");
        for(int i=0; i<x.length();i++){
            arr[i]= x.charAt(i);
             }
        System.out.println("Length of String "+x+" is: ");
        for(int i=0; i<x.length();i++){
            length++;
            }
        System.out.println(length);
        } // close method
    // main
    public static void main (String args[]){
   
        System.out.println("please enter whatever you want in one line ");
        Scanner scan = new Scanner(System.in);
       String x = scan.nextLine(); 
       test1 t =new test1(x);
        System.out.println("String entered by the user is "+x);
        t.calclenght(x);  // method invoked
        System.out.println("Lenght of String by using in-built function: "+x.length());
    }
}
