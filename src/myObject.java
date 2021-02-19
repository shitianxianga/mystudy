import java.util.Objects;

public class myObject implements  Comparable {
    private String name;
    private Integer age;
    public myObject(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        myObject myObject= (myObject) o;
        return this.age-myObject.age;
    }

    @Override
    public String toString() {
        return "myObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        myObject myObject = (myObject) o;
        return Objects.equals(name, myObject.name) &&
                Objects.equals(age, myObject.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
