package com.liujianwen.algorithm.sort;

public class Insert {

    public static void insert(int[] array){

        for (int i = 1; i < array.length ; i++) {
            int insertNum = array[i];//待排序插入的数
            int j = i-1;
            while (j>=0 && array[j]>insertNum){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = insertNum;
        }
    }
}
