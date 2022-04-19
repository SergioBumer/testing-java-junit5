package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;


@Tag("repeated")
public class PersonRepeatedTests implements ModelTests {

  @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition}-{totalRepetitions}")
  @DisplayName("My repeated test")
  void myRepeatedTest() {
    //todo - impl

  }

  @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition}" )
  @DisplayName("My test")
  void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
    System.out.println(testInfo.getDisplayName() +  " : " + repetitionInfo.getCurrentRepetition());

  }
}

