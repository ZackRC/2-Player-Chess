package com.example.chess;

import android.widget.TextView;
import android.widget.Toast;

public abstract class AbstractPiece {

    static boolean isWhite;

    public AbstractPiece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract void draw();

    public abstract boolean isMoveValid(int srcRow, int srcCol, int destRow,
                                        int destCol, TextView toSquare);

    public boolean isNotSameColor(TextView toSquare) {
        if(isWhite) {
            return !toSquare.getText().equals("♙") && !toSquare.getText().equals("♘")
                    && !toSquare.getText().equals("♗") && !toSquare.getText().equals("♖")
                    && !toSquare.getText().equals("♕") && !toSquare.getText().equals("♔");
        } else {
            return !toSquare.getText().equals("♟") && !toSquare.getText().equals("♞")
                    && !toSquare.getText().equals("♝") && !toSquare.getText().equals("♜")
                    && !toSquare.getText().equals("♛") && !toSquare.getText().equals("♚");
        }
    }

    public abstract int relativeValue();

}

