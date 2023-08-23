import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio2 {
    // Desafio 2 - Imprima a soma dos números pares da lista:
    //Utilizando a Stream API, realize a soma dos números pares da lista
    // e exiba o resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //utilizando Function

        int sum = numeros.stream().mapToInt(n -> {
            int d = 0;
            if (n % 2 == 0) {
                d = n;
            }
            return d;
        }).sum();
        System.out.println(sum);


        //utilizando Binary

        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
