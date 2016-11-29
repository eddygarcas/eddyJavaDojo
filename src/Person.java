/**
 * Created by eddy on 11/29/16.
 */
public class Person {

    private int age;
    private String name;
    private String surname;
    private int id;

    private Person() {
        super();
    }

    public Person(int id) {
        super();
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Object person){
        boolean flag = true;
        if (person instanceof Person) {
            //flag = ((Student) person).getId() != this.getId() ? false : flag;
            flag = !((Student) person).getName().equals(this.getName()) ? false : flag;
            flag = !((Student) person).getSurname().equals(this.getSurname()) ? false : flag;
            flag = ((Student) person).getAge() != this.getAge() ? false : flag;
        }else flag = false;
        return flag;
    }
}
