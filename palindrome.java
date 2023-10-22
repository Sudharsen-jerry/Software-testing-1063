import java.util.Scanner;
public class palindrome{
public static void main(String[] args){
int n;
Scanner read=new Scanner(System.in);
System.out.println("enetr num: ");
n=read.nextInt();
int reversednum=0,originalnum=n;
while(n!=0){
int rem=n%10;
reversednum=reversednum*10+rem;
n=n/10;}
if(originalnum==reversednum){
System.out.println("palindrome");}
else{
System.out.println("not palindromw");
}}}