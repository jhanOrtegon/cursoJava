public class Auto {
    private String marca;
    private String color;
    private boolean activo;
    private String duenio;
    public TipoDeAutos tipo;


    public Auto(String marca){
        this.marca = marca;
    }

    public void setTipo(TipoDeAutos tipo) {
        this.tipo = tipo;
    }

    public Auto(String marca, String duenio){
        this(marca);
        this.duenio = duenio;
    }


    public Auto(String marca,String color,String duenio,boolean activo){
        this(marca, duenio);
        this.color = color;
        this.activo = activo;
    }


    @Override
    public String toString(){
        return tipo.descripcion;
    }



}

