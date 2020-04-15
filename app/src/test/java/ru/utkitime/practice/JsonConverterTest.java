package ru.utkitime.practice;

import org.junit.Test;

import ru.utkitime.practice.jsonconvertation.JsonConverter;
import ru.utkitime.practice.jsonconvertation.TestObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class JsonConverterTest {

    private JsonConverter jsonConverter = new JsonConverter();
    private TestObject sampleObject = new TestObject("Тестовый json", 2, true);
    private String sampleJson = "{\"title\":\"Тестовый json\",\"lessonNumber\":2,\"isDone\":true}";

    @Test
    public void convertFromJson_isCorrect() {
        TestObject testObject = jsonConverter.testObjectFromJson(sampleJson);
        assertThat(testObject.getTitle(), equalTo(sampleObject.getTitle()));
    }

    @Test
    public void convertToJson_isCorrect() {
        String testObjectJson = jsonConverter.testObjectToJson(sampleObject);
        assertThat(testObjectJson, equalTo(sampleJson));
    }
}
