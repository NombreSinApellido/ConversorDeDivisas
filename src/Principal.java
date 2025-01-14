import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Conection prueba = new Conection();

        int option = 0;
        while (option != 7){
            System.out.println("************************************************************************");
            System.out.println("Escriba el índice de la conversión de divisas que desee realizar: \n");
            System.out.println("1) Dolar estadounidense (USD) a peso mexicano (MXN)\n" +
                    "2) Peso mexicano (MXN) a dolar estadounidense (USD)\n" +
                    "3) Euro (EUR) a peso mexicano (MXN)\n" +
                    "4) Peso mexicano (MXN) a euro\n" +
                    "5) Yen japonés (JPY) peso mexicano (MXN)\n" +
                    "6) Peso mexicano (MXN) a yen japonés (JPY)\n" +
                    "7) Salir\n");
            System.out.println("************************************************************************");
            option = lectura.nextInt();

            switch (option){
                case 1:
                    System.out.println("¿Cuál es la cantidad que desea convertir?");
                    double amountInput = lectura.nextInt();
                    Convertion convertion = prueba.coneccion("USD", "MXN", amountInput);
                    System.out.println(amountInput +" "+ convertion.base_code() + " equivalen a " + convertion.conversion_result() +" "+
                            convertion.target_code());
                    break;
                case 2:
                    System.out.println("¿Cuál es la cantidad que desea convertir?");
                    amountInput = lectura.nextInt();
                    convertion = prueba.coneccion("MXN", "USD", amountInput);
                    System.out.println(amountInput +" "+ convertion.base_code() + " equivalen a " + convertion.conversion_result() +" "+
                            convertion.target_code());
                    break;
                case 3:
                    System.out.println("¿Cuál es la cantidad que desea convertir?");
                    amountInput = lectura.nextInt();
                    convertion = prueba.coneccion("EUR", "MXN", amountInput);
                    System.out.println(amountInput +" "+ convertion.base_code() + " equivalen a " + convertion.conversion_result() +" "+
                            convertion.target_code());
                    break;
                case 4:
                    System.out.println("¿Cuál es la cantidad que desea convertir?");
                    amountInput = lectura.nextInt();
                    convertion = prueba.coneccion("MXN", "EUR", amountInput);
                    System.out.println(amountInput +" "+ convertion.base_code() + " equivalen a " + convertion.conversion_result() +" "+
                            convertion.target_code());
                    break;
                case 5:
                    System.out.println("¿Cuál es la cantidad que desea convertir?");
                    amountInput = lectura.nextInt();
                    convertion = prueba.coneccion("JPY", "MXN", amountInput);
                    System.out.println(amountInput +" "+ convertion.base_code() + " equivalen a " + convertion.conversion_result() +" "+
                            convertion.target_code());
                    break;
                case 6:
                    System.out.println("¿Cuál es la cantidad que desea convertir?");
                    amountInput = lectura.nextInt();
                    convertion = prueba.coneccion("MXN", "JPY", amountInput);
                    System.out.println(amountInput +" "+ convertion.base_code() + " equivalen a " + convertion.conversion_result() +" "+
                            convertion.target_code());
                    break;
            }
            if (option == 7){
                System.out.println("Gracias por usar el convertidor de divisas!\n" +
                        "Tenga buen día");
            }
        }
    }
}
