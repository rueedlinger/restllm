# rest-llm (Quarkus + Kotlin + LangChain4j)

This is a dummy project setup for building a REST API for LLMs using Quarkus/Kotlin and LangChain4j. 

## Prerequisites
- Java 17
- Maven 3.8.6
- Docker
- Ollama

## Running the Application
To run the application, you need to have Ollama installed and running. You can pull the model using the following command:

```cmd
ollama pull llama3.2
ollama run llama3.2 
```

Then, run the application with:

```cmd
mvn clean package 
mvn -pl api quarkus:dev
```

## API Documentation
http://localhost:8080/q/swagger-ui/

```cmd
curl -X 'POST' \
  'http://localhost:8080/api/llm/input' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "prompt": "What is the capital of France?"
}'
```

