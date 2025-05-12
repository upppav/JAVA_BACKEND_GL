import java.util.HashMap;
import java.util.Map;

public class StudentManagement {
    private Map<String , Integer> stringIntegerMap;
    public StudentManagement() {
        this.stringIntegerMap = new HashMap<>();
    }
    //Add student
    public void addStudent(String name, int rollNumber) {
        this.stringIntegerMap.put(name, rollNumber);
        System.out.println("student added");
    }
    //update
    public void updateStudent(String name, int rollNumber) {
        if (this.stringIntegerMap.containsKey(name)) {
            this.stringIntegerMap.put(name, rollNumber);
            System.out.println("Student with name " + name + " updated");
        }
        else{
            System.out.println("Student with name " + name + " not exists");
        }

    }
    //delete
    public void deleteStudent(String name) {
        if (this.stringIntegerMap.containsKey(name)) {
            this.stringIntegerMap.remove(name);
            System.out.println("Student with name " + name + " deleted");
        }
        else{
            System.out.println("Student with name " + name + " not exists");
        }
    }
    //retrive
    public Integer retriveStudent(String name) {
        if (this.stringIntegerMap.containsKey(name)) {
            return this.stringIntegerMap.get(name);
        }
        else{
            System.out.println("Student with name " + name + " not exists");
            return null;
        }

    }
    // print map
    public Map<String,Integer> print()
    {
        return this.stringIntegerMap;
    }
public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent("uppav", 1);
        studentManagement.addStudent("pav", 2);
        studentManagement.addStudent("up", 3);
        studentManagement.updateStudent("uppav", 4);
        studentManagement.deleteStudent("uppav");
        studentManagement.retriveStudent("uppav");
    System.out.println(studentManagement.retriveStudent("pav"));
    System.out.println(studentManagement.print());
}
}
