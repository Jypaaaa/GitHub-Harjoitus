public class App {
    public static void main(String[] args) throws Exception {
        int ika = 35;
        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
        
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
        //Määritellään, saako ajaa kevaria
            if (ika >= 16 && ika < 18) {
                System.out.println("Saat ajaa kevaria");
            }

            //Määritellään eri iät ja printattu teksti
        } else if (ika == 18) {
            System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa");
        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
            if (ika == 65) {
                System.out.println("Hyviä eläkepäiviä!");
            }
        } else {
            System.out.println("Olet aikuinen");
        
            if (ika % 10 == 0) {
                System.out.println("Onnittelut tasavuosikymmenistä!");
            }
        
            if (ika == 100) {
                System.out.println("Paljon onnea!");
                System.out.println("Olet saavuttanut 100 vuoden iän!");
                System.out.println("Toivotamme sinulle kaikkea hyvää!");
            }
        
            if (ika >= 58) {
                System.out.println("Voit mennä varhaiseläkkeelle");
            }
        
            if (ika >= 40 && ika <= 50) {
                System.out.println("Parasta keski-ikää!");
            }
        }
        
    }
}
