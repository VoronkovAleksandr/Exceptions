package HomeWork003;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Human {
    private String surname;
    private String name;

    private String middleName;

    private LocalDate birthday;
    private  int phone;
    private Gender gender;

    public void saveHuman() throws Exception{
        String file = this.getSurname() + ".txt";
        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write(this.toString() + "\n");
            fileWriter.flush();
        } catch (IOException e){
            e.printStackTrace();
            throw new Exception("Ошибка записи файла.");
        }
    }

    public Human(String surname, String name, String middleName, LocalDate birthday, int phone, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPhone() {
        return phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  surname + " " +
                name + " " +
                middleName + " " +
                birthday + " " +
                phone + " " +
                gender;
    }
}
