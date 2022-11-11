import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        radio rad = new radio();
        int switch1case = 0;
        while(switch1case != 7)
        {
            System.out.println("1. Encender Radio \n" + "2. Apagar Radio \n" );
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
                                    break;
                                }case 2:
                                {
                                    //cambiar emisoras
                                    break;
                                }case 3:
                                {
                                    //guardar emisoras
                                    break;
                                }case 4:
                                {
                                    //cargar emisoras
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
                                    break;
                                }case 2:
                                {
                                    //cambiar cancion
                                    break;
                                }case 3:
                                {
                                    //Escuchar cancion o seas datos de la cancion: autor, duracion y asi
                                    break;
                                }
                            }
                            break;

                        }case 4:
                        {
                            //modo telefono
                            int switch5case = 0;
                            System.out.println("Opciones de modo telefono: \n 1. Conectar o desconectar \n 2. Mostrar contactos \n 3. Llamar contacto \n 4. Finalizar llamada \n 5. Cambiar a speaker o auriculares");
                            switch5case = keyboard.nextInt();
                            switch(switch5case)
                            {
                                case 1:
                                {
                                   //conectar/desconectar telefono
                                   break;
                                }case 2:
                                {
                                    //mostrar contactos
                                    break;
                                }case 3:
                                {
                                    //llamar contacto
                                    break;
                                }case 4:
                                {
                                    //finalizar llamada
                                    break;
                                }case 5:
                                {
                                    //cambiar a speaker o auriculares
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