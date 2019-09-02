# Microservicio búsqueda de libros

A través de la API googlebooks, el microservicio puede buscar diferentes libros que se encuentren en la base de datos.

## Instrucciones para correr el microservicio

1. Ejecutar "docker pull gcarvaja/bm-querydomain" para extraer la imagen desde Docker hub

2. A través de "docker run -d -p 8080:8080 gcarvaja/bm-querydomain" el microservicio estará corriendo en el puerto 8080.

3. Una vez ejecutado el paso anterior, podemos ir a la url localhost:8080/books/"$nombre", donde se mostrará los diferentes libros que contengan
en su nombre la palabra colocada en $nombre, o tambien podemos ir a localhost:8080/singlebooks/"$id, donde se podrá buscar libros dependiendo de su id
