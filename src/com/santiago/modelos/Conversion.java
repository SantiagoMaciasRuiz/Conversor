package com.santiago.modelos;

import java.util.Scanner;

public class Conversion {
    Menu menu = new Menu();
    Scanner lectura = new Scanner(System.in);
    Consultas consulta = new Consultas();

    public int cantidad;
    public float ConvertirMoneda(int valor){

        switch (valor){
            case 1:
                menu.mensaje2();
                cantidad = lectura.nextInt();
                var tipoMoneda = "USD";
                var tipoMoneda2 = "ARS";
                double moneda = consulta.buscaMonedas(tipoMoneda,tipoMoneda2);
                float valorConvertido = (float) (moneda * (float) cantidad);
                System.out.println("El valor "+ (float) cantidad+ " ["+tipoMoneda + "]" +" Corresponde al valor final de ==>" + valorConvertido + " ["+ tipoMoneda2+"]");
                return  valorConvertido;
        }


        return 0;
    }
}
