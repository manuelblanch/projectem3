/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectem3;

/**
 *
 * @author manuel
 */
public class Memoria {

    private String tipus;
    private String marca;
    private double preu;
    private boolean ssd;
    private boolean omplit;
    //private boolean memoria;
    //private boolean esssd;

//    public Memoria(String marca){
//        this.marca=marca;
//    }
    public Memoria() {
    }
    
    public Memoria(String marca) {
        this.marca=marca;
    }
    
    public Memoria(String marca, String tipus){
        this.marca=marca;
        this.tipus=tipus;
    }
    @Override
    public String toString() {

        return "\ntipus: " + tipus
                + "\nmarca: " + marca
                + "\npreu: " + preu
                + (ssd ? "\nEs SSD" : "\nEs HD");
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        if (preu < 0) {
            System.out.println("Els preus no poden ser negatius");
        } else {
            this.preu = (int) preu;
        }

        this.preu = (int) preu;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

}
