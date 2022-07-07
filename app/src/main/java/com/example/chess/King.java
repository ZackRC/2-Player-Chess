package com.example.chess;

import android.widget.TextView;
import android.widget.Toast;

public class King extends AbstractPiece {

    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public void draw() {
        if (isWhite) {
            System.out.print("\u2654");
        } else {
            System.out.print("\u265A");
        }
    }

    public Boolean castle(int srcRow, int srcCol, int destRow, int destCol) {
        if ((isWhite && !MainActivity.whiteKingMoved) || (!isWhite && !MainActivity.blackKingMoved)) {
            return (srcRow == 1 && srcCol == 5 && destRow == 1) || (srcRow == 8 && srcCol == 5
            && destRow == 8) && (Math.abs(srcCol - destCol) == 2);
        } else {
            return false;
        }
    }

    public static Boolean isOneSquare(int srcRow, int srcCol, int destRow, int destCol) {
        return Math.abs(destRow - srcRow) == 1 && destCol == srcCol ||
                Math.abs(destCol - srcCol) == 1 && destRow == srcRow ||
                Math.abs(destCol - srcCol) == 1 && Math.abs(destRow - srcRow) == 1;
    }

    @Override
    public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol, TextView toSquare) {
        return ((isOneSquare(srcRow, srcCol, destRow, destCol) ||
                castle(srcRow, srcCol, destRow, srcRow)) && isNotSameColor(toSquare)) || (castle(srcRow,
                srcCol, destRow, destCol) && isNotSameColor(toSquare));
    }

    @Override
    public int relativeValue() {
        return 0;
    }

}
