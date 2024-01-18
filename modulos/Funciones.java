package modulos;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;


public class Funciones {
    public String register(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = sc.next();
        System.out.print("Escribe tu edad: ");
        int edad = sc.nextInt();

        return nombre + ","+edad;
    }

    public void setNameUsers(HashMap<String,Integer> ddbb){
        if(ddbb.size() == 0){
            System.out.println("La base de datos no tiene usuarios registrados.");
        }else{
            Set<String> names = ddbb.keySet();
            for(String keys: names){
                System.out.println(String.format("Nombre: %s", keys));
            }
        }
    }

    public void setAgeUser(HashMap<String,Integer> ddbb){
        if(ddbb.size() == 0){
            System.out.println("La base de datos no tiene usuarios registrados.");
        }else{
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Escribe tu nombre: ");
    
            String nombre = sc.next();
            
            if(ddbb.get(nombre) != null){
                System.out.println(String.format("Edad de %s : %s", nombre, ddbb.get(nombre)));
            }else{
                System.out.println(String.format("El nombre %s no esta registrado", nombre));
            }
        }
    }
    
    public HashMap removeUser(HashMap<String,Integer> ddbb){
        if(ddbb.size() == 0){
            System.out.println("La base de datos no tiene usuarios registrados.");
            return ddbb;
        }else{
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Escribe el usuario que deseas eliminar: ");

            String nombre = sc.next();

            if(ddbb.get(nombre) != null){
                ddbb.remove(nombre);
                System.out.println("Usuario eliminado con exito.");

                return ddbb;
            }else{
                System.out.println(String.format("El nombre %s no esta registrado.", nombre));

                return ddbb;
            }
        }
    }
}
