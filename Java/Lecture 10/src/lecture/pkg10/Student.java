/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg10;

import java.util.Objects;

/**
 *
 * @author Tay
 */
public class Student {
    private String id;
    private String name;
    private String major;
    private double gpax;

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

    public double getGpax() {
        return gpax;
    }

    public void setGpax(double gpax) {
        this.gpax = gpax;
    }

    public Student(String id, String name, String major, double gpax) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpax = gpax;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + ", gpax=" + gpax + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
    
    
}
