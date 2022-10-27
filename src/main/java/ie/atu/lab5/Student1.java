package ie.atu.lab5;

import javax.xml.namespace.QName;

public class Student1 {


    private String name;
    private String email;
    private String course;


    public Student1() {

    }

    public Student1(String name, String course, String email) {
        this.name = "alex";
        this.course = "arts";
        this.email = "feakleboy@gmail.com";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    

}