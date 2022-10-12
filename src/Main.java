public class Main {
    public static void main(String[] args) {
        //declaracion de parametros.
        int param1 = 10;
        int param2 = 20;
        int param3 = 30;

        // funcion sumar con paso por referencia
        suma(param1, param2, param3);

        //funcion sumar con paso por valor
        var SumaValor = sumaValor(param1, param2, param3);

        //funcion miCoche
        var miCoche = new Coche();

        //System.out.println(miCoche.puerta);
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static int sumaValor(int a, int b, int c) {
        return a + b + c;
    }
}
