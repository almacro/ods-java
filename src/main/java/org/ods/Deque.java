package org.ods;

public interface Deque<T> {
    /**
     *  Add the value x to the front of the Deque
     */
   public void addFirst(T x);

    /**
     *  Remove the next (previously added) value, y from 
     *  the front of the Deque and return y
     */
    public T removeFirst();

    /**
     *  Add the value x to the back of the Deque
     */
    public void addLast(T x);

    /**
     *  Remove the next (previously added) value, y from 
     *  the back of the Deque and return y
     */
    public T removeLast();
}
