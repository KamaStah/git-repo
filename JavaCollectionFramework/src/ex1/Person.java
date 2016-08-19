package ex1;

/**
 * Created by Kama on 10.08.2016.
 */
public class Person implements Comparable<Person> {
    int age;
    String name;

    @Override
    public int compareTo(Person o) {
        //return age - o.age;

        return name.compareTo(o.name);

    }
}
