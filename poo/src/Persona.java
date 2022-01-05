public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private double estatura;

    Persona(String nombre, String apellido, String nacionalidad, int edad, double estatura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", estatura=" + estatura +
                '}';
    }
}
