package kata1_v1;

import java.util.Date;

public class Kata1_V1 {

    public static void main(String[] args) {
        Person person = new Person("Javier", new Date(95,7,29));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
