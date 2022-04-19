package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Tag("controllers")
class IndexControllerTest {

  IndexController indexController;
  @BeforeEach
  void setUp() {
    indexController = new IndexController();
  }

  @Test
  void index() {
    assertEquals("index", indexController.index());

    assertThat(indexController.index()).isEqualTo("index");

  }

  @Test
  void oopsHandler() {
    assertThrows(ValueNotFoundException.class, () -> indexController.oupsHandler());
  }

  @Test
  void testTimeOut() {
    assertTimeout(Duration.ofMillis(1000), ()-> {
      Thread.sleep(200);
      System.out.println("I got here");
    });
  }

  @Test
  void testTimeOut2() {
    assertTimeout(Duration.ofMillis(10000), ()-> {
      Thread.sleep(2000);

      System.out.println("I got here");
    });
  }

  @Test
  void testAssumeTrue1() {
    assumeTrue("GURU".equalsIgnoreCase("GURU"));
  }

  @EnabledOnOs(OS.MAC)
  @Test
  void testMeOnMac() {

  }

  @EnabledOnOs(OS.WINDOWS)
  @Test
  void testMeOnWindows() {

  }

  @EnabledOnJre(JRE.JAVA_8)
  @Test
  void testJava8() {

  }
  @EnabledOnJre(JRE.JAVA_11)
  @Test
  void testJava11() {

  }

  @EnabledIfEnvironmentVariable(named = "USER", matches = "sergiobuitrago")
  @Test
  void testIfUserSergio() {

  }

  @EnabledIfEnvironmentVariable(named = "USER", matches = "sergiobumer")
  @Test
  void testIfUserSergioBumer() {

  }
}