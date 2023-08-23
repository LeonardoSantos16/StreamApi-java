import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio14 {
//    Desafio 14 - Encontre o maior número primo da lista:
// Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Predicate<Integer> filtroNumeroPrimos = n -> n % 2 != 0 && n % 3 != 0 || n == 3 || n == 2;

        var numeroPrimos = numeros.stream().filter(filtroNumeroPrimos).max(Comparator.naturalOrder());
        System.out.println(numeroPrimos);

    }
}
