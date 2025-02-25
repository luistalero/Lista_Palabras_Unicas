# 🚀 Ejercicio #6 - Lista de Palabras Únicas con TreeSet  

# 📌 Propósito  
Este programa en Java permite gestionar una lista de palabras únicas utilizando la estructura de datos `TreeSet<String>`. Con esta implementación, las palabras se almacenan de manera ordenada alfabéticamente y sin permitir duplicados. El programa permite:  

1. Registrar palabras.  
2. Mostrar la lista de palabras en orden A-Z.  
3. Buscar una palabra en la lista.  
4. Salir del programa.  

El proyecto utiliza conceptos fundamentales de programación en Java, como `TreeSet`, `Scanner` para la entrada de datos y estructuras de control como bucles y condicionales.   

# 🛠️ Instalación y Configuración  

## Requisitos Previos  
- Java Development Kit (JDK) 17 o superior  
- Git instalado en tu sistema  

## Clonar Repositorio  
```bash
https://github.com/luistalero/Lista_Palabras_Unicas.git
``` 

# 🚀 Uso  

## 1. Registro de Palabras:  
- El programa solicitará al usuario que ingrese palabras una por una.  
- Se validará si desea agregar más palabras.  
- Se almacenarán en un `TreeSet<String>` para mantener el orden alfabético sin duplicados.  

## 2. Mostrar Lista Ordenada A-Z:  
- Al seleccionar la opción Uno (1) del menú, se mostrarán todas las palabras registradas ordenadas de la A a la Z.  

## 3. Buscar una Palabra:  
- Al seleccionar la opción Dos (2) del menú, se solicitará al usuario ingresar una palabra para buscarla en la lista.  
- Se informará si la palabra está o no en la lista.  

## 4. Salir:  
- Al seleccionar la opción Tres (3) del menú, el programa finalizará con un mensaje de despedida.   

# 👷 Ejemplo de Ejecución  
```bash
Ingrese las palabras que desea añadir a la lista:
Palabras: "Manzana"
¿Desea añadir otra palabra? (s/n): "s"
Palabras: "Banana"
¿Desea añadir otra palabra? (s/n): "s"
Palabras: "Cereza"
¿Desea añadir otra palabra? (s/n): "n"
```  

```bash
=============================
===   MENU DE OPCIONES   ====
=============================
1. Ver lista ordenada A-Z.
2. Buscar palabra en la lista.
3. Salir.

Seleccione una opción: "1"
Lista de palabras ordenadas A-Z:
Banana
Cereza
Manzana
```  

```bash
Seleccione una opción: "2"
Ingrese una palabra para buscar en la lista: "Manzana"
La palabra Manzana se encuentra en la lista.

¿Desea buscar otra palabra? (s/n): "n"
```  

```bash
Seleccione una opción: "3"
¡¡Gracias por usar este programa!!
``` 

# 📋 Características  
- Registro de palabras sin permitir duplicados utilizando `TreeSet<String>`.  
- Mostrar todas las palabras en orden alfabético.  
- Búsqueda eficiente de palabras dentro de la lista.  
- Interfaz de usuario interactiva con un menú de opciones.   

# 🚨 Estado del Ejercicio  
- ✅ **Culminado**  

# 👤 Autor  
- **Luis Alberto Talero Martinez** 