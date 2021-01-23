package com.sample.DS;

public class Queue_Using_Stack {
	static class Queue { 
        Stack stack1 = new Stack(5); 
        Stack stack2 = new Stack(5); 
    }
	
/*	  Function to push an item to stack
    static void push(Stack top_ref, int new_data) 
    { 
        // Push the data onto the stack 
        top_ref.push(new_data); 
    } 
    
     Function to pop an item from stack
    static int pop(Stack top_ref) 
    { 
        If stack is empty then error 
        if (top_ref.isEmpty()) { 
            System.out.println("Stack Underflow"); 
            System.exit(0); 
        } 
  
        // pop the data from the stack 
        return top_ref.pop(); 
    } */
    
 // Function to enqueue an item to the queue 
    static void enQueue(Queue q, int x) 
    { 
    	//Push the item to stack 1 directly
        //push(q.stack1, x); 
    	q.stack1.push(x);
    } 
    
    /* Function to deQueue an item from queue */
    static int deQueue(Queue q) 
    { 
        int x; 
  
        /* If both stacks are empty then error */
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) { 
            System.out.println("Q is empty"); 
            System.exit(0); 
        } 
  
        /* Move elements from stack1 to stack 2 only if 
        stack2 is empty */
        if (q.stack2.isEmpty()) { 
            while (!q.stack1.isEmpty()) { // copy all contents from stack1 to stack 2
             //   x = pop(q.stack1); 
             //   push(q.stack2, x); 
            	x=q.stack1.pop();
            	q.stack2.push(x);
            } 
        } 
      //  x = pop(q.stack2); 
        x=q.stack2.pop();
        return x; 
    } 
  
    public static void main(String args[]) 
    { 
        /* Create a queue with items 1 2 3*/
        Queue q = new Queue(); //FIFO
     //   q.stack1 = new Stack(); 
      //  q.stack2 = new Stack<>(); 
        enQueue(q, 1); 
        enQueue(q, 2); 
        enQueue(q, 3); 
  
        /* Dequeue items */
        System.out.print(deQueue(q) + " "); 
        System.out.print(deQueue(q) + " "); 
        System.out.println(deQueue(q) + " "); 
    } 
}
