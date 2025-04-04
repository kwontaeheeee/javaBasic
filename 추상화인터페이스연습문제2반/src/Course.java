
    public abstract class Course {
    private String courseName;
    private String teacherName;

 
    public Course(String courseName, String teacherName) {
        this.courseName = courseName;
        this.teacherName = teacherName;
    }
    

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


     public void showInfo() {
        System.out.println("수업명: " + courseName + " / 교사: " + teacherName);
    }

    public abstract void startClass();
}


class OnlineCourse extends Course {
    public OnlineCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }

    @Override
    public void startClass() {
        System.out.println("Zoom 링크를 통해 온라인 수업을 시작합니다.");
    }
}


class OfflineCourse extends Course {
    public OfflineCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }

    @Override
    public void startClass() {
        System.out.println("지정된 강의실에서 대면 수업을 시작합니다.");
    }
}


class HybridCourse extends Course {
    public HybridCourse(String courseName, String teacherName) {
        super(courseName, teacherName);
    }

    @Override
    public void startClass() {
        System.out.println("온라인과 오프라인 수업을 병행합니다.");
    }

    public void switchMode(String mode) {
        System.out.println("현재 수업 모드를 " + mode + "로 변경합니다.");
    }
}




     