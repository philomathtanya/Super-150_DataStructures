public class Student_Oops_Example {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if(age<0){
            throw new Exception("Negative Image");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
