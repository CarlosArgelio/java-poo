public class Patient {
    static int id;
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    private double weight;
    private double height;
    String blood;

    Patient(String name, String email) {
        this.name = name;
        this.email = email;
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

    
}
