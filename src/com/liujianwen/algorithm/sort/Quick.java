package com.liujianwen.algorithm.sort;

/**
 * 快速排序
 */
public class Quick {

    public static void quickSort(int[] array,int first,int last){
        int i,j,temp,t;
        if (first > last) {
            return;
        }
        i = first;
        j = last;
        temp = array[i];

        while (i<j) {
            /*从左与从右查找的顺序不能乱，假如有个有序数组【1,3,5,7,9】，如果先从左边开始寻找的话，一直往右寻找大于1的数，直到i变成4还没有找到就停止了；但是下面的语句就会把9赋值在1上了
            * 如果先从右边开始寻找的话，一直往左寻找小于1的数，直到j变成0还没有找到然后停止，此时i和j都是0，所以就是把自身交换一下并不影响顺序。
            * */
            //依次递归temp基准数的右边
            while (temp<=array[j]&&i<j) {
                j--;
            }

            //依次递归temp基准数的左边
            while (temp>=array[i]&&i<j) {
                i++;
            }

            //满足条件则交换
            if (i<j) {
                t = array[j];
                array[j] = array[i];
                array[i] = t;
            }
        }
        //此时i=j，交换基准数与i=j的位置的值，递归两边
        array[first] = array[i];
        array[i] = temp;

        quickSort(array,first,i-1);
        quickSort(array,i+1,last);
    }
}
