package com.esolano.appInicio;

import com.esolano.list.*;
import com.esolano.personas.ClsBarbero;
import com.esolano.personas.ClsCliente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class ClsInicio {
    public static void main(String[] args) {

        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = fechaHora.format(formato);
        Scanner sc = new Scanner(System.in);
        ClsCliente cliente = new ClsCliente();

        ClsBarbero[] barbero = new ClsBarbero[6];
        barbero[0] = new ClsBarbero("Andres", "Cuesta", "3217459874", "O+ ", enmEstado.Disponible);
        barbero[1] = new ClsBarbero("Stivem", "Andrade", "3217459874", "A+ ", enmEstado.Ausente);
        barbero[2] = new ClsBarbero("Carlos", "Diaz", "3217459874", "O+ ", enmEstado.Ocupado);
        barbero[3] = new ClsBarbero("Manuel", "Paez", "3217459874", "O+ ", enmEstado.Disponible);
        barbero[4] = new ClsBarbero("Samuel", "Lopez", "3217459874", "O+ ", enmEstado.Disponible);
        barbero[5] = new ClsBarbero("Miguel", "Zapata", "3217459874", "O+ ", enmEstado.Disponible);

        System.out.println("iniciando registro cita :  ");
        System.out.println("----- lista de barberos ------");
        for (int i = 0; i < barbero.length; i++) {
            if (barbero[i].getEstado() == enmEstado.Disponible) {
                System.out.println("[" + i + "]. " + barbero[i].getNombre() + " " + barbero[i].getApellido());
            }
        }

        System.out.println("Ingrese el numero del barbero");
        int indice = sc.nextInt();

        System.out.println("Escoja el turno :");
        for (int i = 0; i < EnmTurno.values().length; i++) {
            EnmTurno turno = EnmTurno.values()[i];
            System.out.println("[" + i + "] " + turno.name() + " --> " + turno.getHorario());
        }
        int turnoEscogido = sc.nextInt();
        EnmTurno turnoSeleccionado =  EnmTurno.values()[turnoEscogido];


        ClsBarbero elegido = null;
        if (indice >= 0 && indice < barbero.length) {
            elegido = barbero[indice];

            if (elegido.getEstado() == enmEstado.Disponible) {
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
        } else {
            System.out.println("indice invalido");
        }


        System.out.println("Ecoja el medio de pago con que desea cancelar");
        for (int i = 0; i < enmMedioDePago.values().length; i++) {
            enmMedioDePago medioPg = enmMedioDePago.values()[i];
            System.out.println("[" + i + "] " + medioPg.name() + " --> " + medioPg.getMedioPago());
        }
        int medioPgEscogido = sc.nextInt();
        enmMedioDePago medioPg = enmMedioDePago.values()[medioPgEscogido];


        Random random = new Random();
        int numeroCita = 100000 + random.nextInt(900000); // entre 100000 y 999999

        System.out.println("<--------Detalle final cita ---------------->");
        System.out.println("num consecutivo cita: " + numeroCita);
        System.out.println("Fecha/Hora : " + fechaFormateada);
        System.out.println("Barbero Asignado: " + elegido.getNombre() + " " + elegido.getApellido());
        System.out.println("Turno elegido: " + turnoSeleccionado.getHorario());
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Medio de pago : " + medioPg.getMedioPago());

        /** -- aqui dentro del void    */
    }
}
