package org.ods;

import java.lang.reflect.Array;

public class ArrayStack<T> implements List<T> {
    protected T[] a;
    protected int n;
    
    public int size() {
        return n;
    }

    public T get(int i) {
        return a[i];
    }

    public T set(int i, T x) {
        T y = a[i];
        a[i] = x;
        return y;
    }

    public void add(int i, T x) {
        if (n + 1 > a.length) resize();
        for (int j = n; j > i; j--)
            a[j] = a[j-1];
        a[i] = x;
        n++;
    }

    public T remove(int i) {
        T x = a[i];
        for (int j=i; j<n-1; j++)
            a[j] = a[j+1];
        n--;
        if (a.length >= 3*n) resize();
        return x;
    }

    protected void resize() {
        T[] b = newArray(Math.max(n*2,1));
        for (int i=0; i<n; i++) {
            b[i] = a[i];
        }
        a = b;
    }

    protected T[] newArray(int s) {
        Class ofArray = a.getClass().getComponentType();
        final T[] aa = (T[]) Array.newInstance(ofArray, s);
        return aa;
    }

    public T peek() { return a[n-1]; }
    public T push(T item) { 
        add(n, elem);
        return item;
    }
    public T pop() { 
        T x = remove(n - 1);
        return x;
    }

}
