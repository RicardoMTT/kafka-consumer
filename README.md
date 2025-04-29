## Pasos

1. Tener levantado zookeeper

  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
  
2. Levantar kafka
   .\bin\windows\kafka-server-start.bat .\config\server.properties

3. Con eso se debe tener un topico donde el producer envie el mensaje y el consumer lo escuche, nuestro topico es devs4j-topic
