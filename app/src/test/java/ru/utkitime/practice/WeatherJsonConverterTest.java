package ru.utkitime.practice;

import com.google.gson.Gson;

import org.junit.Test;

import ru.utkitime.practice.jsonconvertation.JsonConverter;

import ru.utkitime.practice.weather.WeatherGeneral;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class WeatherJsonConverterTest {

    private JsonConverter jsonConverter = new JsonConverter();
    private String sampleWeatherJson = "{\"coord\":{\"lon\":139,\"lat\":35},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01n\"}],\"base\":\"stations\",\"main\":{\"temp\":281.52,\"feels_like\":278.99,\"temp_min\":280.15,\"temp_max\":283.71,\"pressure\":1016,\"humidity\":93},\"wind\":{\"speed\":0.47,\"deg\":107.538},\"clouds\":{\"all\":2},\"dt\":1560350192,\"sys\":{\"type\":3,\"id\":2019346,\"message\":0.0065,\"country\":\"JP\",\"sunrise\":1560281377,\"sunset\":1560333478},\"timezone\":32400,\"id\":1851632,\"name\":\"Shuzenji\",\"cod\":200}";
    private WeatherGeneral sampleWeather = new Gson().fromJson(sampleWeatherJson, WeatherGeneral.class);


    @Test
    public void convertFromJson_isCorrect() {
        WeatherGeneral testWeather = jsonConverter.weatherFromJson(sampleWeatherJson);
        assertThat(testWeather.getClouds().getAll(), equalTo(2));
    }

    @Test
    public void convertToJson_isCorrect() {
        String testWeatherJson = jsonConverter.weatherToJson(sampleWeather);
        assertThat(testWeatherJson, equalTo(sampleWeatherJson));
    }
}
