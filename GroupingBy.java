
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );


        List<Item> sortedList = items.stream()
                .sorted(Comparator.comparingInt(Item::getQty))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);

        List<Item> sortedListByName = items.stream()
                .sorted(Comparator.comparing(Item::getName))
                .collect(Collectors.toList());

        sortedListByName.forEach(System.out::println);

        //group by price
        Map<BigDecimal, List<Item>> groupByPriceMap =
                items.stream().collect(Collectors.groupingBy(Item::getPrice));

        System.out.println(groupByPriceMap);

        // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(Item::getPrice,
                                Collectors.mapping(Item::getName, Collectors.toSet())
                        )
                );

        System.out.println("res> "+result);

    }
}
/*
Collections:

List -> arraylist, linkedList
Map-> hashMap, HashTable
Set->hashset,Treeset*/
