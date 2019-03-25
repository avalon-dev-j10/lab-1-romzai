package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.*;

public class Main {

    public static void main(String[] args) {
        
        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
     
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        Person ivanov = new Person(new Passport(4010, 680123, "иВан", "иВанов", //Данные намеренно введены в некорректном формате, 
                        "ИваНович", "", new Date(1989-11-12),                   //чтобы протестировать приведение формата к единому.  
                        new Date(2000-06-01), "46 ОМ",                              
                        new Address("сПБ", "", 131)));
        System.out.println(ivanov.getFullName() + "\n" + ivanov.getAddress() 
                + "\n");
        
        Person smith = new Person(new Passport(4501, 698751, "jOhn", "smiTh",
                        "", "wiLliam",new Date(1986-12-04),
                        new Date(2001-03-02), "NYPD",
                        new Address("", "Main st.", 1080)));
        System.out.println(smith.getFullName() + "\n" + smith.getAddress() +   
                "\n");
        
        
        String firstName = ivanov.getFullName();
        String secondName = smith.getFullName();
        String firstAddress = ivanov.getAddress();
        String secondAddress = smith.getAddress();
        System.out.println(firstName + "\n" + firstAddress + "\n" + secondName +
                "\n" + secondAddress);
    }
}
