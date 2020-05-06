import java.util.*;
public class test9 {
static ArrayList<List<String>> list = new ArrayList<List<String>>();
// list which contains all the process and its execution time
// method to execute process bu its time of execution
public static void printByExecTime(){
Collections.sort(list, new Comparator <List<String>>() {
public int compare(List<String> o1, List<String> o2) {
return Integer.valueOf(o1.get(1)).compareTo(Integer.valueOf(o2.get(1)));
}
});
for(int i=0; i< list.size(); i++){
System.out.println(list.get(i));
System.out.println("Executing process "+ list.get(i).get(0) + " as it's execution

time is "+ list.get(i).get(1));

}
}
public static void main (String args[]){
List<String> row1 = new ArrayList<String>();
row1.add("P1");
row1.add("5");
List<String> row2 = new ArrayList<String>();
row2.add("P2");
row2.add("3");
List<String> row3 = new ArrayList<String>();
row3.add("P3");
row3.add("15");
List<String> row4 = new ArrayList<String>();
row4.add("P4");
row4.add("7");
List<String> row5 = new ArrayList<String>();
row5.add("P5");
row5.add("13");
List<String> row6 = new ArrayList<String>();
row6.add("P6");
row6.add("9");
list.add(row1);
list.add(row2);
list.add(row3);
list.add(row4);
list.add(row5);
list.add(row6);
System.out.println("Printing initial list: ");
System.out.println(list);
printByExecTime();
System.out.println("Printing sorted list");
System.out.println(list);
}
}
