package com.keshab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        Collection nums = new
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(4);
        nums.add(5);
        nums.add(3);
        nums.add(2);
        System.out.println(nums);
        for(int i: nums)
        {
            System.out.println(i);
        }
    }
}
