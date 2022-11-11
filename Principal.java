import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        ArrayList <Double> emisoras =new ArrayList<Double>();
        Scanner keyboard = new Scanner(System.in);
        radio rad = new radio();

        ArrayList <contacto> contactos = new ArrayList<contacto>();
        ArrayList <cancion> canciones =new ArrayList<cancion>();

        ArrayList <cancion> lista1 =new ArrayList<cancion>();
        cancion lloviendoestrellas = new cancion("Lloviendo estrellas","Cristian Castro","pop","4:15 min");
        cancion cuandocalientaelsol = new cancion("Cuando calienta el sol","Luis Miguel","pop","3:55 min");
        cancion silaves = new cancion("Si la ves","Franco de Vita","Balada","3:59 min");
        cancion teamo = new cancion("Te amo","Alexander Acha","Balada","3:52 min");
        lista1.add(lloviendoestrellas);
        lista1.add(cuandocalientaelsol);
        lista1.add(silaves);
        lista1.add(teamo);

        ArrayList <cancion> lista2 =new ArrayList<cancion>();
        cancion changes = new cancion("Changes","2Pac","rap","4:15 min");
        cancion therss = new cancion("The Real Slim Shady, ","Eminem","rap","4:55 min");
        cancion hustlermusic = new cancion("Hustler Music, ","Lil Wayne","rap","4:59 min");
        cancion pitd = new cancion("PRIDE IS THE DEVIL","J. Cole","rap","4:52 min");
        lista2.add(changes);
        lista2.add(therss);
        lista2.add(hustlermusic);
        lista2.add(pitd);

        contacto sr_padre= new contacto("Tyrone the 3","51752312");
        contacto sra_madre= new contacto("Lily Brada","56234123");
        contacto wichomecanico= new contacto("Wicho","30316307");
        contacto sacerdote= new contacto("Jamal","58282853");
        contacto alba= new contacto("Juana la cubana","54185296");
        contactos.add(sr_padre);
        contactos.add(sra_madre);
        contactos.add(wichomecanico);
        contactos.add(sacerdote);
        contactos.add(alba);

        int switch1case = 0;
        while(switch1case != 7)
        {
            System.out.println("----------------------------------------------\n Radio en modo reposo, desea: \n1. Encender Radio \n" + "2. Apagar Radio \n" );
            switch1case = keyboard.nextInt();
            switch(switch1case)
            {
                case 1: 
                {
                    //encender
                    
                    int switch2caseA = 0;
                    System.out.println("¿Qué funcion desea usar? \n 1. Cambiar volumen \n 2. Modo radio \n 3. Modo reproduccion \n 4. Modo telefono \n 5. Modo productividad");
                    switch2caseA = keyboard.nextInt();
                    switch(switch2caseA)
                    {

                        case 1:
                        {
                            //subir o bajar volumen
                            int respuesta = 0;
                            System.out.println("¿Qué desea hacer? \n 1. Subir volumen \n 2. Bajar volumen");
                            respuesta = keyboard.nextInt();
                            if(respuesta == 1||respuesta == 2)
                            {
                                if(respuesta == 1)
                                {
                                    rad.volumen(true);
                                }
                                else
                                {
                                    rad.volumen(false);
                                }
                            }
                            else
                            {
                                System.out.println("Opción no válida");
                            }
                            break;
                        }case 2:
                        {

                            //modo radio
                            int switch3case = 0;
                            System.out.println("Opciones de modo radio: \n 1. Cambiar FM a AM \n 2. Cambiar emiosras \n 3. Guardar emisoras \n 4. Cargar emioras");
                            switch3case = keyboard.nextInt();
                            switch(switch3case)
                            {
                                case 1:
                                {
                                    //cambiar FM o AM
                                    int respuesta = 0;
                                    System.out.println("¿Qué desea hacer? \n 1. Cambiar a FM \n 2. Cambiar a AM");
                                    respuesta = keyboard.nextInt();
                                    if(respuesta == 1||respuesta == 2)
                                    {
                                        if(respuesta == 1)
                                        {
                                            rad.cambiar(true);
                                        }
                                        else
                                        {
                                            rad.cambiar(false);
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Opción no válida");
                                    }       
                                    break;
                                }case 2:
                                {
                                    //cambiar emisoras
                                    int respuesta = 0;
                                    System.out.println("¿Qué desea hacer? \n 1. Subir de frecuencia \n 2. Bajar la frecuencia");
                                    respuesta = keyboard.nextInt();
                                    if(respuesta == 1||respuesta == 2)
                                    {
                                        if(respuesta == 1)
                                        {
                                            rad.cambiar_e(true);
                                        }
                                        else if (respuesta == 2)
                                        {
                                            rad.cambiar_e(false);
                                        }else{
                                            System.out.println("opcion no valida");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Opción no válida");
                                    }
                                    break;
                                }case 3:
                                {
                                    //guardar emisoras
                                    System.out.println("Ingrese la frecuencia de la emisora que desee agregar");
                                    Double emi= keyboard.nextDouble();
                                    rad.guardar(emisoras, emi);
                                    break;
                                }case 4:
                                {
                                    //cargar emisoras
                                    rad.cargar(emisoras);
                                    break;
                                }
                                
                            }
                            break;
                        }case 3:
                        {
                            //modo reproduccion
                            int switch4case = 0;
                            System.out.println("Opciones de modo reproduccion: \n 1. Seleccionar lista de reproduccion \n 2. Cambiar cancion \n 3. Datos de la cancion ");
                            switch4case = keyboard.nextInt();
                            switch(switch4case)
                            {
                                case 1:
                                {
                                    //Seleccionar listas de reproduccion
                                    int respuesta = 0;
                                    System.out.println("¿Qué playlist desea escoger? \n 1. Musica balada y pop \n 2. Rap ");
                                    respuesta = keyboard.nextInt();
                                    if(respuesta == 1)
                                    {
                                        rad.seleccionar(lista1);

                                    }else if (respuesta == 2){
                                        rad.seleccionar(lista2);
                                    }else
                                    {
                                        System.out.println("Debe seleccionar una de las playlists");
                                        break;
                                    }
                                    break;
                                }case 2:
                                {
                                    //cambiar cancion
                                    int respuesta = 0;
                                    System.out.println("¿Qué desea hacer? \n 1. Adelantar la cancion \n 2. Regresar la cancion");
                                    respuesta = keyboard.nextInt();

                                    //chequear
                                    if(respuesta == 1||respuesta == 2)
                                    {
                                        if(respuesta == 1)
                                        {
                                            rad.cambiar_c(true, canciones);
                                            System.out.println("Se ha adelantado una cancion");
                                        }
                                        else
                                        {
                                            rad.cambiar_c(false, canciones);
                                            System.out.println("Se ha regresado una cancion");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Opción no válida");
                                    }
                                    break;
                                }case 3:
                                {
                                    //Escuchar cancion o seas datos de la cancion: autor, duracion y asi
                                        rad.escuchar(canciones);
                                    break;
                                }
                            }
                            break;

                        }case 4:
                        {
                            //modo telefono
                            int switch5case = 0;
                            System.out.println("Opciones de modo telefono: \n 1. Conectar o desconectar \n 2. Mostrar contactos \n 3. Llamar contacto ");
                            switch5case = keyboard.nextInt();
                            switch(switch5case)
                            {
                                case 1:
                                {
                                   //conectar/desconectar telefono
                                    int respuesta = 0;
                                    System.out.println("¿Qué desea hacer? \n 1. Conectar telefono \n 2. Desconectar");
                                    respuesta = keyboard.nextInt();
                                    if(respuesta == 1||respuesta == 2)
                                    {
                                        if(respuesta == 1)
                                        {
                                            rad.conexion(true);
                                        }
                                        else
                                        {
                                            rad.conexion(false);
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Opción no válida");
                                    }
                                   break;
                                }case 2:
                                {
                                    //mostrar contactos
                                    rad.contactos(contactos);
                                    break;
                                }case 3:
                                {
                                    //llamar contacto   
                                    rad.llamar(contactos);
                                    int respuesta = 0;
                                    System.out.println("--------------------------------------- \nCuando desee finalizar la llamada presione [1] \nSi desea cambiar entre auriculares y speaker presione [2]");
                                    respuesta = keyboard.nextInt();
                                    if (respuesta == 1||respuesta == 2)
                                    {
                                        if(respuesta == 1)
                                        {
                                            rad.finalizar();
                                        }
                                        else if(respuesta == 2)
                                        {
                                            //cambiar a speaker o auriculares
                                            int respuesta1 = 0;
                                            System.out.println("¿A que desea cambiar? \n1. speaker \n2. audifonos ");
                                            respuesta1 = keyboard.nextInt();
                                            if(respuesta1 == 1||respuesta1 == 2)
                                            {
                                                if(respuesta1 == 1)
                                                {
                                                    rad.audio(true);
                                                }
                                                else if(respuesta1 == 2)
                                                {
                                                    rad.audio(false);
                                                }else{
                                                    System.out.println("Opción no válida");
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("Opción no válida");
                                            }

                                        }else
                                        {
                                            System.out.println("Opción no válida");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Opción no válida");
                                    }
                                    
                                    

                                        

                                    break;
                                }
                            }
                            break;
                        }
                        case 5:
                        {
                            //modo productividad
                            int switch6case = 0;
                            System.out.println("¿Desea planificar viaje? \n 1. Si \n 2. No");
                            switch6case = keyboard.nextInt();
                            switch(switch6case){
                                case 1:
                                {
                                    //planificar viaje
                                    System.out.println("Ingrese el destino de su viaje");
                                    String destinoviaje ="";
                                    destinoviaje = keyboard.next();
                                    if(destinoviaje == "")
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println(rad.viajes(destinoviaje));
                                    }
                                    break;
                                }case 2:
                                {
                                    break;
                                }

                            }
                            break;
                        }

                    }

                }case 2:
                {
                    //Apagar radio
                    
                    break;
                }
            }
        }
    }
}