package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Luis M. Kupferberg Ruiz (lkupferberg@overactive.com)
 * @created 2020-07-18 11:44
 */
public class LocalDateSerializer extends JsonSerializer<LocalDate> {
  @Override
  public void serialize(
      LocalDate date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
      throws IOException {
    jsonGenerator.writeObject(date.format(DateTimeFormatter.BASIC_ISO_DATE));
  }
}
