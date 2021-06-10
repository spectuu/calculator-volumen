package com.spectu.calculator;

public class CalculatorCommands {

    private ScannerWrapper scanner;

    public CalculatorCommands() {

        this.scanner = new ScannerWrapper();

    }

    public void start() {
        System.out.println("Bienvenido a la calculadora :D");
        while (true)
            update();

    }

    public void update() {
        System.out.println("¿Que vamos a calcular hoy?");
        System.out.println("[1] para hallar el Volumen del cilindro.");
        System.out.println("[2] para hallar el Volumen del cubo.");
        System.out.println("[3] para hallar el Volumen del Cono.");
        System.out.println("[4] para hallar el Volumen de la esfera.");
        int comando = scanner.getInt();

        if (comando == 1) {
            System.out.println("Ingrese el valor del Radio");
            int r = scanner.getInt();
            System.out.println("Ingrese el valor del a altura");
            int h = scanner.getInt();
            r = r * r;
            int resultado = r * h;
            System.out.println("V= " + resultado + "π");
            return;
        }

        if (comando == 2) {
            System.out.println("Ingrese el valor de la Arista");
            int a = scanner.getInt();
            a = a * a * a;
            System.out.println("V=" + a);
            return;
        }

        if (comando == 3) {

            System.out.println("Ingrese el valor del Radio");
            int r = scanner.getInt();
            System.out.println("Ingrese el valor de la altura");
            int h = scanner.getInt();
            r = r * r;
            int resultado = r * h / 3;
            System.out.println("V= " + resultado + "π");
            return;
        }

        if (comando == 4) {

            System.out.println("Ingrese el valor del radio");
            int r = scanner.getInt();
            r = r * r * r;
            int num = 4;
            int den = 3;
            int numR = r;
            int denR = 1;
            numR = numR * num;
            denR = den * denR;
            String resultado = numR + "/" + denR;
            System.out.println("V= " + resultado + "π");
            return;
        }
    }
}
