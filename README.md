# Pasos para levantar Kafka y probar Producer/Consumer

## 1. Levantar Zookeeper

```bash
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

## 2. Levantar Kafka

```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

## 3. Comunicación entre Producer y Consumer

- El Producer enviará mensajes al tópico devs4j-topic.

- El Consumer escuchará mensajes desde el mismo tópico devs4j-topic.
