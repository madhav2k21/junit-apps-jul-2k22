package com.techleads.app;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditoinalTest {

    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    void basicTest() {

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindows() {

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMAC() {

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMACAndWindows() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testOnlyJava17() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testOnlyJava13() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_18)
    void testOnlyMinJava13MaxJava18() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13)
    void testOnlyMinJava8() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "TECH_LD_DEV", matches = "DEV")
    void testOnlyForDevEnv() {

    }

    @Test
    @EnabledIfSystemProperty(named = "TECH_LD_PRD", matches = "PRD")
    void testOnlyForProdEnv() {

    }

}
