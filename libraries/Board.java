package main;

public class Board {
    private Card[] cards;

    public Board() {

    }
    public Board(int size_of_board) {

        switch (size_of_board)
        {
            case 12:
                cards = new Card[12];
                for(int i = 0 ; i <cards.length;i++)
                {
                    cards[i] = new Card();              //plansza 3x4
                }
                break;
            case 16:
                cards = new Card[16];
                for(int i = 0 ; i <cards.length;i++)
                {
                    cards[i] = new Card();              //plansza 4x4
                }
                break;
            case 20:
                cards = new Card[20];
                for(int i = 0 ; i <cards.length;i++)
                {
                    cards[i] = new Card();              //plansza 4x5
                }
                break;
            default:
                System.out.println("ERROR");
                break;

        }

    }
    public void generateBoard() {
        //generowanie planszy
    }


}