/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bl;

/**
 *
 * @author enesb
 */
public class ig_list {
    class node {
        Object veri;
        /**
         * s=string
         * b=boolean
         * i=int
         * d=double;
         * c=char;
         * bu deyerlerden yanlız biri true olabilir true olan deyer o verinin türünü belirtir
         */
        boolean s,b,i,d,c;
        node ileri;
        node geri;

        public node(Object veri,char tip) {
            this.veri=veri;
            ileri=null;
            geri=null;
            switch (tip) {
                case 's' -> {
                    s=true;
                    b=false;
                    i=false;
                    d=false;
                    c=false;
                }
                    case 'b' -> {
                        s=false;
                        b=true;
                        i=false;
                        d=false;
                        c=false;
                }
                    case 'i' -> {
                        s=false;
                        b=false;
                        i=true;
                        d=false;
                        c=false;
                }
                    case 'd' -> {
                        s=false;
                        b=false;
                        i=false;
                        d=true;
                        c=false;
                }
                    case 'c' -> {
                        s=false;
                        b=false;
                        i=false;
                        d=false;
                        c=true;
                }
            }
        }
        
    }
    
    node baş;
    node son;
    int boyut;

    public ig_list() {
        baş=null;
        son=null;
        boyut=0;
    }
    boolean boşmu(){
        return boyut==0;
    }
    /**
     * String tipinde veri ekler
     * @param veri
     */
    public void ekle(String veri){
        
    }
    
    
}
