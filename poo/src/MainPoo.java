public class MainPoo {
    public static void main(String[] args) {
        Auto a1 = new Auto("mazda","jhan","red",true);
        Auto a2 = new Auto("for","jhan carlos");
        a1.setTipo(TipoDeAutos.CONVERTIBLE);
        System.out.println(a1);
    }
}
