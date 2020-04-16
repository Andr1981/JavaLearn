import java.util.Scanner;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int userGuess;
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        simpleDotCom.locationCell = (int) (Math.random() * 4);
        for (int i = 0; i < simpleDotCom.locationCells.length; i++) {
            simpleDotCom.locationCells[i] = simpleDotCom.locationCell + i;
        }
        simpleDotCom.setLocationCells(simpleDotCom.locationCells);
        Scanner scanner = new Scanner(System.in);

        while (simpleDotCom.isAlive) {
            System.out.println();
            System.out.println("Введите число от 0 до  " +
                    simpleDotCom.locationCells[simpleDotCom.locationCells.length - 1]);
            userGuess = scanner.nextInt();
            simpleDotCom.checkYourself(userGuess);
        }


    }
}
