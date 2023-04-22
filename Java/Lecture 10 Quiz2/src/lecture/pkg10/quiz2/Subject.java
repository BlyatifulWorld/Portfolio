package lecture.pkg10.quiz2;

import java.util.Objects;

public class Subject {
    public class Student {
    private String id;
    private String subjectName;
    private int credits;

        public Student(String id, String subjectName, int credits) {
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

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 47 * hash + Objects.hashCode(this.id);
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
}    
