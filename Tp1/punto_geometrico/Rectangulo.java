package punto_geometrico;

public class Rectangulo {
    private PuntoGeometrico vertice1;
    private PuntoGeometrico vertice2;
    private PuntoGeometrico vertice3;
    private PuntoGeometrico vertice4;

    public Rectangulo(PuntoGeometrico vertice1, PuntoGeometrico vertice2, PuntoGeometrico vertice3, PuntoGeometrico vertice4) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }

    public PuntoGeometrico getVertice1() {
        return vertice1;
    }

    public void setVertice1(PuntoGeometrico vertice1) {
        this.vertice1 = vertice1;
    }

    public PuntoGeometrico getVertice2() {
        return vertice2;
    }

    public void setVertice2(PuntoGeometrico vertice2) {
        this.vertice2 = vertice2;
    }

    public PuntoGeometrico getVertice3() {
        return vertice3;
    }

    public void setVertice3(PuntoGeometrico vertice3) {
        this.vertice3 = vertice3;
    }

    public PuntoGeometrico getVertice4() {
        return vertice4;
    }

    public void setVertice4(PuntoGeometrico vertice4) {
        this.vertice4 = vertice4;
    }
    public void desplarRect(double despX, double despY){
        vertice1.desplazarPunto(despX,despY);
        vertice2.desplazarPunto(despX,despY);
        vertice3.desplazarPunto(despX,despY);
        vertice4.desplazarPunto(despX,despY);
    }
    public double getAreaRect(){
        return getBase() * getAltura();
    }

    public double getBase(){
        double base = 0;
        if(vertice1.getCordY() == vertice2.getCordY() || vertice1.getCordY () == vertice3.getCordY() ||
                vertice1.getCordY() == vertice4.getCordY()){
            base = Math.abs(vertice1.getCordX() - vertice2.getCordX());
        }
        return base;
    }
    public double getAltura(){
        double altura = 0;
        if(vertice1.getCordX() == vertice2.getCordX() || vertice1.getCordX () == vertice3.getCordX() ||
                vertice1.getCordX() == vertice4.getCordX()){
            altura = Math.abs(vertice1.getCordY() - vertice2.getCordY());
        }
        return altura;
    }

    public int compararRect(Rectangulo rec1){
        return Double.compare(this.getAreaRect(),rec1.getAreaRect());
    }
    public boolean esCuadrado(){
        return getAltura() == getBase();
    }
    public boolean estaAcostado(){
        return getBase() > getAltura();
    }
}
