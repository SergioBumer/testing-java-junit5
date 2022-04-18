package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

  IndexController indexController;
  @BeforeEach
  void setUp() {
    indexController = new IndexController();
  }

  @Test
  void index() {
    assertEquals("index", indexController.index());
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
}