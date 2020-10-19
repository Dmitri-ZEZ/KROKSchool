package com.company;
/**
 * Класс для песни с полями <b>artistName</b> и <b>songTitle</b>
 * @author Зезюля Дмитрий
 * @version 1.0
 * */
public class Song {
    /** Поле - Имя исполнителя */
    private String artistName;
    /** Поле - Название песни */
    private String songTitle;

    /**
     * Конустрктор - создание нового объекта с определенными значениями
     * @param artistName имя исполнителя
     * @param songTitle название песни
     * */
    public Song(String artistName, String songTitle) {
        this.artistName = artistName;
        this.songTitle = songTitle;
    }

    /**
     * Функция для получения имени исполнителя
     * @return {@link Song#artistName}
     * */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Функция для получения названия песни
     * @return {@link Song#songTitle}
     * */
    public String getSongTitle() {
        return songTitle;
    }

    @Override
    public String toString() {
        return "Имя исполнителя: '" + artistName + "', Название песни: '" + songTitle + "'";
    }
}
