import java.util.HashMap;
import java.util.Scanner;
import modulos.Funciones;


public class Registro {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        Funciones func = new Funciones();

        HashMap <String,Integer> ddbb = new HashMap<String,Integer>();

        while(true){

            System.out.print("MENU: \n 1- Deseas registrarte?  \n 2- Deseas saber el nombre de nuestros usuarios? \n 3- Deseas saber la edad de algun usuario? \n 4- Desea borrar un usuario? \n 5- Deseas salir del programa? \n Respuesta: ");

            String resp = sc.next();

            //System.out.println(resp.getClass().getSimpleName());

            if(resp.compareTo("1") == 0){

                String data = func.register();

                String[] info = data.split(",");

                ddbb.put(info[0],Integer.parseInt(info[1]));


            }else if(resp.compareTo("2") == 0){

                func.setNameUsers(ddbb);

            }else if(resp.compareTo("3") == 0){

                func.setAgeUser(ddbb);
            }else if(resp.compareTo("4") == 0){

                ddbb = func.removeUser(ddbb);

            }else if(resp.compareTo("5") == 0){

                break;

            }else{

                System.out.println("Por favor escoja una de las opciones que se le proporcionan en el menu.");
            }
        }

        System.out.println("Fin del programa.");
    }
}