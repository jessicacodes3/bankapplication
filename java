// This Java banking application requests user input that includes requesting the user's bank account number, type of bank account (checking/savings), 
minimum balance, current balance, & then calculates interest accured on account.


import java.util.Scanner;
public class BankAcct {
    
public static void main (String [] args)
{int num,error=1,itype=0;
char type =0;
double mininmum;
double current =0;
double balance =0;
double rate=0;

Scanner in=new Scanner(System.in);
System.out.println("Enter account number: ");
num=in.nextInt();
while(error==1)
{
System.out.println("Enter account type(s-savings or c-checking):");
type=in.next().charAt(0);
if(type=='c'||type=='C')
{itype=1;
error=0;
rate=3/100.;
}
else if(type=='s'||type=='S')
{itype=0;
error=0;
rate=4/100.;
}
if(error==1)
System.out.println("Invalid type-re enter");
}
System.out.println("Enter minimum balance: ");
    double minimum = in.nextDouble();
System.out.println("Enter current balance: ");
current =in.nextDouble();
balance = current;
if(itype==1)
{ if(current > minimum +5000)
rate=5/100.;
else if(current < minimum +25);
}
else
if(current < minimum +10);
current = current +rate * current;
System.out.printf("After interest and fees your balance is = $%.2f\n",current);
System.out.println("Your account number: " + num);
System.out.println("Your account type: " + type);
System.out.printf("Your starting balance: $%.2f\n ", balance);
System.out.printf("Your new balance: $%.2f\n", current);
}
}
