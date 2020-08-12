import java.util.Scanner;
 
class StackMethods
{
     int top, size, len;
    public StackMethods(int n)
    {
        size = n;
        len = 0;
        String[] arr = new String[size];
        top = -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public String peek()
    {
        if( isEmpty() )
            System.out.println("Underflow Exception");
        return arr[top];
    }
    public void push(String s)
    {
        if(top + 1 >= size)
            System.out.println("Overflow Exception");
        if(top + 1 < size )
            arr[++top] = s;
        len++ ;
    }
    public String pop()
    {
        if( isEmpty() )
          System.out.println("Underflow");
        len-- ;
        return arr[top--]; 
    }    
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }    
}
 
public class Stack
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        int n = 5;
        StackMethods stk = new StackMethods(n);
        char ch;
        while(true){
            System.out.println("\nEnter 1 for Push\nEnter 2 Pop\nEnter 3 top element\nEnter 4 for isEmpty\nEnter 5 for display\nEnter 6 for Exit");  
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter String element to push");
               stk.push( scan.next() );
                break;                         
            case 2 : 
                 System.out.println("Popped Element from the stack = " + stk.pop());
                break;                         
            case 3 :         
                   System.out.println("Peek Element of your stack = " + stk.peek());
                break;                         
            case 4 : 
                System.out.println("Empty status of your stack = " + stk.isEmpty());
                break; 
            case 5:
            	stk.display();break;
            case 6:
            	System.exit(0);
            default : 
                System.out.println("Please enter valid entry \n ");
                break;
            }
        }               
    }
}
