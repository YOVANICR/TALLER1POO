/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1ejercicios;

/**
 *
 * @author yoven
 */
import java.util.Scanner;


public class ProyectoIntegrador {
    public static void main(String[] args) {
        // Crear un objeto para leer datos del teclado
        Scanner scanner = new Scanner(System.in);

        // PEDIR Y CREAR UN LIBRO
        System.out.println("Vamos a crear un libro.");
        System.out.print("Escribe el titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Escribe el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Escribe el número de páginas del libro: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea
        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // Mostrar el libro creado
        System.out.println("Libro creado: " + libro);

        // PEDIR Y CREAR UNA CUENTA BANCARIA
        System.out.println("\nAhora vamos a crear una cuenta bancaria.");
        System.out.print("Escribe el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Escribe el saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el salto de línea
        System.out.print("Escribe el tipo de cuenta (Ahorros/Corriente): ");
        String tipoCuenta = scanner.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // Mostrar la cuenta bancaria creada
        System.out.println("Cuenta bancaria creada: " + cuenta);

        // PEDIR Y CREAR UN ESTUDIANTE
        System.out.println("\nPor último, vamos a crear un estudiante.");
        System.out.print("Escribe el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Escribe la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea
        System.out.print("Escribe el curso del estudiante: ");
        String curso = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostrar el estudiante creado
        System.out.println("Estudiante creado: " + estudiante);

        // Cerrar el scanner (opcional)
        scanner.close();
    }
}