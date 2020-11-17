package com.company;

public class Main {

    public static void main(String[] args) {
        Showtime showtime1 = new Showtime(3,4); // создание кинозала

        Thread t1 = new Thread(showtime1);
        Thread t2 = new Thread(showtime1);
        Thread t3 = new Thread(showtime1);
        Thread t4 = new Thread(showtime1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
