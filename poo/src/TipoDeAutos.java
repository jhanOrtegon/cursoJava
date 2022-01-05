public enum TipoDeAutos {
    CONVERTIBLE("sedan","carro sedan",10),
    VOLADOR("backFuture","carro futurista",1),
    CUATRO_PUERTAS("camioneta","carro grande",4);

    public final String nombre;
    public final String descripcion;
    public final int numeroPuertas;

    TipoDeAutos(String nombre, String descripcion, int numeroPuertas){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }



}
