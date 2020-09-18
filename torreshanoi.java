
package edd9r;

public class EDD9R {

    public static void main(String[] args) {
        // TODO code application logic here
        
        EDD9R th = new EDD9R();
        th.torresHanoi(3, 1, 2, 3);
    }
    
    //creando el metodo para las torres de hanoi
    public void torresHanoi(int discos,int torre1,int torre2,int torre3){
        if(discos==1){
            System.out.println("Mover disco de torre "+torre1+
                    " a torre "+torre3);
        }else{
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre "+torre1+
                    " a torre "+torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
        
    }
    
}
