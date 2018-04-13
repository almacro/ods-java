package org.ods;

public class ArrayQueue<T> {
    protected T[] a;
    protected int j;
    protected int n;

    public boolean add(T x) {
        if (n + 1 > a.length) resize();
        a[(j+n) % a.length] = x;
        n++;
        return true;
    }

    public T remove() {
        if (n == 0) throw new java.util.NoSuchElementException();
        T x = a[j];
        j = (j + 1) % a.length;
        n--;
        if (a.length >= 3*n) resize();
        return x;
    }

    protected void resize() {
        T[] b = newArray(Math.max(1,n*2));
        for (int k=0; k<n; k++) 
            b[k] = a[(j+k) % a.length];
        a = b;
        j = 0;
    }

    private T[] newArray(int s) {
        Class ofArray = a.getClass().getComponentType();
        final T[] aa = (T[]) java.lang.reflect.Array.newInstance(ofArray, s);
        return aa;
    }
}
