package com.company;

// место в зале
public class Seat implements Comparable<Seat>{
    // номер ряда
    private final int row;
    // номер места
    private final int seat;
    // состояние места
    private StateSeat stateSeat;

    public Seat(int row, int seat) {
        this.row = row;
        this.seat = seat;
        this.stateSeat = StateSeat.Free;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public StateSeat getStateSeat() {
        return stateSeat;
    }

    public void setStateSeat(StateSeat stateSeat) {
        this.stateSeat = stateSeat;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "row=" + row +
                ", seat=" + seat +
                ", stateSeat=" + stateSeat +
                '}';
    }

    @Override
    public int compareTo(Seat o) {
        if(this.row>o.row){
            return 1;
        }
        else if(this.row<o.row){
            return -1;
        }
        else{
            if(this.seat> o.seat){
                return 1;
            }
            else if(this.seat< o.seat){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}
