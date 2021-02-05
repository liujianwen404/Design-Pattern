package com.liujianwen.algorithm.sort;

/**
 * 冒泡排序
 */
public class Bubble {

        public static void bubble(int[] array){
            int temp;
            for (int i = 0; i < array.length ; i++) {
                for (int j = 0; j < array.length-1-i; j++) {
                    if ( array[j+1] < array[j] ) {
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
}
