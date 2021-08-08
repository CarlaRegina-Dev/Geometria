package geometria;
/*
 * @SENAI CIMATEC
 * @author Carla Regina dos Anjos dos Santos; 
 * @NOTURNO 211-DES-2N-DES082;
 */
public class Quadrado {
    private double lado;
    private static double diag;
    
    public Quadrado(double lado){  
        this.lado=lado;
    }
        public double getArea(){
            double area= lado*lado;
            return area;
        }
        
        public double getPerimetro(){
            double perimetro=lado*4;
            return perimetro;
        }
        
        public double getDiagonal(){
            double diagonal=lado*diag;
            return diagonal;          
        }
        
        public static void setDiag(double diag){
            Quadrado.diag=diag;
                
        }
}
