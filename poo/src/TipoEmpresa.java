public enum TipoEmpresa {
    PRIVADA("Dian", "Empresa Privada de impuestos"),
    PUBLICA("Sena","Empresa publica del gobierno");

    public final String nombre;
    public final String descripcion;

    TipoEmpresa(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion =descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
