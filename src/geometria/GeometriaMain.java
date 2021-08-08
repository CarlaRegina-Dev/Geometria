package geometria;
/*
 * @SENAI CIMATEC
 * @author Carla Regina dos Anjos dos Santos; 
 * @NOTURNO 211-DES-2N-DES082;
 */
public class GeometriaMain {

    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado(2.5);
        
        Quadrado.setDiag(1.41);
            System.out.println("-------> Quadrado com Diagonal = 1.41 ");
            System.out.printf(" Área de Q1: %.3f Cm²\n", quadrado.getArea());
            System.out.printf(" Parímetro de Q1: %.3f Cm\n", quadrado.getPerimetro());
            System.out.printf(" Diagonal de Q1: %.3f Cm\n", quadrado.getDiagonal());
        
        Quadrado.setDiag(Math.sqrt(2));
            System.out.println("-------> Quadrado com Diagonal da Classe Math ");
            System.out.printf("Diagonal de Q1: %.3f Cm\n", quadrado.getDiagonal());
        
        Circulo circulo = new Circulo(2.5);
        
        Circulo.setPi(3.14);
            System.out.println("-------> Círculo com PI = 3.14 ");
            System.out.printf(" Área de C1: %.3f Cm²\n",circulo.getArea());
            System.out.printf(" Circunferência de C1: %.3f Cm\n",circulo.getCircuferencia());
        
        Circulo.setPi(Math.PI);
            System.out.println("-------> Círculo do PI da Classe Math ");
            System.out.printf(" Área de C1: %.3f Cm²\n",circulo.getArea());
            System.out.printf(" Circunferência de C1: %.3f Cm\n",circulo.getCircuferencia());      
    }    
}
