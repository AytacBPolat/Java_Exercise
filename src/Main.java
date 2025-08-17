public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Edward Sun", "MTH", "555");
        Teacher t2 = new Teacher("John Smith", "PHY", "552");
        Teacher t3 = new Teacher("Shannon Brian", "MSC", "500");
        Course math = new Course("Mathematics", "MTH","121",t1);
        Course physics = new Course("Physics","PHY","154",t2);
        Course music = new Course("Music","MSC","782",t2);
        math.addTeacher(t1);
        physics.addTeacher(t2);
        music.addTeacher(t3);
        Student s1 = new Student("Axel Wood","231","2",math,physics,music);
        s1.addBulkExamNotes(21,43,100);
        s1.isPass();
    }
}
