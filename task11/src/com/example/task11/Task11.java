package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // Используем двойную точность для промежуточных вычислений
        double result = sum;

        // Считаем проценты за год с двойной точностью
        for (int i = 1; i <= 12; i++) {
            result += result * (double) percent;
        }

        // Возвращаем результат с преобразованием к float
        return (float) result;

    }

    public static void main(String[] args) {

        float sum = 500f; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

        System.out.println(500.0f + 0.00006f);
    }

}
