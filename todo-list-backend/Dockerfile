# Usa l'immagine ufficiale di OpenJDK come base
FROM openjdk:17-jdk-slim

# Imposta la directory di lavoro nel container
WORKDIR /app

# Copia il file JAR nel container
COPY target/todolist-0.0.1-SNAPSHOT.jar app.jar

# Espone la porta 8080
EXPOSE 8080

# Comando di avvio dell'applicazione
ENTRYPOINT ["java", "-jar", "app.jar"]
