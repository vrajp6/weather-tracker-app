import React, { useState } from "react";


const Weather = () => {
    
    const [city, setCity] = useState('');
    const [weather, setWeather] = useState(null);

    const fetchWeather = async () => {
        const response = await fetch(`http://localhost:8080/weather/${city}`);
        const data = await response.json();
        console.log(data);
        setWeather(data);
    };

    return (
        <div className="weather-container">
        <input 
            type="text" 
            value={city} 
            onChange={(e) => setCity(e.target.value)} 
            placeholder="Enter city name"
        />
        <button onClick={fetchWeather}>Get Weather</button>
        {weather && (
            <div className="weather-result">
                <div className="desc">
                    <h2>{weather.city}, {weather.country}</h2>
                    <div className="weather-details">
                        <div className="weather-icon">
                            {weather.weatherIcon && (
                                <img 
                                    src={`http://openweathermap.org/img/wn/${weather.weatherIcon}@2x.png`} 
                                    alt="Weather Icon"
                                />
                            )}
                        </div>
                        <p className="weather-description">{weather.weatherDescription}</p>
                    </div>
                </div>
                <div className="values">
                    <p>Temperature: {parseFloat(weather.temperature.toFixed(2))}°F</p>
                    <p>Feels Like: {parseFloat(weather.feelsLike.toFixed(2))}°F</p>
                    <p>Humidity: {weather.humidity}%</p>
                    <p>Wind Speed: {weather.windSpeed} km/h</p>
                </div>
            </div>
        )}
    </div>
    

    );
    
}

export default Weather;