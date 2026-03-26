# --- GIAI DOAN 1: BUILD ---
FROM maven:3.9.11-eclipse-temurin-21 AS builder
WORKDIR /app
COPY . .
# Bien dich code thanh file .jar (bo qua chay thu test de build nhanh)
RUN mvn package -DskipTests

# --- GIAI DOAN 2: RUN ---
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
# Chi lay file .jar tu builder (GD1)
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 80
# Lenh "bat cong tac" de chay ung dung
ENTRYPOINT ["java", "-jar", "app.jar"]
