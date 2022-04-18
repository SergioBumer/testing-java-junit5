package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

  @Test
  @DisplayName("Test proper: The name is being returnned properly")
  void groupedAssertions() {
    //given
    Person person = new Person(1l, "Joe", "Buck");
    //when
    //then
    assertAll("Test Props Set",
            ()-> assertEquals(person.getId(), 1l),
            ()-> assertEquals(person.getFirstName(), "Joe"),
            ()-> assertEquals(person.getLastName(), "Buck"));
  }

  @Test
  void groupedAssertionsMsgs() {
    //given
    Person person = new Person(1l, "Joe", "Buck");
    //when
    //then
    assertAll("Test Props Set",
            ()-> assertEquals(person.getId(), 1l),
            ()-> assertEquals(person.getFirstName(), "Joe", "First Name Failed"),
            ()-> assertEquals(person.getLastName(), "Buck", "Second Name Failed"));
  }
}