import java.util.*;
class calculations{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first integer");
int a  = sc.nextInt();
System.out.println("enter another Integer");
int b = sc.nextInt();
System.out.println("enter last integer");
int c = sc.nextInt();

int Operator1 = (a+(b*c));
System.out.println("(a+(b*c) = " + Operator1);
int Operator2 = ((a *b) +c);
System.out.println("(a*b)+c) = " + Operator2);
int Operator3 = (c+(a/b));
System.out.println("(c +(a/b) = " + Operator3);
int Operator4= ((a%b)+c);
System.out.println("((a%b)+c) = " + Operator4);
	}
}


