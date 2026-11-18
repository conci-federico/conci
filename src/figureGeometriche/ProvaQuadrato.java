package figureGeometriche;

/**
 *
 * @author federico.conci
 */
public class ProvaQuadrato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrato q1 = new Quadrato();
        float lato = 5;

        
            
        q1.setLato(lato) ;
        System.out.println(q1.getLato());
        q1.setColore("rosso");
        q1.setMateriale("Titanio");
        
        System.out.println(q1.calcolaArea());
        System.out.println(q1.calcolaPerimetro());
        System.out.println(q1.info());                
    }
    
}
