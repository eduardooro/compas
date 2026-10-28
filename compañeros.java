package com.utc;

import java.util.LinkedList;
import java.util.Scanner;

public class compañeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> companeros = new LinkedList<>();

        System.out.println("Ingresa el nombre de 13 compañeros:");
        for (int i = 1; i <= 13; i++) {
            System.out.print("Compañero " + i + ": ");
            companeros.add(scanner.nextLine());
        }
        System.out.println("\nLista inicial: " + companeros);

        System.out.print("\nNombre para agregar AL INICIO: ");
        companeros.addFirst(scanner.nextLine());

        System.out.print("Nombre para agregar AL FINAL: ");
        companeros.addLast(scanner.nextLine());
        System.out.println("Lista actualizada: " + companeros);

        System.out.println("\nPrimero en la lista: " + companeros.getFirst());
        System.out.println("Último en la lista: " + companeros.getLast());
        System.out.println("Total de compañeros: " + companeros.size());

        companeros.removeFirst(); 
        companeros.removeLast(); 
        System.out.println("\nLista tras quitar el primero y el último: " + companeros);

        System.out.print("\n¿A quién deseas buscar en la lista?: ");
        String buscar = scanner.nextLine();
        if (companeros.contains(buscar)) {
            System.out.println(buscar + " sí está en la lista.");
        } else {
            System.out.println(buscar + " no se encuentra.");
        }

        companeros.clear();
        System.out.println("\nLista después de borrar todo (clear): " + companeros);

        scanner.close();
    }
}