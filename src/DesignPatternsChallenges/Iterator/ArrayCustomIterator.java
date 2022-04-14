package DesignPatternsChallenges.Iterator;

import java.util.*;

public class ArrayCustomIterator {
    int[] arr = {1, 2, 3};
    private int i =0;
    public ArrayCustomIterator(int[] arr) {
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayCustomIterator it=new ArrayCustomIterator(arr);
        while(it.hasNext()){
             System.out.print(it.next()+" , ");

    }

    }
    public boolean hasNext() {
               return arr.length > i;
    }
    public int next() {
        return arr[i++];
    }

}


