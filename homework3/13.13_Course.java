package homework;
public class Course
{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;


    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudents(String student){
    	students[numberOfStudents] = student;
    	numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudents(String student){
    	for(int i = 0; i < numberOfStudents; ++i){
            if(students[i] == student){
                for(int j = i+1; j < numberOfStudents; ++j,++i){
                    students[i] = students[j];
                }
                break;
            }
    	}
    }
    private void setStudents(String[] students){
        this.students = students;
    }

    @Override
    public Object clone(){
        Course newCourse = new Course(getCourseName());
        newCourse.setStudents(getStudents());
        return newCourse;
    }
}
