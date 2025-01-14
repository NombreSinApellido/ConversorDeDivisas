public class Principal {
    public static void main(String[] args) {
    Conection prueba = new Conection();

    Convertion convertion = prueba.coneccion("USD", "MXN", 10);
        System.out.println(convertion);
    }
}
