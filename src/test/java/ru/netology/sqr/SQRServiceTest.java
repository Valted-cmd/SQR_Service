package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Валидные данные',200,300,3",
                        "'Граничные значения',100,9801,90",
                        "'Заграничные значения',101,9800,88",
                        "'Отрицательные значения',-101,-200,0"})
    void shouldSqrCount(String name, int start, int end, int expected) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.sqrCount(start, end);

        assertEquals(expected, actual);
    }
}