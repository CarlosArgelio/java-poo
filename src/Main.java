// import static ui.UIMenu.*;

import java.util.Date;

import model.Doctor;
import model.Patient;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor;

        myDoctor = new Doctor("Carlos Palacios", "Odontologia");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");

        System.out.println(myDoctor.getAvailableAppointments());

        // aA = available Appointments
        // for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
        //     System.out.println(aA.getDate() + " " + aA.getTime());
        // }
 

        Patient patient;

        patient = new Patient("Carlos", "ca@ma.co");

        System.out.println(patient);
    }
}