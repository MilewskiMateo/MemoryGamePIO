package main;

public class Game
{
    private Board board;
    private int score = 0;
    private int multiplier = 0;
    private int lifes = 0;
    private int difficulty = 0;
    private int size_of_board = 0;

    public Game()
    {

    }

    public Game(int difficulty, int size_of_board)
    {
        if(size_of_board != 12 && size_of_board != 16 && size_of_board != 20){
            //TU POLECI ERROR
        }
        if(difficulty != 1 && difficulty != 2 && difficulty != 3){
            //TU POLECI ERROR
        }

        this.difficulty = difficulty;
        this.size_of_board = size_of_board;

        switch(difficulty)
        {
            case 1:
                board = new Board(size_of_board);
                this.lifes = 9999999;
                this.multiplier = 1;
                break;
            case 2:
                board = new Board(size_of_board);
                this.lifes = size_of_board;
                this.multiplier = 2;
                break;
            case 3:
                board = new Board(size_of_board);
                this.lifes = size_of_board / 2;
                this.multiplier = 3;
                break;
            default:
                // MIEJSCE NA ERROR
        }

    }

    public Board getBoard() {
        return board;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getLifes() {
        return lifes;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getScore() {
        return score;
    }

    public int getSize_of_board() {
        return size_of_board;
    }
}

