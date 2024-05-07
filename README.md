<div align="end" >
  <img src="logo-alura-black.png" alt="logo-alura" width="200" height="50" />
</div>

## Manipule listas, consuma una API y maneje excepciones

En el último paso de esta formación, continuarás mejorando tus conocimientos en Java, 
adquiriendo habilidades más avanzadas, como la manipulación de listas de objetos. Además, 
aprenderás a consumir APIs de sistemas externos para cargar datos en formato JSON y guardarlos 
como un archivo en la computadora, lo cual es fundamental para la creación de sistemas modernos y conectados. 
Durante este paso, también recibirás instrucciones sobre cómo manejar excepciones que pueden ocurrir en proyectos Java.
Uso Record lanzado oficialmente en Java 16, pero disponible desde Java 14 de forma experimental, Record es una característica que le permite representar una clase inmutable, que contiene solo atributos, constructor y métodos de lectura, de una manera muy simple y sencilla.

### API consultada:
  - [API Star Wars](https://swapi.dev/)

### LIBRERIAS:
  - [GSON](https://mvnrepository.com/artifact/com.google.code.gson/gson)

### machetes langs:
>[!NOTE]
La clase **File** representa un archivo o directorio en el sistema de archivos de la computadora, lo que le permite crear, eliminar, listar y manipular archivos y directorios. Para crear un objeto File, debe pasar la ruta del archivo o directorio como argumento al constructor. Por ejemplo:
>´File file = new File("C:\\miArchivo.txt");´
>En el código anterior se creó un objeto File que apunta al archivo "miArchivo.txt" ubicado en la raíz del disco C:.
La clase File tiene varios métodos útiles para interactuar con archivos y directorios, como exists(), canRead(), canWrite(), isDirectory(), isFile(), mkdir() y delete().

>[!TIP]
Las clases **FileReader y FileWriter** se utilizan para leer y escribir datos en archivos de texto; la clase FileReader lee caracteres de un archivo de texto, mientras que la clase FileWriter escribe los caracteres.
Para usar la clase FileReader, necesita crear un objeto FileReader pasando un objeto File como argumento, que contenga la ruta del archivo que quieres leer. Luego puede leer los datos del archivo usando el método read() o read(char[]). Por ejemplo:
File file = new File("C:\\miArchivo.txt");
FileReader reader = new FileReader(file);
int data = reader.read();
while (data != -1) {
    System.out.print((char) data);
    data = reader.read();
}
reader.close();
En el código anterior se lee el contenido del archivo "miArchivo.txt" y se imprime su contenido en la consola.
La clase **FileWriter** sigue el mismo proceso, pero haciendo lo contrario, es decir, escribiendo caracteres en el archivo. Por ejemplo:
File file = new File("C:\\salida.txt");
FileWriter writer = new FileWriter(file);
writer.write("Hola mundo!");
writer.close();
En el código anterior, se escribe un mensaje en el archivo llamado "salida.txt".
El paquete java.io también proporciona otras clases útiles como:
BufferedReader y BufferedWriter: se utilizan para leer y escribir archivos de texto de manera eficiente, leyendo y escribiendo una línea a la vez. Utilizan un búfer para almacenar datos, lo que hace que la lectura y la escritura sean más rápidas que cuando se hacen de un carácter a la vez;
FileInputStream y FileOutputStream: se utilizan para leer y escribir datos binarios en un archivo. Se utilizan para leer y escribir datos en archivos que no son de texto, como imágenes y archivos de audio;
ObjectInputStream y ObjectOutputStream: se utilizan para leer y escribir objetos en archivos. Esto le permite almacenar objetos Java en archivos para su uso posterior o para transferirlos entre diferentes aplicaciones.

>[!IMPORTANT]
Después de descargar el archivo **Gson**, es hora de agregar esa biblioteca a nuestro proyecto. En IntelliJ, clica en los tres puntitos de la esquina superior izquierda (si es que estan utilizando la version nueva de la interfaz de IntelliJ).
Clica en File > Project Structure.
En Project Structure, navegue hasta Modules > Dependencies, clique en + y seleccione la opción “JARs or Directories…”
Se abrirá una nueva ventana para seleccionar el archivo .jar. Seleccione el lugar donde está el Gson.

>[!NOTE]
>[Patrones de diseño](https://unpocodejava.com/2013/01/02/un-poco-de-patrones-de-diseno-gof-gang-of-four/)
