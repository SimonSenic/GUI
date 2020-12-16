package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    private int[][] array = { {1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1} };
    public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
            btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;

    public void btn1_click(ActionEvent actionEvent){
        changeTile(2,0,1);
        changeTile(5,1,0);
        changeTile(6,1,1);
    }

    public void btn2_click(ActionEvent actionEvent){
        changeTile(1,0,0);
        changeTile(3,0,2);
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(7,1,2);
    }

    public void btn3_click(ActionEvent actionEvent){
        changeTile(2,0,1);
        changeTile(4,0,3);
        changeTile(6,1,1);
        changeTile(7,1,2);
        changeTile(8,1,3);
    }

    public void btn4_click(ActionEvent actionEvent){
        changeTile(3,0,2);
        changeTile(7,1,2);
        changeTile(8,1,3);
    }

    public void btn5_click(ActionEvent actionEvent){
        changeTile(1,0,0);
        changeTile(2,0,1);
        changeTile(6,1,1);
        changeTile(9,2,0);
        changeTile(10,2,1);
    }

    public void btn6_click(ActionEvent actionEvent){
        changeTile(1,0,0);
        changeTile(2,0,1);
        changeTile(3,0,2);
        changeTile(5,1,0);
        changeTile(7,1,2);
        changeTile(9,2,0);
        changeTile(10,2,1);
        changeTile(11,2,2);
    }

    public void btn7_click(ActionEvent actionEvent){
        changeTile(2,0,1);
        changeTile(3,0,2);
        changeTile(4,0,3);
        changeTile(6,1,1);
        changeTile(8,1,3);
        changeTile(10,2,1);
        changeTile(11,2,2);
        changeTile(12,2,3);
    }

    public void btn8_click(ActionEvent actionEvent){
        changeTile(3, 0, 2);
        changeTile(4, 0, 3);
        changeTile(7, 1, 2);
        changeTile(11, 2, 2);
        changeTile(12, 2, 3);
    }

    public void btn9_click(ActionEvent actionEvent){
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(10,2,1);
        changeTile(13,3,0);
        changeTile(14,3,1);
    }

    public void btn10_click(ActionEvent actionEvent){
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(7,1,2);
        changeTile(9,2,0);
        changeTile(11,2,2);
        changeTile(13,3,0);
        changeTile(14,3,1);
        changeTile(15,3,2);
    }

    public void btn11_click(ActionEvent actionEvent){
        changeTile(6,1,1);
        changeTile(7,1,2);
        changeTile(8,1,3);
        changeTile(10,2,1);
        changeTile(12,2,3);
        changeTile(14,3,1);
        changeTile(15,3,2);
        changeTile(16,3,3);
    }

    public void btn12_click(ActionEvent actionEvent){
        changeTile(7, 1, 2);
        changeTile(8, 1, 3);
        changeTile(11, 2, 2);
        changeTile(15, 3, 2);
        changeTile(16, 3, 3);
    }

    public void btn13_click(ActionEvent actionEvent){
        changeTile(9, 2, 0);
        changeTile(10, 2, 1);
        changeTile(14, 3, 1);
    }

    public void btn14_click(ActionEvent actionEvent){
        changeTile(9, 2, 0);
        changeTile(10, 2, 1);
        changeTile(11, 2, 2);
        changeTile(13, 3, 0);
        changeTile(15, 3, 2);
    }

    public void btn15_click(ActionEvent actionEvent){
        changeTile(10, 2, 1);
        changeTile(11, 2, 2);
        changeTile(12, 2, 3);
        changeTile(14, 3, 1);
        changeTile(16, 3, 3);
    }

    public void btn16_click(ActionEvent actionEvent){
        changeTile(11, 2, 2);
        changeTile(12, 2, 3);
        changeTile(15, 3, 2);
    }

    public void changeTile(int value, int row, int col){
        if(array[row][col]==0) array[row][col]=1; else array[row][col]=0;

        switch(value){
            case 1: if(array[0][0]==0) btn1.setText("O"); else btn1.setText("X"); break;
            case 2: if(array[0][1]==0) btn2.setText("O"); else btn2.setText("X"); break;
            case 3: if(array[0][2]==0) btn3.setText("O"); else btn3.setText("X"); break;
            case 4: if(array[0][3]==0) btn4.setText("O"); else btn4.setText("X"); break;
            case 5: if(array[1][0]==0) btn5.setText("O"); else btn5.setText("X"); break;
            case 6: if(array[1][1]==0) btn6.setText("O"); else btn6.setText("X"); break;
            case 7: if(array[1][2]==0) btn7.setText("O"); else btn7.setText("X"); break;
            case 8: if(array[1][3]==0) btn8.setText("O"); else btn8.setText("X"); break;
            case 9: if(array[2][0]==0) btn9.setText("O"); else btn9.setText("X"); break;
            case 10: if(array[2][1]==0) btn10.setText("O"); else btn10.setText("X"); break;
            case 11: if(array[2][2]==0) btn11.setText("O"); else btn11.setText("X"); break;
            case 12: if(array[2][3]==0) btn12.setText("O"); else btn12.setText("X"); break;
            case 13: if(array[3][0]==0) btn13.setText("O"); else btn13.setText("X"); break;
            case 14: if(array[3][1]==0) btn14.setText("O"); else btn14.setText("X"); break;
            case 15: if(array[3][2]==0) btn15.setText("O"); else btn15.setText("X"); break;
            case 16: if(array[3][3]==0) btn16.setText("O"); else btn16.setText("X"); break;
        }
    }

}
