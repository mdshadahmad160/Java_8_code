package com.nc.practice;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shad Ahmad
 */
public class PrintArrayListUsingLambdaExp {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Banana","Orange","Mango");
        list.forEach(
                item-> {
                    System.out.println(item);
                }
        );
    }
}
