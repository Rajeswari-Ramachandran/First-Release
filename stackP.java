package arrayMatrix;

public class stackP {
	char stackElement[]= new char[3];
	int tos;
	public stackP()
	{
		tos=-1;
	}
public void push(char item)
{
	if(tos==2)
	{
		System.out.println("Stack is full");
	}
	else
	{
		stackElement[++tos]=item;
	}
}
public char pop()
{
if(tos>=0)
{
	return stackElement[tos--];
	}
else
{
	System.out.println("Stack is Empty");
	return 0;
}
}
}
