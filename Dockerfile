FROM gradle:8.7-jdk21 AS builder

# Set working directory
WORKDIR /app

# Copy Gradle config
COPY build.gradle.kts settings.gradle.kts ./

# Preload dependencies (optional for caching)
RUN gradle dependencies --no-daemon || true

# Copy the full source code
COPY . .

# Build the application
RUN gradle bootJar --no-daemon

FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy JAR file from the build stage
COPY --from=builder /app/build/libs/Bazario.Listings-0.0.1.jar app.jar

# Expose your application's port
EXPOSE 5006

# Launch the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
