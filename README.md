feat: Introduce Department Information to Student Login Details

This commit enhances the student login details functionality by adding specific information related to the student's department. The goal is to allow the system to associate each student with their respective academic department.

The following new fields have been added to the student entity:

- `departmentId`: A unique numerical identifier for the department (e.g., 101, 205). This is a private Long to ensure data integrity and efficient database querying.
- `departmentName`: The full name of the department (e.g., Computer Science, Electrical Engineering). This is a private String to store the textual representation of the department's name.
- `departmentAddress`: The physical address or location of the department (e.g., Main Building, Room 302). This is a private String to store the department's address.
- `departmentCode`: A short, often abbreviated code for the department (e.g., CS, EE, MECH). This is a private String for a concise representation of the department.

These fields will be used for various purposes, including:

- Displaying the student's department on their profile.
- Filtering and reporting students based on their department.
- Potentially integrating with department-specific functionalities in the future.

By including these details now, we lay the groundwork for a more comprehensive and informative student management system.


Why this is better for newcomers:

Clear Title: feat: Introduce Department Information to Student Login Details clearly states the purpose.
Contextual Introduction: Explains the "why" behind the change – associating students with departments.
Explicit Field Descriptions: Each field is listed with:
Its exact name as in the code (departmentId).
A brief explanation of what it represents (e.g., "unique numerical identifier").
Its data type and visibility modifier (private Long, private String) to provide technical context for developers.
Purpose and Usage: Clearly outlines how these new fields will be used within the system. This helps newcomers understand the value and impact of these changes.
Future Implications: Briefly mentions potential future integrations, giving a broader perspective.
Well-Structured Formatting: Uses bullet points and clear paragraphs for readability.
How to Use This:

When you commit your changes, instead of using the -m flag for a short message, simply run:

Bash

git commit

kafka-Project commands 
🗂️ Standard Spring Boot Project Structure

spring-boot-app/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── yourname/
│       │           └── project/
│       │               ├── SpringBootApp.java          # Main class with @SpringBootApplication
│       │               ├── controller/
│       │               │   └── MyController.java       # REST endpoints
│       │               ├── service/
│       │               │   └── MyService.java          # Business logic
│       │               ├── repository/
│       │               │   └── MyRepository.java       # Data access layer
│       │               ├── model/
│       │               │   └── MyEntity.java           # JPA entities
│       │               └── config/
│       │                   └── KafkaConfig.java        # Kafka or other app configs
│       └── resources/
│           ├── application.properties                  # App configuration
│           └── logback.xml                             # Logging config (optional)
├── pom.xml                                              # Maven dependencies
└── README.md                                            # Project overview



# **Command	Purpose**

1) zookeeper-server-start.bat	Start Zookeeper service
2) kafka-server-start.bat	Start Kafka broker
3) kafka-topics.bat --create to create new Kafka topic
4) kafka-console-producer.bat	Send messages to a topic
5) kafka-console-consumer.bat	Consume messages from a topic
6) --property print.*=true	Display metadata during consumption
7) kafka-storage.bat random-uuid	Generate cluster UUID (for KRaft)
8) --describe	View topic partition/replica info


# **Kafka-Project-Commands and why used**

Start Zookeeper Server

sh bin/zookeeper-server-start.bat config/zookeeper.properties

Start Kafka Server / Broker

sh bin/kafka-server-start.bat config/server.properties

Create topic

sh bin/kafka-topics.bat --bootstrap-server localhost:9092 --create --topic NewTopic --partitions 3 --replication-factor 1

list out all topic names

sh bin/kafka-topics.bat --bootstrap-server localhost:9092 --list

Describe topics

sh bin/kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic NewTopic

Produce message

sh bin/kafka-console-producer.bat --broker-list localhost:9092 --topic NewTopic

consume message

sh bin/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic NewTopic --from-beginning

Confluent Kafka Community Edition in local
Start Zookeeper Server

bin/zookeeper-server-start etc/kafka/zookeeper.properties

Start Kafka Server / Broker

bin/kafka-server-start etc/kafka/server.properties

Create topic

bin/kafka-topics --bootstrap-server localhost:9092 --create --topic NewTopic1 --partitions 3 --replication-factor 1

list out all topic names

bin/kafka-topics --bootstrap-server localhost:9092 --list

Describe topics

bin/kafka-topics --bootstrap-server localhost:9092 --describe --topic NewTopic1

Produce message
 
bin/kafka-console-producer --broker-list localhost:9092 --topic NewTopic1

consume message

bin/kafka-console-consumer --bootstrap-server localhost:9092 --topic NewTopic1 --from-beginning

Send CSV File data to kafka

bin/kafka-console-producer --broker-list localhost:9092 --topic NewTopic1 <bin/customers.csv

🗂️ Kafka Producer – Java Project Structure

kafka-producer/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── yourname/
│       │           └── kafka/
│       │               ├── producer/
│       │               │   └── KafkaProducerApp.java
│       │               └── config/
│       │                   └── KafkaProducerConfig.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
