import java.util.*;
class College{
    String Name;
    List<Teacher> Teacher;
    College(String Name,List<Teacher> Teacher){
        this.Name=Name;
        this.Teacher=Teacher;
    }
}
class Teacher{
    String Name;
    String Subject;
    Teacher(String Name,String Subject){
        this.Name=Name;
        this.Subject=Subject;
    }
    public String toString(){
        return "Teacher"+Name+" Subject "+Subject;
    }
}
class Association{
    public static void main(String args[]){
        List<Teacher> Teachers=new ArrayList<>();
        Teachers.add(new Teacher("ram","java"));
        Teachers.add(new Teacher("sham","Python"));
        College college=new College("Ngit",Teachers);
        System.out.println(Teachers.toString());
    }
}
// compositon a car will ahave a engine
