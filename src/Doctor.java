import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0;
    String name;
    String speciality;
  
    Doctor() {
        System.out.println("Construyendo el objecto Doctor");
    }
    
    Doctor(String name, String speciality) {
        System.out.println("El nombre del doctor asignado es: "  + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // Comportamientos
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointment.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointment;
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
    }

}
