package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    String speciality;
    private ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    
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

    public void addAvailableAppointment(String date, String time) {
        availableAppointment.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable " + availableAppointment.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado en: Cruz Roja");
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    public static class AvailableAppointment {
        private int id_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
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

        public Date getDate (String DATE) {
            return this.date;
        }

        public String getDate () {
            return format.format(this.date);
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
