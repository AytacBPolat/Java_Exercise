public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass ;
    Student (String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = course1;
        this.c2 = course2;
        this.c3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExamNotes(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }
    void printNote(){
        System.out.println(this.c1.courseName+ " Note : " + this.c1.note );
        System.out.println(this.c2.courseName+ " Note : " + this.c2.note);
        System.out.println(this.c3.courseName+ " Note : " + this.c3.note);
        System.out.println("Average : " + this.average);
    }
    void isPass(){
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        printNote();
        if (this.average >= 50){
            System.out.println("Passed the course");
        }else{
            System.out.println("Failed the course");
        }
    }

}
