public class ConversionDeTipos
{
    public static void main(String[] args)
    {

        // de String a Int
        String numeroStr = "33";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt  = " + numeroInt );

        // de String a double
        double numeroDouble = Double.parseDouble(numeroStr);
        System.out.println("numeroDouble = " + numeroDouble);
        
        // de string a logico
        String logicoStr = "true";
        boolean strBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("strBoolean = \n" + strBoolean);





    }
}
