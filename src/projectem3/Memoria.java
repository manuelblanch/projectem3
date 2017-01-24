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

    private String tipus = null;
    private String marca = null;
    private double preu = 0;
    private boolean ssd = false;
    private boolean omplit = false;
    
//    public Memoria(String marca){
//        this.marca=marca;
//    }
    public Memoria() {
    }

    @Override
    public String toString() {
        return "Memoria{" + "tipus=" + tipus + ", marca=" + marca + ", preu=" + preu + ", ssd=" + ssd + '}';
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
