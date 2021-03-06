package com.example.chess;

import android.widget.TextView;

public class Rook extends AbstractPiece {

    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public void draw() {
        if (isWhite){
            System.out.print("\u2656");
        }
        else{
            System.out.print("\u265C");
        }
    }

    private static Boolean straightPath(int srcRow, int srcCol,
                                        int destRow, int destCol) {
        return !((srcRow != destRow) && (srcCol != destCol));
    }

    @Override
    public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol, TextView toSquare) {
        return straightPath(srcRow, srcCol, destRow, destCol) && isNotSameColor(toSquare);
    }

    @Override
    public int relativeValue() {
        return 5;
    }

}
