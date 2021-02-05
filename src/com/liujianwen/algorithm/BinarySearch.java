package com.liujianwen.algorithm;

public class BinarySearch {

    /**
     * 递归的二分查找
     * @param array 有序数组
     * @param key 要查的关键字
     * @param first 数组初始位置索引
     * @param last 数组结束位置索引
     * @return 返回的索引位置
     */
    public static int recursionBinarySearch(int[] array,int key,int first,int last){
        if ( key < array[first] || key > array[last] || first > last) {
            return -1;
        }
        int middle = (first + last)/2;
        if ( key < array[middle]) {
            //查前半部分
            return recursionBinarySearch(array,key,first,middle-1);
        } else if ( key > array[middle]) {
            //查后半部分
            return recursionBinarySearch(array, key, middle+1, last);
        } else {
            return middle;
        }

    }

    /**
     * 循环的二分查找
     * @param array
     * @param key
     * @return
     */
    public static int loopBinarySearch(int[] array,int key){
        int first = 0;
        int last = array.length-1;
        int middle =  0;
        if (key < array[first] || key > array[last] || first > last) {
            return -1;
        }
        while (first <= last) {
            middle =  (first + last)/2;
             if ( key < array[middle] ) {
                 //查前半部分
                 last = middle - 1;
             } else if ( key > array[middle] ) {
                 //查后半部门
                 first = middle + 1;
             } else {
                 return middle;
             }
        }
        return -1;
    }


}
