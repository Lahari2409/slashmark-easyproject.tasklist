import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class todolist{
private static List<String> currentlist=new ArrayList<>();
public static void main(String[] args){
int menuitem=-1;
while(menuitem!=0){
menuitem=menu();
switch(menuitem){
case 1:
showlist();
break;
case 2:
additem();
break;
case 3:
removeitem();
break;
case 0:
break;
default:
System.out.println("enter a valid option");
}
}
}
public static int menu(){
System.out.println();
System.out.println("-----------------------------");
System.out.println("main menu");
System.out.println("-----------------------------");
System.out.println("0 exit the program");
System.out.println("1 display to-do-list");
System.out.println("2 add item to list");
System.out.println("3 remove item from list");
System.out.println();
System.out.println("enter choice");
Scanner scanner=new Scanner(System.in);
int choice=scanner.nextInt();
return choice;
}
public static void showlist(){
System.out.println();
System.out.println("-----------------------------");
System.out.println("to do list");
System.out.println("-----------------------------");
int number=0;
for(String item:currentlist){
System.out.println(++number+" "+item);
}
System.out.println("-----------------------------");
}
public static void additem(){
System.out.println("add item");
System.out.println("-----------------------------");
System.out.println("enter an item");
Scanner scanner=new Scanner(System.in);
 String item=scanner.nextLine();
currentlist.add(item);
showlist();
}
public static void removeitem(){
System.out.println("remove item");
System.out.println("-----------------------------");
Scanner scanner=new Scanner(System.in);
System.out.println("what do you want to remove?");
int index=scanner.nextInt();
if((index-1)<0||index>currentlist.size()){
System.out.println("wrong index number please enter in range of 1 to "+currentlist.size());
}
else{
currentlist.remove(index-1);
}
System.out.println("-----------------------------");
showlist();
}
}