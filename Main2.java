public class Main2 {
    public static void main(String[] args) {
        
        int notaPrueba = 7;
        int numeroEntregas = 9;
        int totalEntregas = 10;
        boolean noSeguidaEC = false;
        int notaEntregas = 0;
        int notaPracticas = 8;

        if (notaPrueba < 7) {
            System.out.println("Estás suspendido para la prueba final.");            
        }else if (numeroEntregas < totalEntregas * 70 / 100) {
            System.out.println("No has seguido la evaluación contínua. Estás suspendido.");
            noSeguidaEC = true;
        }else if (numeroEntregas == totalEntregas) {
                    notaEntregas = 10;
        }else if (numeroEntregas >= totalEntregas * 90 / 100) {
            notaEntregas = 8;
        }else if (numeroEntregas >= totalEntregas * 80 /100) {
            notaEntregas = 6;
        }else if (numeroEntregas >= totalEntregas * 70 / 100) {
            notaEntregas = 4;
        }

        int notaFinal = (notaPrueba * 20 / 100) + (notaEntregas * 10 / 100) + (notaPracticas * 70 / 100);

        if (notaFinal < 5) {
            if (noSeguidaEC) {
                System.out.println ("Mejor sigue la evaluación contínua la próxima vez.");
            }else {
                System.out.println("Haz los ejercicios preparatorios para la PAF2.");
            }
        }

        System.out.println("Tu nota final es: " + notaFinal);

    }    
}
