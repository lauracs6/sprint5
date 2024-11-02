public class Main{
    public static void main(String[] args) {      

        int edad = 8;
        int ciclo = 0;
        int curso = 0; 


        if (edad < 3) {
            System.out.println("Es demasiado pequeño");
            
        }else if (edad < 6) {
            ciclo = 0;            
        }else if (edad < 7) {
            curso = 1;
            ciclo = 1;
        }else if (edad < 8) {
            curso = 2;
            ciclo = 1;
        }else if (edad < 9) {
            curso = 3;
            ciclo = 2;    
        }else if (edad < 10) {
            curso = 4;
            ciclo = 2;
        }else if (edad < 11) {
            curso = 5;
            ciclo = 3;
        }else if (edad < 12) {
            curso = 6;
            ciclo = 3;            
        }else{
            System.out.println("Es demasiado mayor");
            System.exit(0);
        }

        
        switch (ciclo) {

            case 0 -> System.out.println("Es de educación infantil.");
            
            case 1 -> System.out.println("Es de primer ciclo. Ciclo inicial.");                
            
            case 2 -> System.out.println("Es de segundo ciclo. Ciclo medio.");                            
            
            case 3 -> System.out.println("Es de tercer ciclo. Ciclo superior.");
                               
        }

        if (edad >= 3) {
            System.out.println("Es de " + curso + "º curso");
        }else {
            System.exit(0);
        }

    }
}
