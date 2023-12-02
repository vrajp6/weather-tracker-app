package com.example.weathertracker;
import com.example.weathertracker.Weather;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;
    
    @Value("${weather.api.url}")
    private String weatherUrl;

    RestTemplate restTemplate = new RestTemplate();

    public Weather getWeather(String city) {
        String url = weatherUrl.replace("{cityName}", city).replace("{APIKey}", apiKey);
        String response = restTemplate.getForObject(url, String.class);
        JSONObject jsonObject = new JSONObject(response);
        JSONObject main = jsonObject.getJSONObject("main");
        JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
        Weather weatherObject = new Weather();
        weatherObject.setCity(jsonObject.getString("name"));
        weatherObject.setTemperature((main.getDouble("temp")-273.15) * 1.8 + 32);
        weatherObject.setCountry(jsonObject.getJSONObject("sys").getString("country"));
        weatherObject.setFeelsLike((main.getDouble("feels_like")-273.15) * 1.8 + 32);
        weatherObject.setHumidity(main.getDouble("humidity"));
        weatherObject.setWindSpeed(jsonObject.getJSONObject("wind").getDouble("speed"));
        weatherObject.setWeatherDescription(weather.getString("description"));
        weatherObject.setWeatherIcon(weather.getString("icon"));


        return weatherObject;
        }
    }
