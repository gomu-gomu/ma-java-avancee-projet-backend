# Student Manegement Backend

The API for the Student Management project.

## Usage

```sh
# Build and start the Docker container
./scripts/start.sh

# Run the Spring Boot app
./scripts/run.sh
```

## Endpoints

The API can be accessed by appending the specific route to `/api/`. For example, to access a resource named `user`, the URL would be `/api/user`.

### Swagger UI

For a visual representation of the API's endpoints and to interact with them, the Swagger UI is available. It can be accessed at `/api/swagger-ui/index.html`.

### OpenAPI Description

The OpenAPI description, which provides a detailed specification of the API including its endpoints, parameters, and responses, is available at `/api/v3/api-docs`.

| Service      | URL                                                  | Description                      |
|--------------|------------------------------------------------------|----------------------------------|
| **Backend**  | http://localhost:8080/api                            | Access to the API                |
| **Swagger**  | http://localhost:8080/api/swagger-ui/index.html      | Access to Swagger                |
| **OpenAPI**  | http://localhost:8080/api/v3/api-docs                | Access to OpenAPI description    |
| **Info**     | http://localhost:8080/api/actuator/info              | Inspect API info                 |
| **Health**   | http://localhost:8080/api/actuator/health            | Inspect API health               |