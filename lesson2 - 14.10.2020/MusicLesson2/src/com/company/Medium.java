package com.company;

import java.util.Arrays;
/**
 * Класс для носителя определенного типа с полями
 * <b>type</b> и <b>songs</b>
 * @author Зезюля Дмитрий
 * @version 1.0
 * */
public class Medium {
    /** Поле - тип носителя */
    private MediaTypes type;
    /** Поле - массив с песнями*/
    private Song[] songs;

    /**
     * Конустрктор - создание нового объекта с определенными значениями
     * @param type тип носителя
     * @param songs массив с песнями
     * */
    public Medium(MediaTypes type, Song[] songs) {
        this.type = type;
        this.songs = songs;
    }

    /**
     * Функция для получения значения поля {@link Medium#type}
     * @return Возвращает тип данного носителя
     * */
    public MediaTypes getTypes() {
        return type;
    }

    /**
     * Функция для получения размера массива {@link Medium#songs}
     * @return Возвращает размер массива {@link Medium#songs} данного носителя
     * */
    public int getQuantitySong(){
        return songs.length;
    }

    /**
     * Функция для получения массива {@link Medium#songs}
     * @return Возвращает массив {@link Medium#songs} данного носителя
     * */
    public Song[] getSongs() {
        return songs;
    }

    /**
     * Функция для определения значения поля {@link Medium#songs} <br>
     * То есть для перезаписи носителя
     * */
    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Тип носителя: " + type + ", композиции на носителе: " + Arrays.toString(songs);
    }
}
