package lesson1.creating_classes;

public class dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public dog (String dogtype, String dogname, String dogcolor,
                int dogage){
        this.dogType = dogtype;
        this.dogName = dogname;
        this.dogColor = dogcolor;
        this.dogAge = dogage;
    }

    public String getDogType() {
        return dogType;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogColor() {
        return dogColor;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    @Override
    public String toString() {
        return  "Dog type:" + dogType + " Dog name:" + dogName + " Dog Color:" + dogColor + "  Dog age" + dogAge;
    }
}
