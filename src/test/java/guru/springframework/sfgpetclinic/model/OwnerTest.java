package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

  @Test
  void dependantAssertions() {
    Owner owner = new Owner(1l, "Joe", "Buck");
    owner.setCity("Key West");
    owner.setTelephone("1231231234");

    assertAll("Properties Test",
            () -> assertAll("Person Properties",
                      () -> assertEquals("Joe", owner.getFirstName(), "First Name did not Matched"),
                      () -> assertEquals("Buck", owner.getLastName(),"Last Name did not Matched")),
            () -> assertAll("Owner Properties",
                    () -> assertEquals("Key West", owner.getCity(), "City did not Matched"),
                    () -> assertEquals("1231231234", owner.getTelephone(), "Telephone did not Matched")));

  }
}