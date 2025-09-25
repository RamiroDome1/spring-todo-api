# 📝 Task API

Una API REST simple para manejar tareas hecha con Spring Boot.

## 🛠️ Tecnologías

- **Spring Boot** - Framework principal
- **PostgreSQL** - Base de datos  
- **Maven** - Gestión de dependencias

## 🚀 Cómo ejecutar

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/task-api.git
   ```

2. **Configurar base de datos**
   
   En `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/task_db
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_password
   spring.jpa.hibernate.ddl-auto=create
   ```

3. **Ejecutar**
   ```bash
   mvn spring-boot:run
   ```

4. **¡Listo!** La API está en `http://localhost:8080`

## 📚 Endpoints

| Método | URL | Descripción |
|--------|-----|-------------|
| `GET` | `/tasks` | Obtener todas las tareas |
| `GET` | `/tasks/{id}` | Obtener una tarea específica |
| `POST` | `/tasks` | Crear nueva tarea |
| `PUT` | `/tasks/{id}` | Actualizar tarea |
| `DELETE` | `/tasks/{id}` | Eliminar tarea |

## 💡 Ejemplo de uso

**Crear tarea:**
```bash
curl -X POST http://localhost:8080/tasks \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Mi primera tarea",
    "description": "Aprender Spring Boot",
    "completed": false
  }'
```

**Respuesta:**
```json
{
  "id": 1,
  "title": "Mi primera tarea",
  "description": "Aprender Spring Boot",
  "completed": false,
  "createdAt": "2025-09-24T20:59:37",
  "updatedAt": "2025-09-24T20:59:37"
}
```

## 📁 Estructura

```
src/main/java/com/example/demo/
├── entity/Task.java           # Modelo de datos
├── repository/TaskRepository.java  # Acceso a BD
├── service/TaskService.java   # Lógica de negocio
└── controller/TaskController.java  # API REST
```

---

⭐ **¡Dale una estrella si te gustó!**
