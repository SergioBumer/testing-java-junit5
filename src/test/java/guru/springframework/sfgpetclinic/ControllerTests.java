package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * Created by jt on 2018-10-28.
 */
@Tag("controllers")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ControllerTests {

  @BeforeAll
  default void beforeAll() {
    System.out.println("Lets do something different");
  }
}
