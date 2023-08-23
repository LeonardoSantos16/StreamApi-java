import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio18 {
//    Desafio 18 - Filtrar os números primos da lista:
//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> filtroPrimos = n -> n % 2 != 0 && n % 3 != 0 || n == 3 || n == 2;
        var numeroPrimos = numeros.stream().filter(n -> n % 2 != 0 && n % 3 != 0 || n == 3 || n == 2);

        var numeroPrimosPredicate = numeros.stream().filter(filtroPrimos);
        numeroPrimosPredicate.forEach(System.out::println);
        numeroPrimos.forEach(System.out::println);
    }
}
