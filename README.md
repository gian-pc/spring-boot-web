Proyecto 1

1. Creación del proyecto - spring-boot-web
   - Maven
   - Java 17
   - Dependencias:
     - Spring Boot Actuator
     - Spring Web
     - Thymeleaf
2. Creación de IndexController
   - Creación de index.html
   - Creación de home.html
   - Uso de @Controller
   - Uso de la anotación @RequestMapping
   - Reemplazo de la anotación @RequestMapping por @GetMapping
   - Multiples rutas con {}
3. Creación de UsuarioController
   - Rutas de primer Nivel: @RequestMapping
   - Creamos usuario/index.html
   - http://localhost:8080/usuario/index
4. Enviando datos a una vista
   - Uso de la interfaz Model en IndexController
   - Uso de Thymeleaf en index
5. Creación de un modelo(Usuario)
   - Creación del package models
   - Creación de la Clase Usuario
   - Creamos el método perfil en IndexController
   - Instanciamos Usuario en el método perfil
   - Creamos perfil.html
   - Enviamos los datos de usuario a la vista perfil
   - http://localhost:8080/perfil
6. Usando directiva If
   - Agregamos el atributo email en Usuario
   - Agregamos la directiva If en perfil para mostrar email
7. Trabajando con varios usuarios
   - Generando un nuevo método "lista" en IndexController
   - Creamos una lista "usuarios"
   - Creamos los constructores en la clase Usuario
   - Generamos los usuarios y enviamos a la lista
   - Creamos lista.html
   - Generamos un Bucle con th:each
   - http://localhost:8080/lista
8. Configurando Bootstrap
   - Link: https://getbootstrap.com/
9. @ModelAttribute
   - @ModelAttribute permite que el método esté disponible para todo el controlador
   - Cualquier vista puede implementar el método
   - Nos ayuda a simplificar código