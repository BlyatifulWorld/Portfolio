/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6321600261_lab9_quiz1;

/**
 *
 * @author Tay
 */
public class Student {
    private String id;
    private String name;
    private String major;
    private double gpax;

    public Student() {
    }

    public Student(String id, String name, String major, double gpax) {
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

    public double getGpax() {
        return gpax;
    }

    public void setGpax(double gpax) {
        this.gpax = gpax;
    }
}
