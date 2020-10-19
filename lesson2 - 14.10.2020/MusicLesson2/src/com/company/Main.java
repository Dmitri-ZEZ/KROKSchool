package com.company;

public class Main {

    public static void main(String[] args) {
        // Создадим несколько песен
        Song song1 = new Song("Drake","Toosie Slide");
        Song song2 = new Song("Juice WRLD", "Lucid Dreams");
        Song song3 = new Song("Гражданская оборона", "Всё идёт по плану");
        Song song4 = new Song("Земфира", "Хочешь?");

        //Сформируем массивы с песнями
        Song[] songs1 = {song1, song2};
        Song[] songs2 = {song3, song4};
        Song[] songs3 = {song1,song2,song3,song4};

        //Создадим несколько носителей
        Medium mediumHipHop = new Medium(MediaTypes.CompactCassette, songs1); // Компакт касета
        Medium mediumRussianRock = new Medium(MediaTypes.CD, songs2); // CD диск
        Medium mediumHybrid= new Medium(MediaTypes.USB, songs3); // USB носитель

        //Создадим звуковоспроизводящие устройства
        RecordPlayer CdPlayer = new RecordPlayer(MediaTypes.CD, mediumRussianRock); // CD плеер с CD носителем
        //RecordPlayer CdPlayer2 = new RecordPlayer(MediaTypes.CD, mediumHipHop); Возникнет ошибка - исключение
        //"Данное устройство не может воспроизвести носитель данного типа", так-как тип проигрывателя CD, а у носителя CompactCassette
        RecordPlayer UsbPlayer = new RecordPlayer(MediaTypes.USB, mediumHybrid);

        //Получим информацию о звуковоспроизводящем устройстве
        System.out.println(UsbPlayer);

        //Воспроизведем песню с устройства
        CdPlayer.playSong(2); // Песня воспроизвелась

        //Воспроизведем песню, номера которой нет на уносителе устройства
        UsbPlayer.playSong(5); // Выведется сообщение, что такой песни нет

        //Узнаем тип носителя
        System.out.println(mediumHybrid.getTypes());

        //Перезапишем ностель
        mediumHybrid.setSongs(songs1);

        //Поменяем носитель в устройтсве
        UsbPlayer.setMedium(mediumHybrid);

        //Получим информацию о звуковоспроизводящем устройстве
        System.out.println(UsbPlayer);

        //Воспроизведем песню с устройства
        UsbPlayer.playSong(1);


        System.out.println(UsbPlayer.getMedium());
        System.out.println(UsbPlayer.getType());

    }
}
