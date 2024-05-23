import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor;
        myDoctor = new Doctor(("Carlos"));
        myDoctor.name = "Carlos Palacios";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);


        Doctor myDoctorAnn;
        myDoctorAnn = new Doctor();
        myDoctorAnn.showId();
        System.out.println(Doctor.id);

        showMenu();
    }
}