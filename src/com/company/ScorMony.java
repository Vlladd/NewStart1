package com.company;

import java.util.Scanner;

public class ScorMony {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сколько выхотите поменять в рублях:"); // Пользоватулю предлагается ввести любую суамму для для обмен
        int RubMony = in.nextInt(); // число каторое неоходимо ввести
        double $Mony = 23.35d; // курс 1 доллор за n рублей
        double EVRMony = 45.17d; // курс 1 евро за n рублей
        System.out.println(RubMony * 1 /  $Mony +"$/коп"); //  Результат перевода рублей в доллор
        System.out.format(RubMony * 1 / EVRMony  + "евро/коп" ); // Результа перевода ркблией в евро

    }
}
