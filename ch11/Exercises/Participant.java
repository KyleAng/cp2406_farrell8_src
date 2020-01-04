import java.util.Objects;

public class Participant {
    String name;
    int age;
    String address;

    public Participant(String n, int a, String ad){
        name = n;
        age = a;
        address = ad;
    }

    @Override
    public String toString() {
        return "Participant" + "\n" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", address: '" + address + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return age == that.age &&
                name.equals(that.name) &&
                address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }
}
