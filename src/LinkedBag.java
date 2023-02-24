/**
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    @author Frank M. Carrano
    @version 4.0
*/
public final class LinkedBag<T> implements BagInterface<T>
{
    Node firstNode;
    int numberOfEntries;
    // Simple constructor
    public LinkedBag()
    {
        firstNode = null;
        numberOfEntries = 0;
    } // end default constructor
    /** Gets the number of entries currently in this bag.
    @return  The integer number of entries currently in the bag. */
    public int getCurrentSize()
    {
        return numberOfEntries;
    }  // end
    
    /** Sees whether this bag is empty.
    @return True if the bag is empty, false otherwise.
    */
    public boolean isEmpty()
    {
        return firstNode == null;
    }  // end
    /** Adds a new entry to this bag.
        @param newEntry  The object to be added as a new entry.
        @return  true. */
    public boolean add(T newEntry)
    {
        Node newNode = new Node (newEntry);
        newNode.next = firstNode;
        firstNode = newNode;
        ++numberOfEntries;
        return true;
    }  // end
    
    /**
     * This method adds an element in middle of the bag
     * @param newEntry
     * @return
     */
    public boolean addInMiddle(T newEntry)
    {
        Node newNode = new Node (newEntry);
        newNode.next = firstNode.next;
        firstNode.next = newNode;
        ++numberOfEntries;
        return true;
    }  // end
    
    
    /** Removes one unspecified entry from this bag, if possible.
    @return  Either the removed entry, if the removal
    was successful, or null. */
    public T remove()
    {
        T result = null;
        if (firstNode != null)
        {
            result = firstNode.data;
            firstNode = firstNode.next;
            --numberOfEntries;    
        }
        return result;
    }  // end
    /**  Locates a given entry within this bag.
    @param anEntry  The entry to be located.
    @return  A reference to the node if located, or null otherwise. */
    private Node getReferenceTo (T anEntry)
    {
        T tempEntry;
        Node currentNode = firstNode;
        boolean found = false;
        while (!found && currentNode != null)
        {
            tempEntry = currentNode.data;
            if (anEntry.equals (tempEntry))
               found = true;
            else
               currentNode = currentNode.next;
        }
        return currentNode;
    }
    
    
    
   
    /** Removes one occurrence of a given entry from this bag.
    @param anEntry  The entry to be removed.
    @return  True if the removal was successful, or false otherwise. */
    public boolean remove(T anEntry)
    {
        boolean result = false;
        Node currentNode = getReferenceTo (anEntry);
        if (currentNode != null)
        {
            currentNode.data = firstNode.data;
            firstNode = firstNode.next;
            --numberOfEntries;
            result = true;
        }
        return result;
        
    }  // end
    /** Removes all entries from this bag. */
    public void clear()
    {
        while (!isEmpty())
          {
              remove ();
          }
      numberOfEntries = 0;
    }  // end
    /** Counts the number of times a given entry appears in this bag.
    @param anEntry  The entry to be counted.
    @return  The number of times anEntry appears in the bag. */
    public int getFrequencyOf(T anEntry)
    {
        Node currentNode = firstNode;
        int frequency = 0;
        while (currentNode != null)
        {
            if (anEntry.equals (currentNode.data))
               ++frequency;
            currentNode = currentNode.next;
        }
        return frequency;
    }  // end
    /** Tests whether this bag contains a given entry.
    @param anEntry  The entry to locate.
    @return  True if the bag contains anEntry, or false otherwise. */
    public boolean contains(T anEntry)
    {
        Node currentNode = getReferenceTo (anEntry);
        return !(currentNode == null);
    }  // end
    /** Retrieves all entries that are in this bag.
    @return  A newly allocated array of all the entries in this bag. */
    public T[] toArray()
    {
        @SuppressWarnings ("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while (currentNode != null)
        {
            result [index] = currentNode.data;
            ++index;
            currentNode = currentNode.next;
        }
        return result;
    }
 class Node
{
    private T data;
    private Node next;
//  Two contructors.
    private Node (T dataPortion)
    {
        this (dataPortion, null);
    }
    private Node (T dataPortion, Node nextNode)
    {
        data = dataPortion;
        next = nextNode;   
    }
    
    public T getData ()
    {
        return data;
    }
}
} // end LinkedBag
