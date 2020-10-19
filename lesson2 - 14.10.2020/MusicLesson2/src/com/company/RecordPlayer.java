package com.company;
/**
 * Класс для звуковоспроизводящего устройства с полями <b>type</b> и <b>medium</b>
 * @author Зезюля Дмитрий
 * @version 1.0
 * */
public class RecordPlayer {
    /** Поле - тип звуковоспроизводящего устройства */
    private MediaTypes type;
    /** Поле - носитель нахоядщийся в данном устройстве*/
    private Medium medium;

    /**
     * Конустрктор - создание нового объекта с определенными значениями
     * @param type тип звуковоспроизводящего устройства
     * @param medium носитель нахоядщийся в данном устройстве
     * */
    RecordPlayer(MediaTypes type,Medium medium){
        this.type = type;
        setMedium(medium);
    }

    /**
     * Функция для получения типа устройтва
     * @return {@link RecordPlayer#type}
     * */
    public MediaTypes getType() {
        return type;
    }

    /**
     * Функция для получения носителя на данном устройтсве
     * @return {@link RecordPlayer#medium}
     * */
    public Medium getMedium() {
        return medium;
    }

    /**
     * Функция для определения значения поля {@link RecordPlayer#medium} <br>
     * @exception IllegalArgumentException если данное устройство не может воспроизвести носитель данного типа
     * */
    public void setMedium(Medium medium) {
        if(medium.getTypes()!=this.type){
            throw new IllegalArgumentException("Данное устройство не может воспроизвести носитель данного типа");
        }
        else{
            this.medium = medium;
        }
    }

    /**
     * Функция для "проигрывания" определенной песни
     * @param numberSong номер песни на носители
     * */
    public void playSong(int numberSong){
        if(numberSong>=1 && numberSong<=medium.getQuantitySong()){
            System.out.println("Играет песня - [" + medium.getSongs()[numberSong-1] + "]");
        }
        else{
            System.out.println("Нет песни с таким номером");
        }
    }

    @Override
    public String toString() {
        return "Устройства типа - " + type + ", в устройство втсавлен носитель: [" + medium + "]";
    }
}
