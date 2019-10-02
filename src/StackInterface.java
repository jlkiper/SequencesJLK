/**
 * StackInterface.java
 * 
 * This interface returns a string representation of all of the data for an object. 
 * 
 * @author Jaylon Kiper
 * @version 1.0
 * Programming Project 2
 * FALL19
 */
public interface StackInterface<T> {
	
	/** Adds a new entry to the top of the stack.
	 * 
	 * @param newEntry An object to be added to the stack.
	 */
	public void push(T newEntry);
	
	/** Removes and returns this stack's top entry.
	 * 
	 * @return The object at the top of the stack.
	 * @throws EmptyStackException if the stack is empty before the operation.
	 */
	public T pop();
	
	/** Retrieves this stack's top entry.
	 * 
	 * @return The object at the top of the stack.
	 * @throws EmptyStackException if the stack is empty.
	 */
	public T peek();
	
	/**	Detects whether this stack is empty.
	 * 
	 * @return True is the stack is empty.
	 */
	public boolean isEmpty();

	/** 
	 * Removes all entries from this stack. 
	 */   
	public void clear();
	
}//end interface