package com.mycompany.funciones2;

import javax.swing.JOptionPane;

/**
 *
 * @author Franco
 */
public class Funciones2 {

    static String vehiculo[] = new String[5];
    static String placa[] = new String[5];
    static String nombreDeCliente[] = new String[5];
    static String telefono[] = new String[5];

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenidos al  parqueadero  'El guardián'");
        menu();

    }
 

    static void registro() {

        if (vehiculo[0] != null && vehiculo[1] != null && vehiculo[2] != null && vehiculo[3] != null && vehiculo[4] != null) {
            JOptionPane.showMessageDialog(null, "Sin lugares disponibles ");
            menu();
        }

        for (int i = 0; i < 5; i++) {
            if (vehiculo[i] == null) {

                vehiculo[i] = JOptionPane.showInputDialog("Marca de vehiculo \n ");
                placa[i]=  JOptionPane.showInputDialog("Placa de vehiculo\n ");
                nombreDeCliente[i] = JOptionPane.showInputDialog("Nombre Completo propietario\n ");
                telefono[i]=  JOptionPane.showInputDialog("Telefono propietario\n ");
                
                menu();

            }
        }

    }

    static void vehiculo() {
        for (int i = 0; i < 5; i++) {
            if (vehiculo[i] == null) {
                JOptionPane.showMessageDialog(null, "Plaza " + (i + 1) + ": Disponible ");
            } else {
                JOptionPane.showMessageDialog(null, "Plaza " + (i + 1) + ": ocupada por " + vehiculo[i] + " placa:  " + placa[i]);

            }

        }

        menu();
    }

    static void reporte() {
        
        String  usuario = JOptionPane.showInputDialog("Intruduzca la plaza en la que se encuentra el vehiculo\n ");
                  
            JOptionPane.showMessageDialog(null, "El vehiculo pertenece a:  " + nombreDeCliente[Integer.parseInt(usuario) - 1] + " " + telefono[Integer.parseInt(usuario) - 1 ]);
            menu();
        }
       
    
    
    
        static void busqueda()  {
          
        String placaBusqueda =  JOptionPane.showInputDialog("Placa de vehiculo a buscar\n ");
        
        for (int i = 0; i < 5; i++) {
            if (placa[i].equals(placaBusqueda) ) {                
            JOptionPane.showMessageDialog(null, "El vehiculo esta en la plaza:  " + (i+1) + " y esta registrado a nombre de " + nombreDeCliente[i]  );
                menu();
            }
            if (placa[1].equals(placaBusqueda) == false && placa[2].equals(placaBusqueda) == false && placa[3].equals(placaBusqueda) == placa[4].equals(placaBusqueda) == placa[0].equals(placaBusqueda) == false) {
            JOptionPane.showMessageDialog(null, "Vehiculo no registrado ");
            menu();
        }
            

        }
        }

            static void retirar()  {
          
        String placaBusqueda =  JOptionPane.showInputDialog("Placa de vehiculo a retirar\n ");
        String retirando =  JOptionPane.showInputDialog("Nombre de quien lo retira\n ");
        for (int i = 0; i < 5; i++) {
            if (placa[i].equals(placaBusqueda)  ) {                
            JOptionPane.showMessageDialog(null, "El vehiculo de la plaza:  " + (i+1) + " lo retira  " + retirando  );
                placa[i] = null;
                nombreDeCliente[i] = null;
                vehiculo[i]=null;
                telefono[i]=null;
                
                menu();
            }
            if (placa[1].equals(placaBusqueda) == false && placa[2].equals(placaBusqueda) == false && placa[3].equals(placaBusqueda) == placa[4].equals(placaBusqueda) == placa[0].equals(placaBusqueda) == false) {
            JOptionPane.showMessageDialog(null, "Vehiculo no se encuentra en el estacionamiento ");
            menu();
        }
            

        }
        }
        
        
    static void menu() {


        byte opcion = Byte.parseByte(JOptionPane.showInputDialog("""
                                                                 MENU PRINCIPAL
                                                                 1: Registrar 
                                                                 2: Ver plazas disponibles
                                                                 3: Buscar vehiculo 
                                                                 4: Reportar incidente 
                                                                 5: Retirar
                                                                 6: Salir
                                                                 ELIJA SU OPCION"""));
        do {
            switch (opcion) {

                case 1 -> {
                    registro();
                }
                case 2 -> {
                    vehiculo();
                }
                case 3 -> {
                    busqueda();
                }
                case 4 ->
                    reporte();
                 case 5 ->
                    retirar();
                case 6 ->
                    opcion = 6;
                default -> {
                    JOptionPane.showMessageDialog(null, "Entrada invalida");
                    menu();
                }
            }
        } while (opcion != 6);
        JOptionPane.showMessageDialog(null, "Esperamos regrese pronto");
    }

}
