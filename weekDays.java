import java.util.Scanner;
public class weekDays{
public static void main(String[] args){
Scanner read=new Scanner(System.in);
int d=read.nextInt();
System.out.println("enetr no of days: ");
int y=d/365;
int w=(d%365)/7;
int D=(d%365)%7;
System.out.println("no of years:"+y);
System.out.println("no of weeks:"+w);
System.out.println("no of days:"+D);
}}
