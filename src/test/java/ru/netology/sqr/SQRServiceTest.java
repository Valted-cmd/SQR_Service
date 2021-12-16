package ru.netology.sqr;

import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void shouldSqrCount() {
        SQRService sqrService = new SQRService();
        int min = 10;
        int max = 25;
        int start = 100;
        int end = 150;

        int actual = sqrService.sqrCount(min, max, start, end);

        System.out.println("Квадраты " + actual + " чисел попадают в диапазон от " + start + " до " + end);
    }
}