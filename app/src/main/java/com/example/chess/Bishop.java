package com.example.chess;

import android.widget.TextView;

public class Bishop extends AbstractPiece {

    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public void draw() {
        if (isWhite) {
            System.out.print("\u2657");
        } else {
            System.out.print("\u265D");
        }
    }

    private static Boolean diagonalPath(int srcRow, int srcCol,
                                        int destRow, int destCol) {
        return ((Math.abs(srcRow - destRow) == Math.abs(srcCol
                - destCol)));
    }

    @Override
    public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol, TextView toSquare) {
        return diagonalPath(srcRow, srcCol, destRow, destCol) && isNotSameColor(toSquare);
    }

    @Override
    public int relativeValue() {
        return 3;
    }

}
