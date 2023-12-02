package com.example.weathertracker;

public class Weather {

    private String city;
    private String country;
    private Double temperature;
    private Double feelsLike;
    private Double humidity;
    private Double windSpeed;
    private String weatherDescription;
    private String weatherIcon;

    public Weather(String city, String country, Double temperature, Double feelsLike, Double humidity, Double windSpeed, String weatherDescription, String weatherIcon) {
        this.city = city;
        this.country = country;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.weatherDescription = weatherDescription;
        this.weatherIcon = weatherIcon;
    }

    public Weather() {
    }

    public String getCity() {
        return city;
    }

    public String getCountry() { return country; }

    public Double getTemperature() {
        return temperature;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }
    
    public String getWeatherIcon() {
        return weatherIcon;
    }

    public void setCity(String city) { this.city = city; }

    public void setCountry(String country) { this.country = country; }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }
    
    
    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", temperature='" + temperature + '\'' +
                ", feelsLike='" + feelsLike + '\'' +
                ", humidity='" + humidity + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", weatherDescription='" + weatherDescription + '\'' +
                ", weatherIcon='" + weatherIcon + '\'' +
                '}';
    }
    
}
