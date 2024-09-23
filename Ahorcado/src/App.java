import java.util.Scanner;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la palabra secreta: ");
        String palabraOculta = scanner.next();
        palabraOculta = palabraOculta.toLowerCase();
        int numIntentos= 0;
        boolean GameOver = false;
        TreeSet <Character> letrasUsadas = new TreeSet<>();
        char letra;

        char [] palabraSecreta = new char[palabraOculta.length()];
        for(int i = 0; i< palabraOculta.length(); i++){
            palabraSecreta[i] = '_';
        }
        

        for(int i =0; i<50; i++){
            System.out.println();
        }

        while (!GameOver) {
            switch (numIntentos) {
                case 0:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("=========");
                    
                    break;
                case 1:
                    System.out.println();
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("=========");
                    break;
                case 2:
                    System.out.println("_______");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("=========");
                    break;
                case 3:
                    System.out.println("_______");
                    System.out.println("|     |");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("=========");
                    break;
                case 4:
                    System.out.println("_______");
                    System.out.println("|     |");
                    System.out.println("|     O");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("=========");
                    break;
                case 5:
                    System.out.println("_______");
                    System.out.println("|     |");
                    System.out.println("|     O");
                    System.out.println("|     |");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("=========");
                    break;
                case 6:
                    System.out.println("_______");
                    System.out.println("|     |");
                    System.out.println("|     O");
                    System.out.println("|    /|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("=========");
                    break;

                case 7:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     O");
                System.out.println("|    /|\\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("=========");
                break;

                case 8:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     O");
                System.out.println("|    /|\\");
                System.out.println("|    /");
                System.out.println("|");
                System.out.println("|");
                System.out.println("=========");
                break;

                case 9:
                    System.out.println("_______");
                    System.out.println("|     |");
                    System.out.println("|     O");
                    System.out.println("|    /|\\");
                    System.out.println("|    / \\");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("=========");
                break;

                case 10:
                System.out.println("_______");
                System.out.println("|     |");
                System.out.println("|     O");
                System.out.println("|    /|\\");
                System.out.println("|    / \\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("=========");
                    GameOver = true;
                    System.out.println("Te quedaste sin intentos \nLa palabra secreta era: "+ palabraOculta);
                    break;
                
                default:
                    break;
            }


            for(char secreto : palabraSecreta){
                System.out.print(secreto);
            }

            System.out.print("\n\nLetras Usadas: "); 

            for(char secreto : letrasUsadas){
                System.out.print(secreto+" ");
            }
            System.out.println();

            if(!GameOver){
                letra = scanner.next().toLowerCase().charAt(0);
                if(!letrasUsadas.contains(letra)){
                    if(palabraOculta.indexOf(letra) != -1){
                        for(int i = 0; i< palabraOculta.length(); i++){
                            if(palabraOculta.charAt(i) == letra){
                                palabraSecreta[i] = letra;
                            }
                        }
                    }else{
                        numIntentos++;
                    }
                    letrasUsadas.add(letra);
                }
            }else{
                break;
            }
            GameOver = true;
            for(char secreto : palabraSecreta){
                
                if(secreto == '_'){
                    GameOver = false;
                }
            }
            
            if(!GameOver){
                for(int i =0; i<50; i++){
                    System.out.println();
                }
        
            }else{
                System.out.println(palabraOculta);
            }

        }


    }
}
