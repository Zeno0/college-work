import java.util.Scanner;


public class test3{
    char arr1[] ;
    char arr2[];
   //Constructor
    public test(String x,String y){
        arr1 = new char[x.length()];
        arr2 = new char[y.length()];
    }
    // To Convert String to Array method
    public char[] stringT0Char(String in){ 
        char[] arr = new char[in.length()];
        for(int i=0; i<in.length(); i++){
            arr[i]= in.charAt(i);
        }
       return arr;
    }
    // Compare method
    public int compare(String x,String y ){
       System.out.println("Here custom Method is used: ");
       arr1 = stringT0Char(x);
       arr2 = stringT0Char(y);
       int min = Math.min(arr1.length, arr2.length);
       for(int i=0; i<min;i++){
           int x_ch =(int) x.charAt(i);
           int y_ch =(int) y.charAt(i);
           if(x_ch != y_ch){
               return x_ch-y_ch;
           }
       }
       if(arr1.length != arr2.length){
           return arr1.length - arr2.length;
       }
       else{
           return 0;
       }
    }
    // main
    public static void main (String args[]){
       System.out.println("please enter whatever you want in one line ");
       Scanner scan = new Scanner(System.in);
       String x = scan.nextLine(); 
       System.out.println("Once again please enter whatever you want in one line ");
       String y = scan.nextLine(); 
       test t =new test(x,y);
       System.out.println("String entered by the user is "+x+" and "+y);
      
       System.out.println("String 1 and 2 are compared "+ t.compare(x, y));  // invoke method

       System.out.println("Now in-built function is used: ");
       System.out.println("Compare '"+x+"' and '"+y+"' "+x.compareTo(y));
       
    }
}
