package com.lista_palabras_unicas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese las palabras que desea añadir a la lista (escriba 'close' para terminar): ");

        TreeSet<String> palabras = new TreeSet<>();
        while (true) {
            System.out.print("Palabras: ");
            String palabra = sc.nextLine();

            if (palabra.equalsIgnoreCase("close")) {
                break;
            }

            palabras.add(palabra);
        }

        int opcion;
        do {
            String menu = """
            =============================
            ===   MENU DE OPCIONES   ====
            =============================
            1. Ver lista ordenada A-Z.
            2. Buscar palabra en la lista.
            3. Salir.
            """;
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nLista de palabras ordenadas A-Z");
                    for (String palabra : palabras) {
                        System.out.println(palabra);
                    }
                    break;

                case 2:
                    boolean buscarOtro;
                    do {
                        System.out.println("\nIngrese una palabra para buscar en la lista: ");
                        String busqueda = sc.nextLine();

                        if (palabras.contains(busqueda)) {
                            System.out.println("La palabra " + busqueda + " se encuentra en la lista");
                        } else {
                            System.out.println("La palabra " + busqueda + " No se encuentra en la lista");
                        }

                        System.out.println("¿Desea buscar otra palabra? (s/n): ");
                        String respuesta = sc.nextLine();
                        buscarOtro = respuesta.equalsIgnoreCase("s");
                    } while (buscarOtro);
                    break;

                case 3:
                    System.out.println("¡¡Gracias por usar este programa!!");
                    break;
            
                default:
                System.out.println("Está opción no es válida...");
                    break;
            }

        } while (opcion != 3);

        sc.close();
    }
}