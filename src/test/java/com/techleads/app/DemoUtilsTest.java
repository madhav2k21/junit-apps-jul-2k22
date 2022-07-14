package com.techleads.app;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {
    private DemoUtils demoUtils;

    @BeforeEach
    void setup(){
        demoUtils=new DemoUtils();
    }

    @Test
    @DisplayName("{1} one testAdd()")
    @Order(1)
    void testAdd() {
        int add = demoUtils.add(12, 3);
        assertEquals(15,add);
        assertNotEquals(15,demoUtils.add(13,13));
    }

    @Test
    @DisplayName("{2} testCheckNull()")
    @Order(-1)
    void testCheckNull() {
        Object test = demoUtils.checkNull("test");
        Object testNull = demoUtils.checkNull(null);
        assertNotNull(test);
        assertNull(testNull);
    }

    @Test
    @DisplayName("{3} testGetAcademyDuplicate()")
    void testGetAcademyDuplicate() {
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate());
        assertNotSame("code",demoUtils.getAcademy());
    }

    @Test
    @DisplayName("{4} testIsGreater()")
    void testIsGreater() {
        assertFalse(demoUtils.isGreater(12,123));

        assertTrue(demoUtils.isGreater(10,8));
    }

    @Test
    @DisplayName("{5} testGetFirstThreeLettersOfAlphabet()")
    void testGetFirstThreeLettersOfAlphabet() {

        String[] expected={"A", "B", "C"};

        String[] firstThreeLettersOfAlphabet = demoUtils.getFirstThreeLettersOfAlphabet();
        assertArrayEquals(expected,firstThreeLettersOfAlphabet);
        assertArrayEquals(expected,firstThreeLettersOfAlphabet);
    }

    @Test
    @DisplayName("{6} testGetAcademyInList()")
    void testGetAcademyInList() {

        List<String> academyInList = List.of("one", "2", "three");
        assertIterableEquals(academyInList,demoUtils.getAcademyInList());
    }

    @Test
    @DisplayName("{7} getAcademyInListLineMatch()")
    void getAcademyInListLineMatch() {

        List<String> academyInList = List.of("one","2","three");
        assertLinesMatch(academyInList,demoUtils.getAcademyInList());
    }

    @Test
    @DisplayName("{8} testThrowException()")
    void testThrowException() {
        Exception exception = assertThrows(Exception.class, () -> {
            demoUtils.throwException(-1);
        });
        assertEquals("Value should be greater than or equal to 0",exception.getMessage());

        assertDoesNotThrow(()->{
            demoUtils.throwException(11);
        });
    }

    @Test
    @DisplayName("{9} checkTimeout()")
    void checkTimeout() {


        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {

            demoUtils.checkTimeout();
        });

    }

    @Test
    @DisplayName("{10} testMultiply()")
    void testMultiply() {
        int multiply = demoUtils.multiply(2, 3);
        assertEquals(6,multiply);
    }
}