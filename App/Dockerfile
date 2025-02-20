# 1️⃣ Pobierz oficjalny obraz JDK
FROM openjdk:23-jdk-slim

# 2️⃣ Ustaw katalog roboczy
WORKDIR /app

# 3️⃣ Skopiuj plik JAR aplikacji do obrazu
COPY build/libs/*.jar app.jar

# 4️⃣ Otwórz port 8080 (lub inny, jeśli Twój projekt używa innego)
EXPOSE 8080

# 5️⃣ Uruchom aplikację
CMD ["java", "-jar", "app.jar"]
