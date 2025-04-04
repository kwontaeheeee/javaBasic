
public class main {
    public static void main(String[] args) {
        
        Course[] courses = new Course[] {
            new OnlineCourse("자바 프로그래밍", "김교수"),
            new OfflineCourse("자료구조", "이교수"),
            new HybridCourse("AI 프로젝트", "박교수")
        };

        
        for (Course course : courses) {
            course.showInfo();
            course.startClass();

           
            if (course instanceof HybridCourse) {
                HybridCourse hybridCourse = (HybridCourse) course;
                hybridCourse.switchMode("실시간 화상");
            }
        }
    }
}