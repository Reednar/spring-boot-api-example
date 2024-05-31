# Utilisez l'image de base OpenJDK 17
FROM amazoncorretto:17

# Copiez le fichier JAR de votre application dans l'image Docker
COPY target/recipe-0.0.1-SNAPSHOT.jar /app/recipe-0.0.1-SNAPSHOT.jar

# Commande pour exécuter l'application Spring Boot au démarrage du conteneur
CMD ["java", "-jar", "/app/recipe-0.0.1-SNAPSHOT.jar"]
