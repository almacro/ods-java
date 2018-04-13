package org.ods;

public class ArrayDeque<T> {
    protected T[] a;
    protected int j;
    protected int n;

    public T get(int i) {
        return a[(j+i)%a.length];
    }

    public T set(int i, T x) {
        T y = a[(j+i)%a.length];
        a[(j+i)%a.length] = x;
        return y;
    }

    public void add(int i, T x) {
        if (n + 1 > a.length) resize();
        if (i < n/2) {  // shift a[0],...,a[i-1] left one position
            j = (j == 0) ? a.length - 1 : j - 1;  // (j -1)mod a.length
            for (int k = 0; k <= i - 1; k++)
                a[(j+k)%a.length] = a[(j+k+1)%a.length];
        } else {
            for (int k = n; k > i; k--) 
                a[(j+k)%a.length] = a[(j+k-1)%a.length];
        }
        a[(j+i)%a.length] = x;
        n++;
    }

    public void remove(int i) {
        T x = a[(j+i)%a.length];
        if(i < n/2) {  // shift a[0],..,a[i-1] right one position
            for (int k = i; k > 0; k--)
                a[(j+k)%a.length] = a[(j+k-1)%a.length];
            j = (j + 1) % a.length;
        } else {  // shift a[i+1],...,a[n-1] left one position
            for (int k = i; k < n - 1; k++)
                a[(j+k)%a.length] = a[(j+k+1) % a.length];
        }
        n--;
        if (3*n < a.length) resize();
        return x;
    }

}
