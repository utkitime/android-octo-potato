package ru.utkitime.practice;

import org.junit.Test;

import java.io.IOException;

import ru.utkitime.practice.jsonconvertation.JsonConverter;
import ru.utkitime.practice.okhttp.GetWeather;
import ru.utkitime.practice.weather.WeatherGeneral;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class OkHTTPTest {

    private GetWeather getWeather = new GetWeather();
    private String response = null;
    private JsonConverter jsonConverter = new JsonConverter();

    @Test
    public void okHTTPRequest_isCorrect() {
        try {
            response = getWeather.run("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
            WeatherGeneral weather = jsonConverter.weatherFromJson(response);
            assertThat(weather.getClouds().getAll(), equalTo(90));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
