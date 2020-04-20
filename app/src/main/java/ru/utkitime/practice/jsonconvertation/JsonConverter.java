package ru.utkitime.practice.jsonconvertation;

import com.google.gson.Gson;

import ru.utkitime.practice.weather.WeatherGeneral;

public class JsonConverter {

    private Gson gson = new Gson();

    public String testObjectToJson(TestObject testObject) {
        return gson.toJson(testObject);
    }

    public TestObject testObjectFromJson(String testObjectJson){
        return gson.fromJson(testObjectJson, TestObject.class);
    }

    public String weatherToJson(WeatherGeneral weatherOblect) {
        return gson.toJson(weatherOblect);
    }

    public WeatherGeneral weatherFromJson (String weatherJson) {
        return gson.fromJson(weatherJson, WeatherGeneral.class);
    }
}
