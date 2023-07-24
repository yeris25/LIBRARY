package personallibrary;

import java.util.Scanner;

public class Menu {

    Scanner sc= new Scanner(System.in);

    public void menuApp(){

        int opc;
    do{
        System.out.println("------------------------------");
        System.out.println("Sistema Personal de Biblioteca");
        System.out.println("<<<<<Menú>>>>>");
        System.out.println("1. Registrar libro \n" +
                "2. Actualizar Libro \n" +
                "3. Listar Libros \n" +
                "4. Borrar Registro de Libro \n" +
                "5. Salir de la Aplicacion \n");
        System.out.println("----------------------------------");

        System.out.println("Seleccione una Opcion" );

        opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("1: Registrar libro \n");
                LibraryService.createBook();
                break;
            case 2:
                System.out.println("2. Actualizar datos del libro \n");
                break;
            case 3:
                System.out.println("3. Listar registro de libro \n");
                break;
            case 4:
                System.out.println("4. Eliminar registro de libro \n");
                break;
            case 5:
                System.out.println("5. Salir de la aplicacion \n");
        }


    }while(opc!=5);

}
}
