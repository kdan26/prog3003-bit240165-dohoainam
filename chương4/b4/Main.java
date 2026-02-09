/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> moneyList = Arrays.asList("$10", "$20", "$50");

        Function<String, Integer> convert = s -> 
                Integer.parseInt(s.replace("$", ""));

        List<Integer> result = moneyList.stream()
                .map(convert)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

