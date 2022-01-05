public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona("jhan Carlos","Ortegon Arrieta","colombiano",24,1.78);
        Empleado e1 = new Empleado("valentina","Ortegon","venezolana",20,1.60,0,TipoEmpresa.PUBLICA.descripcion + " " + TipoEmpresa.PUBLICA.getNombre(),2.400,240.000);
        System.out.println(p1.toString());
        System.out.println(e1.toString());
    }
}
