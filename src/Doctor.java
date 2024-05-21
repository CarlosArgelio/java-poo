public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor(String name) {
        System.out.println("Construyendo el objecto Doctor");
        System.out.println("El nombre del doctor asignado es: "  + name);
    }

    // Comportamientos
    public void showName() {
        System.out.println(name);
    }

}
