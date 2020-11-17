package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Normalization {
    public static String pathNormalization(String path){
        String[] fullPath = path.split("/");

        Deque<String> stackPath = new ArrayDeque<>();

        for (String value : fullPath) {
            if (value.equals(".")) {
                continue;
            } else if (value.equals("..") && stackPath.size() != 0) {
                stackPath.pop();
            } else {
                stackPath.push(value);
            }
        }

        String normalPath = "";
        while (!stackPath.isEmpty()){
            if(stackPath.size()!=1){
                normalPath += stackPath.pollLast() + "/";
            }
            else{
                normalPath += stackPath.pollLast();
            }
        }
        return normalPath;
    }
}
