package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {

  @Test
  void serializeDtoTest() throws JsonProcessingException {
    BeerDto beerDto = getDto();

    String jsonString = objectMapper.writeValueAsString(beerDto);

    System.out.println(jsonString);
  }

  @Test
  void deserializeTest() throws IOException {
    String jsonString =
        "{\"beerId\":\"071e256a-7ef8-43cc-a012-003dc81c0c13\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":543243452,\"price\":12.99,\"createdDate\":\"2020-07-16T22:59:40.298875-04:00\",\"lastUpdatedDate\":\"2020-07-16T22:59:40.298949-04:00\"}\n";

    BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);

    System.out.println(beerDto);
  }
}
