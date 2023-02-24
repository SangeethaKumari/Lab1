/**
 * A interface to design a Ring like ADT
 */
public interface RingInterface<T> {

	/**
	 * This method advances to the next entry in the Ring ADT.
	 * If the current entry is at last index, the method will refer to 
	 * the first entry.
	 * 
	 * @return int - index value of the next entry in the Ring ADT
	 */
	public int advance();

	/**
	 * This method gets the currentElement or entry in the ADT
	 * 
	 * @return anEntry the value at the current element
	 */
	public T getCurrentElement();

	/**
	 * This method adds a new entry value in the ADT
	 * at the end of all the entries.
	 * If last entry is reached, this method checks for empty space from the first entry.
	 * If there is no empty space available , this method will not add the input entry.
	 * 
	 * @param newEntry - The object to be added as a new  entry 
	 * in the ADT
	 * @ returns boolean - true if the entry object is successfully added if not false
	 * 
	 */
	public boolean add(T newEntry);

	/**
	 * This method removes the value at the given index value
	 * 
	 * @param index - the index at which the entry value is to be removed
	 * @returns - entry , returns the entry object at the index or null 
	 */
	public T remove(int index);

	/**
	 * This method removes one occurrence of the given entry.
	 * 
	 * @param anEntry - the entry to be removes
	 * @return boolean, true if removing the entry was successful or false if not
	 */
	public boolean remove(T anEntry);

}
