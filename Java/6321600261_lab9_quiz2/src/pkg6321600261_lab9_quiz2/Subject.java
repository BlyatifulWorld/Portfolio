/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6321600261_lab9_quiz2;

public class Subject {
    private String id;
    private String subjectName;
    private int credits;
    
    public Subject() {
        
    }
    public Subject(String id, String subjectName, int credits) {
        this.id = id;
        this.subjectName = subjectName;
        this.credits = credits;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
}
