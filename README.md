SpringBoot RAML Projekt
===================
Ein Beispiel SpringBoot RAML Projekt

# Dokumentation

# Voraussetzung
Es wird Docker benötigt.

# Install
mvn package docker:build

# Starten
docker-compose up

# Stoppen 
docker-compose down

# Manueller Test
curl localhost:8080/v1/profile

# Plugins
- RAML
- Spring Boot