public class Auto {
    private String marca;
    private String modello;
    private String targa;
    private int cilindrata;

    public Auto (String marca, String modello, int cilindrata, String targa){
        this.cilindrata=cilindrata;
        this.marca=marca;
        this.modello=modello;
        this.targa=targa;
    }
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public int getCilindrata() {
        return cilindrata;
    }
    public String getTarga() {
        return targa;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
     public void setModello(String modello){
        this.modello=modello;
     }
     public void setTarga(String Targa){
        this.targa=targa;
     }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString(){
        return "marca: "+ marca + " modello: " + modello + " cilindrata: " + cilindrata + " targa: " + targa;
    }
}
