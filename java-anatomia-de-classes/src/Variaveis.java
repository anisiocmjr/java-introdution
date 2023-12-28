// a maioria das classes serão publicas por enquanto.
// se a minha classe é executavel, ou seja ela pode ser inciada, ela deve começar com o metodo main.
// o metodo main tem um corpo representado pelas "chaves", logo é nela que a magia acontece.
// ao criar uma variavel com o atributo "final", se torna uma variavel que nao pode ser alterada.
// variaveis tem uma estrutura bem sólida. 1. Tipo da variavel: Int, String, boolea, etc... ->
// 2. Nome da variavel usando o grandioso camelCase. 3. Valor da variavel. ->
// EXEMPLO: String meuNome = "Junior"; Int idade = 18; etc...
public class Variaveis {

    public static void main ( String [] args) {
        System.out.println("Olá, Mundo!");
        // exemplo de "final"

        final String BR = "Brasil";

        System.out.println(BR);
    }
    
}
