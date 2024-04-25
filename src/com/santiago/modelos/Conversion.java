package com.santiago.modelos;

import java.util.Scanner;

public class Conversion {
    Menu menu = new Menu();
    Scanner lectura = new Scanner(System.in);
    Consultas consulta = new Consultas();

    public int cantidad;
    public String tipoMoneda;
    public String tipoMoneda2;
    private double moneda;
    private float valorConvertido;
    public float ConvertirMoneda(int valor){

        switch (valor){
            case 1:
                menu.mensaje2();
                cantidad = lectura.nextInt();
                tipoMoneda = "USD";
                tipoMoneda2 = "ARS";
                moneda = consulta.buscaMonedas(tipoMoneda,tipoMoneda2);
                valorConvertido = (float) (moneda * (float) cantidad);
                System.out.println("El valor "+ (float) cantidad+ " ["+tipoMoneda + "]" +" Corresponde al valor final de ==>" + valorConvertido + " ["+ tipoMoneda2+"]");
                return  valorConvertido;

            case 2:
                menu.mensaje2();
                cantidad = lectura.nextInt();
                tipoMoneda = "ARS";
                tipoMoneda2 = "USD";
                moneda = consulta.buscaMonedas(tipoMoneda,tipoMoneda2);
                valorConvertido = (float) (moneda * (float) cantidad);
                System.out.println("El valor "+ (float) cantidad+ " ["+tipoMoneda + "]" +" Corresponde al valor final de ==>" + valorConvertido + " ["+ tipoMoneda2+"]");
                return  valorConvertido;
            case 3:
                menu.mensaje2();
                cantidad = lectura.nextInt();
                tipoMoneda = "USD";
                tipoMoneda2 = "BRL";
                moneda = consulta.buscaMonedas(tipoMoneda,tipoMoneda2);
                valorConvertido = (float) (moneda * (float) cantidad);
                System.out.println("El valor "+ (float) cantidad+ " ["+tipoMoneda + "]" +" Corresponde al valor final de ==>" + valorConvertido + " ["+ tipoMoneda2+"]");
                return  valorConvertido;
            case 4:
                menu.mensaje2();
                cantidad = lectura.nextInt();
                tipoMoneda = "BRL";
                tipoMoneda2 = "USD";
                moneda = consulta.buscaMonedas(tipoMoneda,tipoMoneda2);
                valorConvertido = (float) (moneda * (float) cantidad);
                System.out.println("El valor "+ (float) cantidad+ " ["+tipoMoneda + "]" +" Corresponde al valor final de ==>" + valorConvertido + " ["+ tipoMoneda2+"]");
                return  valorConvertido;
            case 5:
                menu.mensaje2();
                cantidad = lectura.nextInt();
                tipoMoneda = "USD";
                tipoMoneda2 = "COP";
                moneda = consulta.buscaMonedas(tipoMoneda,tipoMoneda2);
                valorConvertido = (float) (moneda * (float) cantidad);
                System.out.println("El valor "+ (float) cantidad+ " ["+tipoMoneda + "]" +" Corresponde al valor final de ==>" + valorConvertido + " ["+ tipoMoneda2+"]");
                return  valorConvertido;
            case 6:
                menu.mensaje2();
                cantidad = lectura.nextInt();
                tipoMoneda = "COP";
                tipoMoneda2 = "USD";
                moneda = consulta.buscaMonedas(tipoMoneda,tipoMoneda2);
                valorConvertido = (float) (moneda * (float) cantidad);
                System.out.println("El valor "+ (float) cantidad+ " ["+tipoMoneda + "]" +" Corresponde al valor final de ==>" + valorConvertido + " ["+ tipoMoneda2+"]");
                return  valorConvertido;
            case 7:
                System.out.println("FINALIZANDO EL PROGRAMA...");
                return 7;


        }


        return 0;
    }
}
