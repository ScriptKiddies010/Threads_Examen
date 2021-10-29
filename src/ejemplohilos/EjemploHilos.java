package ejemplohilos;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploHilos extends Thread {

    EjemploHilos(String nombre) {
        super(nombre);
    }
    Random p = new Random();

    public void run() {

        try {

            int par = 0;
            int inp = 0;
            int num_aleatorio = 0, i, num;
            int acumulador = 0;
            int sumap = 0;
            int sumai = 0;
            int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0, siete = 0, ocho = 0, nueve = 0, diez = 0;

            for (i = 1; i <= 10; i++) {

                num_aleatorio = (int) (Math.random() * 10) + 1;

                if (num_aleatorio == 1) {
                    uno++;
                }
                if (num_aleatorio == 2) {
                    dos++;
                }
                if (num_aleatorio == 3) {
                    tres++;
                }
                if (num_aleatorio == 4) {
                    cuatro++;
                }
                if (num_aleatorio == 5) {
                    cinco++;
                }
                if (num_aleatorio == 6) {
                    seis++;
                }
                if (num_aleatorio == 7) {
                    siete++;
                }
                if (num_aleatorio == 8) {
                    ocho++;
                }
                if (num_aleatorio == 9) {
                    nueve++;
                }
                if (num_aleatorio == 10) {
                    diez++;
                }

                num = num_aleatorio % 2;

                if (num == 0) {
                    //System.out.print(+num_aleatorio+",");
                    par = par + 1;
                    acumulador = acumulador + num_aleatorio;
                    sumap = sumap + num_aleatorio;
                }
                if (num != 0) {
                    //System.out.println(+num_aleatorio+",");
                    inp = inp + 1;
                    acumulador = acumulador + num_aleatorio;
                    sumai = sumai + num_aleatorio;
                }

                System.out.print(+num_aleatorio + ",");

            }

            uno = uno - 1;
            dos = dos - 1;
            tres = tres - 1;
            cuatro = cuatro - 1;
            cinco = cinco - 1;
            seis = seis - 1;
            siete = siete - 1;
            ocho = ocho - 1;
            nueve = nueve - 1;
            diez = diez - 1;

            if (uno == -1) {
                uno = 0;
            }
            if (dos == -1) {
                dos = 0;
            }
            if (tres == -1) {
                tres = 0;
            }
            if (cuatro == -1) {
                cuatro = 0;
            }
            if (cinco == -1) {
                cinco = 0;
            }
            if (seis == -1) {
                seis = 0;
            }
            if (siete == -1) {
                siete = 0;
            }
            if (ocho == -1) {
                ocho = 0;
            }
            if (nueve == -1) {
                nueve = 0;
            }
            if (diez == -1) {
                diez = 0;
            }

            System.out.println("");
            Thread.sleep(2000);
            System.out.println("a)Pares= " + par + " Impares= " + inp);

            Thread.sleep(2000);

            System.out.println("b)Suma pares= " + sumap + " suma impares= " + sumai);

            Thread.sleep(2000);

            System.out.println("c)Suma de los 10 números aleatorios= " + acumulador);

            Thread.sleep(2000);

            System.out.println("d)Números repetidos para cada número:");

            System.out.println("rep 1 = " + uno + ", rep 2 = " + dos + ", rep 3 = " + tres + ", rep 4 = " + cuatro + ", rep 5 = " + cinco + ", rep 6 = " + seis + ", rep 7 = " + siete + ", rep 8 = " + ocho + ", rep 9 = " + nueve + ", rep 10 = " + diez);

            //System.out.println("HILO EN EJECICION "+super.getName());
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
