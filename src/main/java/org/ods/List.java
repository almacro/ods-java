package org.ods;

public interface List<T> {
    /**
     *  Return, n, the length of the list
     */
    public int size();

    /**
     *  Return the value x_i
     */
    public T get(int i);

    /**
     *  Set the value of x_i equal to x
     */
    public T set(int i, T x);

    /**
     *  Add x at position i, displacing x_i,...x_(n-1);
     *  Set x_(j+1) = x_j, for all j elements of {n-1,...,i}, increment n, and set x_i = x
     */
    public void add(int i, T x);

    /**
     *  Remove the value x_i, displacing x_(i+1),...,x_n(n-1);
     *  Set x_j = x_(j+1), for all j elements of {i,...,n-2} and decrement n
     */
    public T remove(int i);
}
