# rest-llm

This is a playground for building a REST API for LLMs using FastAPI and LangChain. The goal is to create a simple and extensible API that can be used to interact with various LLMs and tools.

```cmd
ollama run llama3.2
```

```cmd
cd api
mvn clean package
mvn quarks:dev
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

