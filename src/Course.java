public class Course {
    Teacher teacher;
    String courseName;
    String code;
    String prefix;
    int note;

    Course (String courseName, String prefix, String code, Teacher teacher) {
        this.courseName = courseName;
        this.prefix = prefix;
        this.code = code;
        this.teacher = teacher;
        int note = 0;
    }
    void printTeacherInfo(){
        this.teacher.print();
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else{
            System.out.println("Invalid Teacher-Course selection.Please try again.");
        }
    }
}
