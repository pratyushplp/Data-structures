import java.util.Scanner;
public class queue implements queueFace{
	
//3 MAIN CONCEPTS IN QUEUE , IF QUEUE IS EMPTY, IF THE QUEUE IS SINGLE VALUED,IF qQUEUE IS NON EMPTY AND NON SINGLE VALUED
// reason for putting -1 is that i shows that the queue is empty, if we had put 0 then it would have showed single valued queue	
	private int maxsize;
	private String[] list;
	private int front;//deletion performed here
	private int tail;//insertion performed here
	private Scanner sc;
	
	
	queue() {
	front=tail=-1;
	System.out.println("Enter the size of the queue");
	sc = new Scanner(System.in);
	maxsize = sc.nextInt();
	list= new String[maxsize];
	
	
	
	}
	
	
	
	public boolean isFull() {
		
		return(tail==maxsize-1); 
		
		
	}
	
	
	public boolean isEmpty() {
		
		return(front==-1&&tail==-1) ;	
	}
	
	public void peek()
	{
		System.out.println(list[front]);
		
	}
	
	public void enqueue(String value)
	{
		if (isFull()==true)
		{
			System.out.println("The stack is full");

		}
		
		else if (isEmpty()==true)
		{
			front=tail=0;
			list[tail]=value;
		}
		 
		else {
			list[++tail]=value;

		}

	}
	
	public void dequeue()
	{
		if (isEmpty()==true)
		{			
			System.out.println("The stack is empty");
	}

		else if (front==tail){// for single element queue
			
			

			System.out.println(list[front]);
			front=tail=-1;
			
			front++;
		}
		
		
		else {
			
			System.out.println(list[front]);
			front=front+1;
		}
		
	}
	
	
	
}

