import java.util.Scanner;

public class PrimeNumber{
public static void main(String args[]){
int i,n=0,result=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter the value:");
n=scan.nextInt();
for(i=2;i<=n/2;i++){
if(n%i==0){
System.out.println("Number is not Prime");
result=1;
break;
}
}
if(result==0)
System.out.println("Number is prime");
}
}


