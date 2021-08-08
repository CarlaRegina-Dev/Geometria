package geometria;
/*
 * @SENAI CIMATEC
 * @author Carla Regina dos Anjos dos Santos; 
 * @NOTURNO 211-DES-2N-DES082;
 */
public class Circulo {
    private double raio;
    private static double pi;
    
    public Circulo (double raio){
        this.raio=raio;
    }
        public double getArea(){
            double area=pi*(raio*raio);
            return area;
        }
        
        public double getCircuferencia(){
            double circunferencia=2*pi*raio;
            return circunferencia;
        }
        
        public static void setPi(double pi){
            Circulo.pi=pi;
        }
}
