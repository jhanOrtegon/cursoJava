import javax.swing.*;

public class PracticaConArreglos {

    public static void main(String[] args) {

        int[] numerosUsuario = new int[4];
        for (int i = 0; i <= numerosUsuario.length-1; i++){
            numerosUsuario[i] = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        }
        int mayor = 0;
        for (int i = 1; i <= numerosUsuario.length-1; i++){
            mayor = (numerosUsuario[i] > numerosUsuario[mayor])?i:mayor;
        }
        System.out.println("numerosUsuario[mayor] = " + numerosUsuario[mayor]);

    }
}
