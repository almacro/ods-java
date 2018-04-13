package org.ods;

public interface Queue<T> {
    /**
     *  Add the value x to the Queue
     */
    public void add(T x);

    /**
     *  Remove the next (previously added) value, y, 
     *  from the Queue and return y
     */
    public T remove();
}
