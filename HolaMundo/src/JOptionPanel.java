import javax.swing.*;

public class JOptionPanel {

    public static void main (String []args){
        String peticion = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int peticionInt = Integer.parseInt(peticion);


        JOptionPane.showMessageDialog(null, "resultado del JOption = " + peticionInt +  "" + " a" );
    }

}
