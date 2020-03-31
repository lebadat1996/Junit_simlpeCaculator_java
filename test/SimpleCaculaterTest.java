import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCaculaterTest {

    @Test
    void add() {
        int a = 1;
        int b = 1;
        int kq = 2;
        int result = SimpleCaculater.add(a, b);
        assertEquals(result, kq);
    }
    @Test
    void add1() {
        int a = 0;
        int b = 1;
        int kq = 1;
        int result = SimpleCaculater.add(a, b);
        assertEquals(result, kq);
    }
    @Test
    void add2() {
        int a = 1;
        int b = 0;
        int kq = 1;
        int result = SimpleCaculater.add(a, b);
        assertEquals(result, kq);
    }
    @Test
    void add3() {
        int a = -2;
        int b = 0;
        int kq = -2;
        int result = SimpleCaculater.add(a, b);
        assertEquals(result, kq);
    }

    @Test
    void sub() {
        int a = 1;
        int b = 2;
        int kq = -1;
        int result = SimpleCaculater.sub(a, b);
        assertEquals(kq, result);
    }
    @Test
    void sub1() {
        int a = 3;
        int b = -2;
        int kq = 5;
        int result = SimpleCaculater.sub(a, b);
        assertEquals(kq, result);
    }
    @Test
    void sub2() {
        int a = -2;
        int b = 2;
        int kq = -4;
        int result = SimpleCaculater.sub(a, b);
        assertEquals(kq, result);
    }
}