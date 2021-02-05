package com.liujianwen;

import com.liujianwen.algorithm.BinarySearch;
import com.liujianwen.algorithm.sort.Bubble;
import com.liujianwen.algorithm.sort.Insert;
import com.liujianwen.algorithm.sort.Quick;
import com.liujianwen.designPattern.singleton.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        Insert.insert(array);
        System.out.println(Arrays.toString(array));

    }
}
