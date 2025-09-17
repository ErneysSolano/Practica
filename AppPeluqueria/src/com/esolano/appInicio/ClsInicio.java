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
    barbero[0] = new ClsBarbero("Andres","Cuesta","3217459874","O+", enmEstado.Disponible);
    barbero[1] = new ClsBarbero("Stivem","Andrade","3217459874","A+", enmEstado.Ausente);
    barbero[2] = new ClsBarbero("Carlos","Diaz","3217459874","O+", enmEstado.Ocupado);
    barbero[3] = new ClsBarbero("Manuel","Paez","3217459874","O+", enmEstado.Disponible);

        System.out.println("iniciando registro cita :  ");
        System.out.println("escoga el barbero");
        for (int i = 0; i < barbero.length; i++) {
            System.out.println(i + " -> " + barbero[i]);
        }

        int indice = sc.nextInt();

        if(indice >= 0 && indice < barbero.length){
            ClsBarbero elegido = barbero[indice];

            if (elegido.getEstado() == enmEstado.Disponible){
                System.out.println("BARBERO ASIGNADO");
                System.out.println("ingrese informacion cliente");
                System.out.println("Nombre : ");
                cliente.setNombre(sc.nextLine());
            }else {
                System.out.println("el barbero no esta disponible");
            }
        }else {
            System.out.println("indice invalido");
        }


    }
}
