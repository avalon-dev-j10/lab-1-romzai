/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address{
    private String city;
    private String street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber){
         if(city.isBlank()){                                                    //Приведение данных к общему формату ("Иванов Иван Иванович")
                this.city = ("Город неизвестен.");
         }else {
                this.city = (city.substring(0,1).toUpperCase() +
                city.substring(1, city.length()).toLowerCase());
                }
         if(street.isBlank()){                                                  //Приведение данных к общему формату ("Иванов Иван Иванович")
                this.street = ("Улица неизвестна.");
         }else {
                this.street = (street.substring(0,1).toUpperCase() +
                street.substring(1, street.length()).toLowerCase());
         }
                this.houseNumber = houseNumber;
    }

    public String getFullAddress (){
        return (city + " " + street + " " + houseNumber);
    }

    public void setFullAddress(String city, String street, short houseNumber){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }
}
