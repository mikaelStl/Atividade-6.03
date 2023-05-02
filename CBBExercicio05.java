public class CBBExercicio05 {
    public static void main(String[] args) {
        int contW = 0;
        int contDW = 0;
        String dias[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta","Sábado", "Domingo"};

        System.out.println("Solução com While:");
        while (contW < dias.length){
            System.out.print(dias[contW] + " ");
            contW += 1;
        }
        System.out.println();

        System.out.println("Solução com Do-While:");
        do{
            System.out.print(dias[contDW] + " ");
            contDW += 1;
        } while(contDW < dias.length);
        System.out.println();

        System.out.println("Solução com For:");
        for (int i = 0; i < dias.length; i++) {
            System.out.print(dias[i] + " ");
        }
    }
}
