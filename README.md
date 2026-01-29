🌦️ Weatherly (SkyCast) - Weather Forecasting App

Weatherly, also known as SkyCast, is a modern weather forecasting web application that provides real-time weather information for any city in the world.
It is built using Spring Boot and web technologies to deliver accurate and user-friendly weather updates.

🚀 Features
🌍 Search weather by city name
🌡️ Real-time temperature display
☁️ Weather conditions (Cloudy, Sunny, Rainy, etc.)
💧 Humidity and wind speed
💾 User-friendly interface
⚡ Fast and reliable weather data using external Weather API
📱 Responsive UI
🌙 Icon-based Dark / Light theme toggle
📊 Weather details (feels like, min/max temp, humidity, wind)
⚠️ Clean popup alert for invalid city names


🛠️ Tech Stack
>Backend
  Java
  Spring Boot
  REST API
  Maven

>Frontend
  HTML
  CSS
  JavaScript
  Thymeleaf

>API
  OpenWeatherMap API.

📂 Project Structure
spring-weather-app
│
├── .idea/
├── .mvn/
├── settings/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/weather/spring_weather_app/
│   │   │       ├── SpringWeatherAppApplication.java   # Main Spring Boot class
│   │   │       ├── WeatherController.java             # Controller layer
│   │   │       ├── WeatherService.java                # Service layer
│   │   │       ├── WeatherResponse.java               # Response model
│   │   │       ├── Main.java                          # Weather data model
│   │   │       ├── Weather.java                       # Weather model
│   │   │       └── Wind.java                          # Wind model
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── style.css                          # CSS styles
│   │       │   └── theme.js                           # JavaScript for theme toggle
│   │       │
│   │       ├── templates/
│   │       │   └── weather.html                       # Thymeleaf HTML page
│   │       │
│   │       └── application.properties                 # Configuration file
│   │
│   └── test/
│
├── pom.xml                                           # Maven dependencies
├── mvnw
├── mvnw.cmd
├── .gitignore
└── README.md


⚙️ How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/Mastershiva/SkyCast-Weather-Forecasting-Web-Application.git

2️⃣ Open in IntelliJ IDEA

  Open IntelliJ
  Click Open Project
  Select the project folder

3️⃣ Configure API Key
In application.properties, add your weather API key:

weather.api.key=49f2e11cf6855921d5880af5b51eac3e

4️⃣ Run the Application
Run the main Spring Boot class

Open browser and visit:
http://localhost:8080

🌟 App Name Meaning
  Weatherly – A smart and modern weather forecasting app.
  SkyCast – Another creative name representing sky and weather predictions.

Both names represent the same application.

📸 Screenshots 
<img width="1898" height="1015" alt="weatherapp1" src="https://github.com/user-attachments/assets/a2a831d5-13b5-4338-aed5-3481cf67cb81" />
<img width="1910" height="990" alt="weatherapp4" src="https://github.com/user-attachments/assets/cfadfd0b-7683-4691-9e4b-8b9ccbae4688" />
<img width="1904" height="981" alt="weatherapp2" src="https://github.com/user-attachments/assets/a30c15f0-495e-47e8-a162-381cad74cfae" />
<img width="1919" height="971" alt="weatherapp3" src="https://github.com/user-attachments/assets/51905109-33ed-4681-84ee-cfbb75a80c66" />


👨‍💻 Developer
Shiva Narayanan S
Java Full Stack Developer

GitHub: https://github.com/MasterShiva
LinkedIn: https://www.linkedin.com/in/shiva-narayanan05/

📜 License
This project is for educational purposes.

