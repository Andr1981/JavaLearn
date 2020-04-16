public class SimpleDotCom {
    int locationCell;
    int[] locationCells = new int[3];
    int numOfHits = 0;
    boolean isAlive = true;
    int numOfGuess = 0;


    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }

    public boolean checkYourself(int stringGuess) {
        ++numOfGuess;
        int guess = stringGuess;
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
            isAlive = false;

        }
        System.out.println(result + " количество попаданий - " + numOfHits + " Количество выстрелов - " + numOfGuess);
        return isAlive;
    }
}
