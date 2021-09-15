package com.dalfaro.complejos;

class Principal {

    public static void main(String[] main) {

        /*Complejo z, w;
        z = new ComplejoAmpliado(-1.5, 0);
        w = new ComplejoAmpliado(4, 0);
        z.suma(w);
        System.out.println("Complejo: " + z.toString());*/

        Complejo[] lista = new Complejo[4];
        lista[0] = new Complejo(-1.5, 3.0);
        lista[1] = new Complejo(-1.2, -3.0);
        lista[2] = new ComplejoAmpliado(-1.5, 3.0);
        lista[3] = new ComplejoAmpliado(-1.2, 0);

        for (Complejo complejo : lista) {
            System.out.println("Complejo: " + complejo);
            if (complejo instanceof ComplejoAmpliado) {
                System.out.println("  esReal=" + ((ComplejoAmpliado) complejo).esReal());
            }
        }
    }
}