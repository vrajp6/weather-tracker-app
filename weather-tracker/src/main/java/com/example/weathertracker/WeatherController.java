package com.example.weathertracker;
import com.example.weathertracker.Weather;
import com.example.weathertracker.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public Weather getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }
}
