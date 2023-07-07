import java.util.*;
class Wd3
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	Stack st = new Stack();
	System.out.print("Enter no.of push and operations to be performed : ");
	int op = sc.nextInt();
	while(op>0)
        {
	   System.out.print("Enter operation to be performed (push/pop) : ");
	   String s = sc.next();
	   if(s.equals("push"))
	   {
	      System.out.print("Enter the data to be pushed : ");
	      int data = sc.nextInt();
	      if(st.isFull())
              {
		 System.out.println("Stack is full!!");
              }
	      else
	      {	
		 st.setIndex(st.getIndex()+1);
		 st.push(data);
              }
	   }
	   else
	   {
	      if(st.isEmpty())
	      {
		 System.out.println("Stack is Empty!!");
	      }
	      else
	      {
		 System.out.println(st.pop());
		 st.setIndex(st.getIndex()-1);
	      }
	   }
           op--;
        }
    }
}

class Stack
{
    private int[] s = new int[10];
    private int index=-1;
    public boolean isFull()
    {
	return index==9; 
    }
    public boolean isEmpty()
    {
	return index==-1; 
    }
    public void push(int data)
    {
	s[index]=data;
    }
    public void setIndex(int index)
    {
	this.index=index;
    }
    public int getIndex()
    {
	return index;
    }
    public int pop()
    {
	return s[index];
    }
}
