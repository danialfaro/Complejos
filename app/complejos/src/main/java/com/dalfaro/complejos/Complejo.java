package com.dalfaro.complejos;

class Complejo {

    //declaración de atributos
    private double real, imaginario;

    //declaración de constructor
    public Complejo(double real, double imaginario) {
        this.real= real;
        this.imaginario= imaginario;
    }

    //declaración de métodos
    /** Transcribe el complejo a String.
     * @return string con la parte entera y la imaginaria
     */

    public String toString() {
        return real + "+"+ imaginario + "i";
    }

    /** Suma al complejo de este objeto otro complejo.
     * @param v  el complejo que sumamos
     */

    public void suma(Complejo v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }

    public void resta(Complejo v) {
        real = real - v.real;
        imaginario = imaginario - v.imaginario;
    }
}