import java.util.Scanner;
public class stack implements stackFace{
	
	private int maxsize;
	private String[] list;
	private int top;
	private Scanner sc;
	
	
	stack() {
	top=0;
	System.out.println("Enter the size of the stack");
	sc = new Scanner(System.in);
	maxsize = sc.nextInt();
	list= new String[maxsize];
	
	
	}
	
	
	
	public boolean isFull() {
		
		return(top==maxsize); 
		
		
	}
	
	
	public boolean isEmpty() {
		
		return(top==0);	
	}
	
	public void peek()
	{
		System.out.println(list[top]);
		
	}
	
	public void push(String value)
	{
		if (isFull()==false)
		{
		list[top]=value;
		top=top+1;
		}

		else {
			System.out.println("The stack is full");
		}

	}
	
	public void pop()
	{
		if (isEmpty()==false)
		{	
			System.out.println(list[--top]);
		}

		else {
			System.out.println("The stack is empty");
		}
	}
	
	
	
}
