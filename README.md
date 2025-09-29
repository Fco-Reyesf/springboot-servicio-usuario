# Prueba técnica
Este programa es para resolver la prueba técnica entregada. Consiste en un servicio que registra usuarios y retorna el listado de usuarios registrados.
### Observaciones
- Se considera como base de datos un listado en memoria.
- El id y nombre en el cuerpo de las solicitudes se puede repetir, pero no el email de los registros.

## Requisitos previos
Para ejecutar el programa se debe contar con un entorno donde pueda ejecutar el programa, este se encuentra utilizando el framework de SpringBoot. 

Nota: se asume que la persona cuenta con los elementos necesarios para solo clonar/descargar el programa y ejecutarlo sin problemas

## Pruebas
Para verificar su funcionamiento se utilizo el programa de Postman, con los siguientes métodos

### Método para obtener el listado completo de usuarios registrados.

La variable port es el puerto utilizado

GET http://localhost:{port}/user

### Método para guardar un usuario.

La variable port es el puerto utilizado

POST http://localhost:{port}/user

#### Body ejemplo
```
{
    "id": 1,
    "name": "Juan Pérez",
    "email": "juan.perez@ejemplo3.com" 
}
```
