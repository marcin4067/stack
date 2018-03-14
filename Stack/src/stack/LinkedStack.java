/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author marcin7500
 */
public class LinkedStack<T> implements Stack<T>
{
    private ListNode<T> top;
    
    public LinkedStack()
    {
        top = null;
    }
    
    public boolean isEmpty()
    {
        return top == null;
    }
    
    @Override
    public T top()
    {
        if (isEmpty())
        {
            throw new StackUnderflowException();
        }
        return top.getitem();
        
    }
    @Override
    public void pop()
    {
        if (isEmpty())
        {
            throw new StackUnderflowException();
        }
        top = top.getNext();
    }
    
    @Override
    public void push(T item)
    {
        top = new ListNode<>(item, top); 
    }
    
    public String toString()
    {
        String result = "LinkedStack: size = "+size();
        result += ", contents = {" ;
        for(ListNode<T> node = top; node != null; node = node.getNext())
        {
            if(node !=top)
            {
                result +=", ";
            }
            result += node.getitem();
        }
        result += "}. isEmpty() = "+isEmpty();
        if(!isEmpty())
        {
            result +=", top() = "+top();
        }
        return result;
    }
    
    private int size()
    {
        ListNode<T> node = top;
        int result = 0;
        while (node!= null)
        {
            result = result +1;
            node = node.getNext();
        }
        return result; 
    }
}
