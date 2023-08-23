import java.util.Arrays;
import java.util.List;

public class Desafio17 {
//    Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e
//    outra contendo os números ímpares da lista original, e exiba os resultados no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        var numerosPares = numeros.stream().filter(n -> n % 2 == 0);
        var numerosImpares = numeros.stream().filter(n -> n % 2 == 1);
        System.out.println("----NUMEROS PARES----");
        numerosPares.forEach(System.out::println);
        System.out.println("----NUMEROS IMPARES----");
        numerosImpares.forEach(System.out::println);
    }
}
