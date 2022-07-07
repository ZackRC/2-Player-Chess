package com.example.chess;

import android.widget.TextView;

public class Pawn extends AbstractPiece {

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public void draw() {
        if (this.isWhite) {
            System.out.print("\u2659");
        }
        if (!(this.isWhite)) {
            System.out.print("\u265F");

        }

    }

    @Override
    public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol, TextView toSquare) {

        if (isWhite) {
            return (((srcCol == destCol) && srcRow == (destRow - 1))
                    || ((srcRow == 2) && (srcCol == destCol) && (srcRow == (destRow - 2)))
                    || ((srcRow == (destRow - 1))
                    && (Math.abs(srcCol - destCol) == 1) && toSquare.getText() != "")) &&
                    isNotSameColor(toSquare);
        }
        else {
            return (((srcCol == destCol) && srcRow == (destRow + 1))
                    || ((srcRow == 7) && (srcCol == destCol) && (srcRow == (destRow + 2)))
                    || ((srcRow == (destRow + 1))
                    && (Math.abs(srcCol - destCol) == 1) && toSquare.getText() != "")) &&
                    isNotSameColor(toSquare);
        }



    }

    @Override
    public int relativeValue() {
        return 1;
    }

}
