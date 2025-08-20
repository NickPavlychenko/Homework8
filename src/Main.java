import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] numbers = {1, 2, 3};
        double[] numbersD = {1.57, 7.654, 9.986};
        int[] numbersThree = {10, 15, 20};

        System.out.println("Задание 2");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbersD.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbersD[i]);
        }
        System.out.println();
        for (int i = 0; i < numbersThree.length; i++){
            if (i > 0) {
                System.out.print(", ");
            }
                System.out.print(numbersThree[i]);
            }
        System.out.println();

            System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();
            for (int i = numbersD.length - 1; i >= 0; i--) {
                System.out.print(numbersD[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
        System.out.println();
            for (int i = numbersThree.length - 1; i >=0; i --){
                System.out.print(numbersThree[i]);
                if (i > 0){
                    System.out.print(", ");
                }
            }
            System.out.println();


            System.out.println("Задача 4");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    numbers[i] += 1;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
