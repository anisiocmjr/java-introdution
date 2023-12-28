// Estrutura do métodos tambem são bem simples.
// 1. Tipo de retorno
// 2. Nome do objetivo do metodo no infinitivo.
// 3. Os parametros desse metodo.


    public class Metodos {
        public static void main( String [] args) {

            int numero1 = 2;
            int numero2 = 2;

            int resultado = somar (numero1, numero2);
            System.out.println(resultado);

    }

        public static int somar (int numero1, int numero2) {
            return numero1 + numero2;
        }

}