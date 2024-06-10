package model;

import java.util.ArrayList;

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

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

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
    
    @Override
    public void showDataUser() {
        System.out.println("Paciente");
    }
}
