package Homework3.two;
/*
Nattawat itpma
6509618150
15
 */
import java.util.Random;
import java.util.Scanner;

public class BomberGame {
    private int playerLife = 3;
    private int comLife = 3;
    private GridData[][] board;
    BomberGame(int boardSize,int bombNo){
        int x , y;
        if(boardSize > 2){
            board = new GridData[boardSize][boardSize];
            Random ran = new Random();
            if(bombNo > 4){
                for(int i = 0; i<boardSize; i++){
                    for(int j = 0; j<boardSize; j++)
                        board[i][j] = new GridData();
                }
                for(int i = 0; i<bombNo; i++){
                    x = ran.nextInt(boardSize);
                    y = ran.nextInt(boardSize);
                    if(board[x][y].getHasBomb() == false){
                        board[x][y].setHasBomb(true);
                    }
                }
            }
            else{
                for(int i = 0; i<boardSize; i++){
                    for(int j = 0; j<boardSize; j++)
                        board[i][j] = new GridData();
                }
                for(int i = 0; i<5; i++){
                    x = ran.nextInt(boardSize);
                    y = ran.nextInt(boardSize);
                    if(board[x][y].getHasBomb() == false){
                        board[x][y].setHasBomb(true);
                    }
                }
            }
        }
        else{
            board = new GridData[3][3];
            Random ran = new Random();
            if(bombNo > 4){
                for(int i = 0; i<boardSize; i++){
                    for(int j = 0; j<boardSize; j++)
                        board[i][j] = new GridData();
                }
                for(int i = 0; i<bombNo; i++){
                    x = ran.nextInt(boardSize);
                    y = ran.nextInt(boardSize);
                    if(board[x][y].getHasBomb() == false){
                        board[x][y].setHasBomb(true);
                    }
                }
            }
            else{
                for(int i = 0; i<boardSize; i++){
                    for(int j = 0; j<boardSize; j++)
                        board[i][j] = new GridData();
                }
                for(int i = 0; i<5; i++){
                    x = ran.nextInt(boardSize);
                    y = ran.nextInt(boardSize);
                    if(board[x][y].getHasBomb() == false){
                        board[x][y].setHasBomb(true);
                    }
                }
            }
        }
    }
    public void printAllBomb(){
        for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board.length;j++){
                if(board[i][j].getHasBomb() == true){
                    System.out.print("b ");    
                }
                else{
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }

    public void printBoard(){
        for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board.length; j++){
                if(board[i][j].getOpen() == false && board[i][j].getOpen() == false){
                    System.out.print("X ");
                }
                else if(board[i][j].getOpen() == false || board[i][j].getOpen() && board[i][j].getHasBomb() == false){
                    System.out.print("- ");
                }
                else{
                    System.out.print("b ");
                }
            }System.out.println("");
        }
    }
    public void play(){
        int round = 0,countCom = 0;
        while(playerLife > 0 && comLife > 0){
            Scanner input = new Scanner(System.in);

            if(round%2 == 0){
                System.out.println("------- Player Turn -------");

                System.out.println("Input row");
                int row = input.nextInt();
                input.nextLine();

                System.out.println("Input col");
                int col = input.nextInt();
                input.nextLine();

                if(row > board.length-1 || col > board.length-1 || row < 0 || col < 0){
                    System.out.println("INVALID row or column. Choose again");
                    continue;
                }
                if(board[row][col].getOpen()){
                    System.out.println("Grid " +row +"," +col +" is already opened. Choose again");
					continue;
                }
                else{
                    System.out.println("Openning Grid "+row+" , "+col);
                    board[row][col].setOpen(true);
                    if(board[row][col].getHasBomb()){
                        playerLife--;
                    }
                    printBoard();
                    System.out.println("Player Life: "+playerLife);
                    System.out.println("Computer Life"+comLife);
                }
                
            }
            else{
                Random ran = new Random();
                if(countCom == 0)
                    System.out.println("------- Computer Turn -------");
                int row = ran.nextInt(board.length);
                int col = ran.nextInt(board.length);
                if(row > board.length-1 || col > board.length-1 || row < 0 || col < 0 || board[row][col].getOpen() == true){
                    countCom++;
                    continue;
                }
                System.out.println("Opinnung Grid "+row+" , "+col);
                board[row][col].setOpen(true);
                if(board[row][col].getHasBomb()){
                    comLife--;
                }
                printBoard();
                System.out.println("Player Life: "+playerLife);
                System.out.println("Computer Life"+comLife);

            }
            countCom = 0;
            round++;
        }
        System.out.println("\n------------ Game Ended. All Bombs' Location are -------------");
        printAllBomb();
    }
}
