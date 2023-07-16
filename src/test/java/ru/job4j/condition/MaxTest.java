package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2To11Then11() {
        int left = 1;
        int right = 2;
        int one = 11;
        int result = Max.max(left, right, one);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To1To1Then5() {
        int left = 5;
        int right = 1;
        int one = 1;
        int result = Max.max(left, right, one);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5To5Then5() {
        int left = 5;
        int right = 5;
        int one = 5;
        int result = Max.max(left, right, one);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}
