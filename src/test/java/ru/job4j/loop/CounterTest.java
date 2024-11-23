package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import ru.job4j.loop.Counter;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0AndFinish10ThenSum55() {
        int result = Counter.sum(0, 10);
        assertThat(result).isEqualTo(55);
    }

    @Test
    void whenStart3AndFinish8ThenSum33() {
        int result = Counter.sum(3, 8);
        assertThat(result).isEqualTo(33);
    }

    @Test
    void whenStart1AndFinish1ThenSum1() {
        int result = Counter.sum(1, 1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void whenStart100AndFinish50ThenSum0() {
        int result = Counter.sum(100, 50);
        assertThat(result).isEqualTo(0);
    }
}
