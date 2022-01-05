public class BuscarElemento {
    public static void main(String[] args) {
        int numero = 10;
        boolean rs = false;
        int[] arrayNumeros = {20,40,50,99,10,74,2366,541};

        for(int x : arrayNumeros){
            System.out.println(x);
            if (x==numero){
                rs = true;
                break;
            }
        }
        if(rs) System.out.println("numero encontrado " + numero);
        else System.out.println("no se encontro el numero " + numero);
    }
}
