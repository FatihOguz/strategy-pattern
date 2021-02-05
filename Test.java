package FatihOguz;

import java.util.Scanner;

/**
 * give you menu
 * and give command for solve way matix or gauss
 */
public class Test {
    /**
     * create menu
     * @param args no arguman
     */
    public static void main(String args[]){



        Equations equation = new GaussLinear();

        Scanner scanner = new Scanner(System.in);
        int command = -1;
        while(command != 0){


            System.out.println("if you want to solve linear gauss equation press 1");
            System.out.println("if you want to solve linear matrix equation press 2");
            System.out.println("if you want to exit  press 0");
            System.out.println("       GIVE ME ORDER            ");
            command = scanner.nextInt();

            if(command==1){
                equation.setLinearEquation(new LinearGausEquation());
                equation.performLinearEquation();
            }
            else if(command==2){
                equation.setLinearEquation(new LinearMatrisEquation());
                equation.performLinearEquation();
            }
            else if(command == 0){
                System.out.println("       GOOD BY      ");
            }
            else{
                System.out.println("please press 0,1 or 2");
            }
        }




    }
}
