	package com.weather.spring_weather_app;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class WeatherController {

		@Autowired
		private WeatherService weatherService;

		@GetMapping("/")
		public String display() {
			return "weather";
		}

		@GetMapping("/weather")
		public String showWeatherDetails(@RequestParam String city, Model model) {

			WeatherResponse weatherResponse = weatherService.getWeather(city);

			if (weatherResponse == null) {
				model.addAttribute("error", "City not found. Please enter a valid city name.");
			} else {
				model.addAttribute("weather", weatherResponse);
			}

			return "weather";
		}
	}
