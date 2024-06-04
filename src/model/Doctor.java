package model;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    String speciality;
    
    public Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del doctor asignado es: "  + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointment.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable " + availableAppointment.toString();
    }

    public static class AvailableAppointment {
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public void setId (int id) {
            this.id_availableAppointment = id;
        }

        public int getId () {
            return this.id_availableAppointment;
        }

        public void setDate (Date date) {
            this.date = date;
        }

        public Date getDate () {
            return this.date;
        }

        public void setTime (String time) {
            this.time = time;
        }

        public String getTime () {
            return this.time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime:" + time;
        }
    }

}
