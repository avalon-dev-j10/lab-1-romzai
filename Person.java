package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */

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

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */

public class Person {
    
    //private static int id;
    private Passport passport;

    public Person(Passport passport) {
        this.passport = passport;
        //this.id++;
    }

    //public static int getId() {
    //    return id;
    //}

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
    
    public String getFullName(){
        String name = passport.getName();
        String lastName = passport.getLastName();
        String patronymic = passport.getPatronymic();
        String secondName = passport.getSecondName();
        
        if (name.isEmpty() == false & lastName.isEmpty() == false){
            if (patronymic.isEmpty() == true & secondName.isEmpty()== true){
                return (name + " " + lastName);
            }else {
                if (patronymic.isEmpty() == true){
                    return (name + " " + secondName.charAt(0) + "." + " " + 
                            lastName);
                }else {
                    return (name + " " + patronymic + " " + lastName);
                }
            }
         }else {
            return ("Неполные данные.");
        }
    }
    public String getAddress() {
        return passport.getFullAddress();
    }
}