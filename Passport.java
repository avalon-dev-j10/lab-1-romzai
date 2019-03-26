package ru.avalon.java.dev.j10.labs.models;
import java.util.Date;
import ru.avalon.java.dev.j10.labs.commons.Address;
/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

public class Passport {
    
    private int series;             // Серия паспорта
    private int number;             // Номер паспорта
    private String name;            // Имя
    private String lastName;        // Фамилия
    private String patronymic;      // Отчество
    private String secondName;      // Второе имя
    private Date birthDate;         // Дата рождения
    private Date issueDate;         // Дата выдачи пасспорта
    private String issueDeptName;   // Орган, выдавший документ
    private Address address;        // Адрес
        

    public Passport(int series, int number, String name, String lastName,
            String patronymic, String secondName, Date birthDate, 
            Date issueDate,String issueDeptName, Address address) {
            if (name.chars().allMatch(Character::isLetter) &                    //Проверка строк на наличие только символов
            lastName.chars().allMatch(Character::isLetter) &                 
            patronymic.chars().allMatch(Character::isLetter) &
            secondName.chars().allMatch(Character::isLetter)){
                if(name.isBlank()){                                             //Приведение данных к общему формату ("Иванов Иван Иванович")
                    this.name = name;
                }else {
                    this.name = (name.substring(0,1).toUpperCase() + 
                    name.substring(1, name.length()).toLowerCase());
                }
                if(name.isBlank()){
                    this.lastName = lastName;
                }else {
                    this.lastName = (lastName.substring(0, 1).toUpperCase() + 
                    lastName.substring(1, lastName.length()).toLowerCase());
                }
                if(patronymic.isBlank()){
                    this.patronymic = patronymic;
                }else {
                    this.patronymic = (patronymic.substring(0, 1).toUpperCase()+ 
                    patronymic.substring(1, patronymic.length()).toLowerCase());
                }
                if(secondName.isBlank()){
                    this.secondName = secondName;
                }else {
                    this.secondName = (secondName.substring(0, 1).toUpperCase()+ 
                    secondName.substring(1,secondName.length()).toLowerCase());
                }
            this.series = series;
            this.number = number;
            this.birthDate = birthDate;
            this.issueDate = issueDate;
            this.issueDeptName = issueDeptName;
            this.address = address;
        }
    }
               
            
    public String getFullAddress (){
        return (address.getFullAddress());
    }
            
    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDeptName() {
        return issueDeptName;
    }

    public void setIssueDeptName(String issueDeptName) {
        this.issueDeptName = issueDeptName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

