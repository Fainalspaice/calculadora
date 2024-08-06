package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o numero de sua escolha: ");
        float num1 = scanner.nextFloat();
        System.out.print("Digite o outro numero da equação:  ");
        float num2 = scanner.nextFloat();
        System.out.println("Digite o sinal da equãoção (+, - ,*, / ): ");
        char sinal = scanner.next().charAt(0);
        scanner.close();
        float result;

        switch (sinal) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação invalida.");
                return;
        }

        System.out.println(num1+" " + sinal+" "+num2 + ": " + result );
    }

}