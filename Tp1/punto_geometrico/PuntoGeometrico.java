package punto_geometrico;

public class PuntoGeometrico {
    private double cordX;
    private  double cordY;

    public PuntoGeometrico(double cordX, double cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }
    public PuntoGeometrico(){
        this(0,0);
    }

    public double getCordX() {
        return cordX;
    }

    public void setCordX(double cordX) {
        this.cordX = cordX;
    }

    public double getCordY() {
        return cordY;
    }

    public void setCordY(double cordY) {
        this.cordY = cordY;
    }

    public void desplazarPunto (double despX, double desplY){
        cordX+=despX;
        cordY+=desplY;
    }

    public double getDistanciaEuc(PuntoGeometrico punto2){
        return Math.sqrt(Math.pow(getCordX() - punto2.getCordX(),2) + Math.pow(getCordY() - punto2.getCordY(),2));
    }


}
