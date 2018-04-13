package org.ods;

public class FastArrayStack<T> extends ArrayStack<T> {
    @Override
    protected void resize() {
        T[] b = newArray(Math.max(2*n, 1));
        System.arraycopy(a, 0, b, 0, n);
        a = b;
    }
    @Override
    public void add(int i, T x) {
        if (n + 1 > a.length) resize();
        System.arraycopy(a, i, a, i+1, n-i);
        a[i] = x;
        n++;
    }
    @Override
    public T remove(int i) {
        T x = a[i];
        System.arraycopy(a, i+1, a, i, n-i-1);
        n--;
        if (a.length >= 3*n) resize();
        return x;
    }
}
