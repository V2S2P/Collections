package entities;

import java.util.Objects;

public class Student implements Comparable{

    private String name;
    private int id;


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        if(o == this)
            return 0;
        else if(o == null || getClass() != o.getClass())
            return 1;
        else if(this.name.compareTo(((Student) o).name) != 0)
            return this.name.compareTo(((Student) o).name);
        else if(this.id > ((Student) o).id)
            return 1;
        else if(this.id < ((Student)o).id)
            return -1;
        else return 0;

    }

}
