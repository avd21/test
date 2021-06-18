package CO_4;

import java.util.Scanner;

class stack{
	int top=-1;
	
void push(int arr[],int n) {
	int val;
	if (top>=n-1)
	{
		System.out.println("**Overflow**");
	}
	else
	{
		System.out.println("Enter the value to push:");
		Scanner s = new Scanner(System.in);
		val = s.nextInt();
		top=top+1;
		arr[top]=val;
	}
}
void pop(){
	if(top<0)
	{
		System.out.println("***Underflow***");
	}
	else
	{
		top=top-1;
		System.out.println("*Element Popped*");
	}
}
void show(int arr[]) {
	if(top<0) {
		System.out.println("!!Stack is Empty!!");
	}
	else
	System.out.println("\nDisplay stack Elements: ");
	for(int i=top;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	
}

}
public class co_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n=sc.nextInt();
		int arr[] = new int[10];
		 stack obj=new stack();
		while(ch<4) {
			Scanner sc2=new Scanner(System.in);
			System.out.println("\n***Menu***\nChoose the Option ");
			System.out.println("1.Push:\n2.Pop:\n3.display ");
			ch=sc2.nextInt();
			switch(ch) {
			case 1:{
				obj.push(arr,n);
				break;}
			case 2:{
				obj.pop();
				break;}
			case 3:{
				obj.show(arr);	
				break;}
			 default:{
				 System.out.println("!Invalid choice!");
			 }
   
	}

}
}
}
	