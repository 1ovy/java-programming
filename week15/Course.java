package test14;

public class Course {
    private String courseName;
    private String[] students=new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName=courseName;
    }

    public void addStudent(String studentName) {
        students[numberOfStudents] = studentName;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student){
        for(int i=0;i<numberOfStudents;i++){
            if(student.equals(students[i])){
                for(int j=i+1;j<numberOfStudents;j++){
                    students[j-1]=students[j];
                }
                numberOfStudents--;
                break;
            }
        }
    }

}
