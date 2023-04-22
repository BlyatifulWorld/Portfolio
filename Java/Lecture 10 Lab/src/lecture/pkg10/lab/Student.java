package lecture.pkg10.lab;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private String major;
    private Double gpax; 

    @Override
    public int compareTo(Student t) {
        return gpax.compareTo(t.gpax);
    }

    public Student(String id, String name, String major, Double gpax) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpax = gpax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getGpax() {
        return gpax;
    }

    public void setGpax(Double gpax) {
        this.gpax = gpax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + ", gpax=" + gpax + '}';
    }
    
}
