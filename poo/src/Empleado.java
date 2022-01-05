public class Empleado extends Persona{
    int experiencia;
    String empresa;
    double horasLaboradas;
    double salario;

    Empleado(String nombre, String apellido, String nacionalidad, int edad, double estatura,int experiencia, String empresa, double horasLaboradas, double salario){
        super(nombre,apellido,nacionalidad,edad,estatura);
        this.experiencia = experiencia;
        this.empresa = empresa;
        this.horasLaboradas = horasLaboradas;
        this.salario = salario;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() +  "Empleado{" +
                "experiencia=" + experiencia +
                ", empresa='" + empresa + '\'' +
                ", horasLaboradas=" + horasLaboradas +
                ", salario=" + salario +
                '}';
    }
}
