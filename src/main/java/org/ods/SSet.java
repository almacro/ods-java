package org.ods;

public interface SSet<T> {
    /**
     *  Return the number. n. of elements in the set.
     */
    public int size();

    /**
     *  Add x to the set provided that there is no element y in the set
     *  such that x equals y. Return true if x was added to the set and
     *  false otherwise.
     */
    public boolean add(T x);

    /**
     *  Find an element y in the set such that x equals y and remove y.
     *  Return y, or null if no such element exists.
     */
    public T remove(T x);

    /** 
     *  Find the smallest element y in the set such that y >= x.
     *  Return y or null if no such element exists.
     */
    public T find(T x);
}
