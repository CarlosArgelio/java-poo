package model;
public class Patient extends User {
    static int id;
    String name;
    String address;
    String phoneNumber;

    String email;
    String birthday;
    private double weight;
    private double height;
    String blood;

    public Patient(String name, String email) {
        super(name, email);
    }

    public void setWeigth(double weigth) {
        this.weight = weigth;
    }

    public String getWeigth() {
        return this.weight + "Kg.";
    }

    public void setHeigth(double heigth) {
        this.height = heigth;
    }

    public String getHeigth() {
        return this.height + "Kg.";
    }

    public String getBlood() {
        return this.blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: "+ birthday + "\nWeight: " + getWeigth() + "\nHeigth: " + getHeigth() + "\nBlood: " + getBlood();
    }
    
}
