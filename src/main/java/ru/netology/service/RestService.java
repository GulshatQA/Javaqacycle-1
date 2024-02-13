package ru.netology.service;

public class RestService {
    public int calcRestOfMonthsInYear(int income, int expenses, int threshold) {
        int money = 0; // начальный счёт
        int restOfMonths = 0; // количество месяцев для отдыха
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                restOfMonths++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return restOfMonths;
    }
}
