package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Person;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

  OwnerMapService ownerMapService;
  PetTypeService petTypeService;
  PetService petService;
  @BeforeEach
  void setUp() {
    petTypeService = new PetTypeMapService();
    petService = new PetMapService();
    ownerMapService = new OwnerMapService(petTypeService, petService);

  }

  @Test
  void ownerSafeZero() {
    int ownerCount = ownerMapService.findAll().size();

    assertEquals(0, ownerCount);
  }

  @Test
  void name() {
  }
}