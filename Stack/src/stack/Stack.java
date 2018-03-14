/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author marcin7500
 * @param <T>
 */
public interface Stack<T> 
{
    public boolean isEmpty();
    public void pop() throws StackUnderflowException;
    public void push(T item);
    public T top() throws StackUnderflowException;
    
    /**
     *
     * @return
     */
    @Override
    public String toString();     
}
