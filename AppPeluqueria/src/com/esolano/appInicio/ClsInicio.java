package com.esolano.appInicio;

import com.esolano.list.enmEstado;
import com.esolano.personas.ClsBarbero;
import com.esolano.personas.ClsCliente;

import java.util.Scanner;

public class ClsInicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         ClsCliente cliente =  new ClsCliente();

    ClsBarbero[] barbero = new  ClsBarbero[4];
    barbero[0] = new ClsBarbero("Andres","Cuesta","3217459874","O+ ", enmEstado.Disponible);
    barbero[1] = new ClsBarbero("Stivem","Andrade","3217459874","A+ ", enmEstado.Ausente);
    barbero[2] = new ClsBarbero("Carlos","Diaz","3217459874","O+ ", enmEstado.Ocupado);
    barbero[3] = new ClsBarbero("Manuel","Paez","3217459874","O+ ", enmEstado.Disponible);

        System.out.println("iniciando registro cita :  ");
        System.out.println("----- lista de barberos ------");
        for (int i = 0; i < barbero.length; i++) {
            System.out.println(i + " -> " + barbero[i]);
        }

        System.out.println("Ingrese el numero del barbero");
        int indice = sc.nextInt();

        if(indice >= 0 && indice < barbero.length){
            ClsBarbero elegido = barbero[indice];

            if (elegido.getEstado() == enmEstado.Disponible){
                System.out.println("BARBERO ASIGNADO");
                System.out.println("ingrese informacion cliente");
                System.out.println("ingrese Nombre : ");
               cliente.setNombre(sc.next());
                System.out.println("Ingrese apellido :");
                cliente.setApellido(sc.next());
                System.out.println("Ingrese # de telefono : ");
                cliente.setTelefono(sc.next());
                System.out.println("Ingrese edad :");
                cliente.setEdad(sc.next());

            } else if (elegido.getEstado() == enmEstado.Ausente || elegido.getEstado() == enmEstado.Ocupado) {
                System.out.println("el barbero no esta disponible");
            }
        }else {
            System.out.println("indice invalido");
        }

        System.out.println();

        /** -- aqui dentro del void    */
    }
}
