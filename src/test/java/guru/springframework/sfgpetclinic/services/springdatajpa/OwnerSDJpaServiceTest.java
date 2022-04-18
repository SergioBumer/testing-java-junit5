package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerSDJpaServiceTest {
  @Disabled
  @Test
  void findByLastName() {
    Owner founded = ownerSDJpaService.findByLastName("Buck");
  }


  OwnerSDJpaService ownerSDJpaService;

  @BeforeEach
  void setUp() {
    ownerSDJpaService = new OwnerSDJpaService(null,null,null);
  }

  @Test
  void findAllByLastNameLike() {
  }

  @Test
  void findAll() {
  }

  @Test
  void findById() {
  }

  @Test
  void save() {
  }

  @Test
  void delete() {
  }

  @Test
  void deleteById() {
  }
}