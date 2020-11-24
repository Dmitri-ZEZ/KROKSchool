package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) { //Основное решение задачи
        String[] fullPath = args[0].split("/");

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

	    while (!stackPath.isEmpty()){
	        if(stackPath.size()!=1){
                System.out.print(stackPath.pollLast() + "/");
            }
	        else{
                System.out.println(stackPath.pollLast());
            }
        }

        //через отдельный класс
        System.out.println(Normalization.pathNormalization("КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики"));

    }
}
