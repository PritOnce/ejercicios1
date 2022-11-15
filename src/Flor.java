public class Flor {
    private String comun;
    private String cientifico;

    public Flor(){

    }
    public Flor(Flor f){
        this.comun=f.comun;
        this.cientifico=f.cientifico;
    }
    public void setComun(String comun){
        this.comun=comun;
    }
    public void setCientifico(String cientifico){
        this.comun=cientifico;
    }
    public String getComun(){
        return comun;
    }
    public String getCientifico(){
        return cientifico;
    }

}
