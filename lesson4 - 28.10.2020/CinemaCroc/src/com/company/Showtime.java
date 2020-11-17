package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// сеанс
public class Showtime implements Runnable{
    private int rows;
    private int seatsInRow;
    Set<Seat> seats;

    private static final Object lock = new Object();


    public Showtime(int rows, int seatsInRow){
        this.rows = rows;
        this.seatsInRow = seatsInRow;

        seats = new TreeSet<>();
        for(int i=1; i<=rows;i++){
            for(int j=1; j<=seatsInRow; j++){
                seats.add(new Seat(i,j));
            }
        }


    }

    public void showShowTime(){
        int printedSeats=0;
        int rowPrint = 1;
        System.out.println();
        for(int i=1; i<=seatsInRow;i++){
            System.out.format("-----" + Integer.toString(i) + "----");
        }
        System.out.println();

        for(Seat s : seats) {
            printedSeats++;


            System.out.format("%10s",s.getStateSeat() + " ");

            if(printedSeats==seatsInRow){
                System.out.print("   |   " + Integer.toString(rowPrint));
                rowPrint++;
                System.out.println();
                printedSeats=0;
            }
        }
        System.out.println();
    }

    public void printShowTime(){
        for(Seat s : seats) {
            System.out.println(s);
        }
        System.out.println();
    }

    // возвращает набор мест, доступных для бронирования
    // на текущий сеанс
    public Set<Seat> getFreeSeats() {
        Set<Seat> freeSeat = new HashSet<>();

        for(Seat s: seats){
            if(s.getStateSeat() == StateSeat.Free){
                freeSeat.add(s);
            }
        }
        return freeSeat;
    }

    // бронирует место на текущий сеанс;
    // возвращает true, если место успешно забронировано
    // или false, если бронирование не удалось
    // (кто-то успел раньше)
    public boolean bookSeat(Seat seat) {
        for(Seat s : getFreeSeats()) {
            if(s.getRow()==seat.getRow() && s.getSeat() == seat.getSeat()){
                s.setStateSeat(StateSeat.Taken);
                return true;
            }
        }
        return false;
    }

    public Seat chooseSeat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ряд  и место:\n");

        int row = sc.nextInt();
        int seat = sc.nextInt();

        if(row>rows || seat>seatsInRow || row<=0 || seat<=0){
            return null;
        }
        else {
            return new Seat(row,seat);
        }
    }


    @Override
    public void run() {
        synchronized (lock){
            showShowTime();
            Seat chooseSeat = chooseSeat();
            if(chooseSeat == null){
                System.out.println("Такого места нет!");
            }
            else{
                if(bookSeat(chooseSeat)){
                    System.out.println("Место куплено, приятного просмотра!");
                }
                else{
                    System.out.println("Данное место уже куплено");
                }
            }

        }
    }
}

