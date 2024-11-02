public class Main3 {
    public static void main(String[] args) {
        
        int temperatura = 38;
        int edad = 13;
        int peso = 45;
        int dosisParacetamol;

        if (temperatura < 38) {
            System.out.println("El niño está bien.");
        }else if (temperatura < 39) {
            System.out.println("Es recomendable darle un baño para bajarle la temperatura.");
        
            if (edad < 3) {
                System.out.println("Consúlte a un médico.");                
            }else if (edad < 12) {
                dosisParacetamol = 15 * peso;
                System.out.println("La dosis de paracetamol es de " + dosisParacetamol + " mg.");
            }else if (edad >= 12) {
                dosisParacetamol = 500;
                System.out.println("Debe darle " + dosisParacetamol + " mg cada 8 horas.");
            }

        }else if (temperatura >= 40) {
            System.out.println("Debe llevarlo al hospital.");
        }

    }
}
