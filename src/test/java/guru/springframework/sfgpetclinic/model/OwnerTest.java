package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest implements ModelTests {

  @Test
  void dependentAssertions() {

    Owner owner = new Owner(1l, "Joe", "Buck");
    owner.setCity("Key West");
    owner.setTelephone("1231231234");

    assertAll("Properties Test",
            () -> assertAll("Person Properties",
                    () -> assertEquals("Joe", owner.getFirstName(), "First Name Did not Match"),
                    () -> assertEquals("Buck", owner.getLastName())),
            () -> assertAll("Owner Properties",
                    () -> assertEquals("Key West", owner.getCity(), "City Did Not Match"),
                    () -> assertEquals("1231231234", owner.getTelephone())
            ));

    assertThat(owner.getCity(), is("Key West"));
  }

  @DisplayName("Value Source Test - ")
  @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER + ParameterizedTest.DEFAULT_DISPLAY_NAME)
  @ValueSource(strings = {"Spring", "Framework", "Boot"})
  void testValueSource(String val) {
    System.out.println(val);
  }

  @DisplayName("Enum Source Test - ")
  @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER + ParameterizedTest.DEFAULT_DISPLAY_NAME)
  @EnumSource(OwnerType.class)
  void testEnumSource(OwnerType ownerType) {
    System.out.println(ownerType);
  }

  @DisplayName("Csv Source Test - ")
  @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER + ParameterizedTest.DEFAULT_DISPLAY_NAME)
  @CsvSource({
          "Virginia,1,1",
          "West Virginia,1,1",
          "Texas,1,1",
          "California,1,1",
  })
  void csvInputTests(String stateName, String val1, String val2) {
    System.out.println(stateName + " " + val1 + " " + val2);
  }

  @DisplayName("Method Provider Test - ")
  @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER + ParameterizedTest.DEFAULT_DISPLAY_NAME)
  @MethodSource("getArgs")
  void fromMethodTest(String stateName, int val1, int val2) {
    System.out.println(stateName + " " + val1 + " " + val2);
  }

  static Stream<Arguments> getArgs() {
    return Stream.of(
            Arguments.of("Virginia", 1, 3),
            Arguments.of("Texas", 2, 2),
            Arguments.of("Florida", 3, 1));
  }


    @DisplayName("Custom Provider Test - ")
    @ParameterizedTest(name = ParameterizedTest.DISPLAY_NAME_PLACEHOLDER + ParameterizedTest.DEFAULT_DISPLAY_NAME)
    @ArgumentsSource(CustomArgsProvider.class)
    void fromCustomMethodTest(String stateName, int val1, int val2) {
        System.out.println(stateName + " " + val1 + " " + val2);
    }


}