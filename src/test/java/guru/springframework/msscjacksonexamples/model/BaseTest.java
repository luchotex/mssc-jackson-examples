package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author Luis M. Kupferberg Ruiz (lkupferberg@overactive.com)
 * @created 2020-07-16 22:53
 */
public class BaseTest {

  @Autowired protected ObjectMapper objectMapper;

  BeerDto getDto() {
    return BeerDto.builder()
        .beerName("BeerName")
        .beerStyle("Ale")
        .id(UUID.randomUUID())
        .createdDate(OffsetDateTime.now())
        .lastUpdatedDate(OffsetDateTime.now())
        .price(new BigDecimal("12.99"))
        .upc(543243452L)
        .myLocalDate(LocalDate.now())
        .build();
  }
}
