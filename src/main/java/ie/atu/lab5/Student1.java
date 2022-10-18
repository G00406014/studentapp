package ie.atu.lab5;

public class Student1 {
    private String name;
    private String email;
    private String course;

    public Student1() {

    }



    public void Student1() {
        this.course = "software";
        this.name = "alex";
        this.email = "alex@gmail.com";
    }

    public Student1(String name, String course , String email) {
        this.name = name;
        this.course = course;
        this.email = email;
    }

        public String getName () {
            return this.name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getEmail () {
            return this.email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getCourse () {
            return this.course;
        }

    public void setCourse(String course) {
        this.course = course;
    }
}
