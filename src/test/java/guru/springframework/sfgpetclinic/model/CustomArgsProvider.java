package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CustomArgsProvider implements ArgumentsProvider {
  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
    return Stream.of(
            Arguments.of("Virginia", 1, 3),
            Arguments.of("Texas", 2, 2),
            Arguments.of("Florida", 3, 1));
  }
}
