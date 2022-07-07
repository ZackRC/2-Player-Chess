package com.example.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView square1;
    TextView square2;
    TextView square3;
    TextView square4;
    TextView square5;
    TextView square6;
    TextView square7;
    TextView square8;
    TextView square9;
    TextView square10;
    TextView square11;
    TextView square12;
    TextView square13;
    TextView square14;
    TextView square15;
    TextView square16;
    TextView square17;
    TextView square18;
    TextView square19;
    TextView square20;
    TextView square21;
    TextView square22;
    TextView square23;
    TextView square24;
    TextView square25;
    TextView square26;
    TextView square27;
    TextView square28;
    TextView square29;
    TextView square30;
    TextView square31;
    TextView square32;
    TextView square33;
    TextView square34;
    TextView square35;
    TextView square36;
    TextView square37;
    TextView square38;
    TextView square39;
    TextView square40;
    TextView square41;
    TextView square42;
    TextView square43;
    TextView square44;
    TextView square45;
    TextView square46;
    TextView square47;
    TextView square48;
    TextView square49;
    TextView square50;
    TextView square51;
    TextView square52;
    TextView square53;
    TextView square54;
    TextView square55;
    TextView square56;
    TextView square57;
    TextView square58;
    TextView square59;
    TextView square60;
    TextView square61;
    TextView square62;
    TextView square63;
    TextView square64;

    TextView fromSquare;
    TextView toSquare;

    TableLayout board;

    int srcRow;
    int srcCol;
    int desRow;
    int desCol;

    boolean whiteTurn;
    static boolean whiteKingMoved = false;
    static boolean blackKingMoved = false;

    int whiteScore = 0;
    int blackScore = 0;

    TextView scoreWhite;
    TextView scoreBlack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        whiteTurn = true;
        Toast.makeText(getApplicationContext(), "White to Move", Toast.LENGTH_SHORT).show();

        square1 = findViewById(R.id.textView);
        square2 = findViewById(R.id.textView2);
        square3 = findViewById(R.id.textView3);
        square4 = findViewById(R.id.textView4);
        square5 = findViewById(R.id.textView5);
        square6 = findViewById(R.id.textView6);
        square7 = findViewById(R.id.textView7);
        square8 = findViewById(R.id.textView8);
        square9 = findViewById(R.id.textView9);
        square10 = findViewById(R.id.textView10);
        square11 = findViewById(R.id.textView11);
        square12 = findViewById(R.id.textView12);
        square13 = findViewById(R.id.textView13);
        square14 = findViewById(R.id.textView14);
        square15 = findViewById(R.id.textView15);
        square16 = findViewById(R.id.textView16);
        square17 = findViewById(R.id.textView17);
        square18 = findViewById(R.id.textView18);
        square19 = findViewById(R.id.textView19);
        square20 = findViewById(R.id.textView20);
        square21 = findViewById(R.id.textView21);
        square22 = findViewById(R.id.textView22);
        square23 = findViewById(R.id.textView23);
        square24 = findViewById(R.id.textView24);
        square25 = findViewById(R.id.textView25);
        square26 = findViewById(R.id.textView26);
        square27 = findViewById(R.id.textView27);
        square28 = findViewById(R.id.textView28);
        square29 = findViewById(R.id.textView29);
        square30 = findViewById(R.id.textView30);
        square31 = findViewById(R.id.textView31);
        square32 = findViewById(R.id.textView32);
        square33 = findViewById(R.id.textView33);
        square34 = findViewById(R.id.textView34);
        square35 = findViewById(R.id.textView35);
        square36 = findViewById(R.id.textView36);
        square37 = findViewById(R.id.textView37);
        square38 = findViewById(R.id.textView38);
        square39 = findViewById(R.id.textView39);
        square40 = findViewById(R.id.textView40);
        square41 = findViewById(R.id.textView41);
        square42 = findViewById(R.id.textView42);
        square43 = findViewById(R.id.textView43);
        square44 = findViewById(R.id.textView44);
        square45 = findViewById(R.id.textView45);
        square46 = findViewById(R.id.textView46);
        square47 = findViewById(R.id.textView47);
        square48 = findViewById(R.id.textView48);
        square49 = findViewById(R.id.textView49);
        square50 = findViewById(R.id.textView50);
        square51 = findViewById(R.id.textView51);
        square52 = findViewById(R.id.textView52);
        square53 = findViewById(R.id.textView53);
        square54 = findViewById(R.id.textView54);
        square55 = findViewById(R.id.textView55);
        square56 = findViewById(R.id.textView56);
        square57 = findViewById(R.id.textView57);
        square58 = findViewById(R.id.textView58);
        square59 = findViewById(R.id.textView59);
        square60 = findViewById(R.id.textView60);
        square61 = findViewById(R.id.textView61);
        square62 = findViewById(R.id.textView62);
        square63 = findViewById(R.id.textView63);
        square64 = findViewById(R.id.textView64);

        TextView[] squares  = {square64, square63, square62, square61, square60, square59, square58,
                square57, square56, square55, square54, square53, square52, square51, square50, square49,
                square48, square47, square46, square45, square44, square43, square42, square41, square40,
                square39, square38, square37, square36, square35, square34, square33, square32, square31,
                square30, square29, square28, square27, square26, square25, square24, square23, square22,
                square21, square20, square19, square18, square17, square16, square15, square14, square13,
                square12, square11, square10, square9, square8, square7, square6, square5, square4, square3,
                square2, square1};

        board = findViewById(R.id.board);

        scoreWhite = findViewById(R.id.whiteScore);
        scoreBlack = findViewById(R.id.blackScore);

        for (TextView square : squares) {
            square.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (fromSquare == null) {
                        fromSquare = square;
                    } else {
                        toSquare = square;
                        getCoords();

                        if(whiteTurn) {
                            if (fromSquare.getText().equals("♔")) {
                                kingMoveWhite();
                            }
                            if (fromSquare.getText().equals("♕")) {
                                queenMoveWhite();
                            }
                            if (fromSquare.getText().equals("♖")) {
                                rookMoveWhite();
                            }
                            if (fromSquare.getText().equals("♗")) {
                                bishopMoveWhite();
                            }
                            if (fromSquare.getText().equals("♘")) {
                                knightMoveWhite();
                            }
                            if (fromSquare.getText().equals("♙")) {
                                pawnMoveWhite();
                            }
                        }

                        if(!whiteTurn) {
                            if (fromSquare.getText().equals("♚")) {
                                kingMoveBlack();
                            }
                            if (fromSquare.getText().equals("♛")) {
                                queenMoveBlack();
                            }
                            if (fromSquare.getText().equals("♜")) {
                                rookMoveBlack();
                            }
                            if (fromSquare.getText().equals("♝")) {
                                bishopMoveBlack();
                            }
                            if (fromSquare.getText().equals("♞")) {
                                knightMoveBlack();
                            }
                            if (fromSquare.getText().equals("♟")) {
                                pawnMoveBlack();
                            }
                        }
                        fromSquare = null;
                        toSquare = null;
                    }
                    
                }
            });
        }
    }

    private void updateScore() {
        if(whiteTurn && toSquare.getText().equals("♟")) {
            whiteScore += 1;
        }
        if(whiteTurn && toSquare.getText().equals("♞")) {
            whiteScore += 3;
        }
        if(whiteTurn && toSquare.getText().equals("♝")) {
            whiteScore += 3;
        }
        if(whiteTurn && toSquare.getText().equals("♜")) {
            whiteScore += 5;
        }
        if(whiteTurn && toSquare.getText().equals("♛")) {
            whiteScore += 9;
        }
        if(whiteTurn && toSquare.getText().equals("♚")) {
            Intent intent = new Intent(MainActivity.this, WhiteWin.class);
            startActivity(intent);
            finish();
        }

        if(!whiteTurn && toSquare.getText().equals("♙")) {
            blackScore += 1;
        }
        if(!whiteTurn && toSquare.getText().equals("♘")) {
            blackScore += 3;
        }
        if(!whiteTurn && toSquare.getText().equals("♗")) {
            blackScore += 3;
        }
        if(!whiteTurn && toSquare.getText().equals("♖")) {
            blackScore += 5;
        }
        if(!whiteTurn && toSquare.getText().equals("♕")) {
            blackScore += 9;
        }
        if(!whiteTurn && toSquare.getText().equals("♔")) {
            Intent intent = new Intent(MainActivity.this, BlackWin.class);
            startActivity(intent);
            finish();
        }
        scoreWhite.setText("" + whiteScore);
        scoreBlack.setText("" + blackScore);

    }

    private void pawnMoveWhite() {
        Pawn pawn = new Pawn(true);
        if(pawn.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            if(desRow == 8) {
                toSquare.setText("♕");
            } else {
                toSquare.setText("♙");
            }
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void knightMoveWhite() {
        Knight knight = new Knight(true);
        if(knight.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♘");
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void bishopMoveWhite() {
        Bishop bishop = new Bishop(true);
        if(bishop.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♗");
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void rookMoveWhite() {
        Rook rook = new Rook(true);
        if(rook.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♖");
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void queenMoveWhite() {
        Queen queen = new Queen(true);
        if(queen.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♕");
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void kingMoveWhite() {
        King king = new King(true);
        if(king.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♔");
            if(king.castle(srcRow, srcCol, desRow, desCol)) {
                if(toSquare == square63) {
                    square64.setText("");
                    square62.setText("♖");
                } else if(toSquare == square59) {
                    square57.setText("");
                    square60.setText("♖");
                }
            }
            whiteKingMoved = true;
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void pawnMoveBlack() {
        Pawn pawn = new Pawn(false);
        if(pawn.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            if(desRow == 1) {
                toSquare.setText("♛");
            } else {
                toSquare.setText("♟");
            }
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void knightMoveBlack() {
        Knight knight = new Knight(false);
        if(knight.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♞");
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void bishopMoveBlack() {
        Bishop bishop = new Bishop(false);
        if(bishop.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♝");
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void rookMoveBlack() {
        Rook rook = new Rook(false);
        if(rook.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♜");
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void queenMoveBlack() {
        Queen queen = new Queen(false);
        if(queen.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♛");
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void kingMoveBlack() {
        King king = new King(false);
        if(king.isMoveValid(srcRow, srcCol, desRow, desCol, toSquare)) {
            updateScore();
            fromSquare.setText("");
            toSquare.setText("♚");
            if(king.castle(srcRow, srcCol, desRow, desCol)) {
                if(toSquare == square7) {
                    square8.setText("");
                    square6.setText("♜");
                } else if(toSquare == square3) {
                    square1.setText("");
                    square4.setText("♜");
                }
            }
            blackKingMoved = true;
            nextTurn();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Move, please try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void nextTurn() {
        if(whiteTurn) {
            whiteTurn = false;
            Toast.makeText(getApplicationContext(), "Black to Move", Toast.LENGTH_SHORT).show();
        } else {
            whiteTurn = true;
            Toast.makeText(getApplicationContext(), "White to Move", Toast.LENGTH_SHORT).show();
        }
    }

    private void getCoords() {
        if(fromSquare == square1) {
            srcRow = 8;
        }
        if(fromSquare == square2) {
            srcRow = 8;
        }
        if(fromSquare == square3) {
            srcRow = 8;
        }
        if(fromSquare == square4) {
            srcRow = 8;
        }
        if(fromSquare == square5) {
            srcRow = 8;
        }
        if(fromSquare == square6) {
            srcRow = 8;
        }
        if(fromSquare == square7) {
            srcRow = 8;
        }
        if(fromSquare == square8) {
            srcRow = 8;
        }
        if(fromSquare == square9) {
            srcRow = 7;
        }
        if(fromSquare == square10) {
            srcRow = 7;
        }
        if(fromSquare == square11) {
            srcRow = 7;
        }
        if(fromSquare == square12) {
            srcRow = 7;
        }
        if(fromSquare == square13) {
            srcRow = 7;
        }
        if(fromSquare == square14) {
            srcRow = 7;
        }
        if(fromSquare == square15) {
            srcRow = 7;
        }
        if(fromSquare == square16) {
            srcRow = 7;
        }
        if(fromSquare == square17) {
            srcRow = 6;
        }
        if(fromSquare == square18) {
            srcRow = 6;
        }
        if(fromSquare == square19) {
            srcRow = 6;
        }
        if(fromSquare == square20) {
            srcRow = 6;
        }
        if(fromSquare == square21) {
            srcRow = 6;
        }
        if(fromSquare == square22) {
            srcRow = 6;
        }
        if(fromSquare == square23) {
            srcRow = 6;
        }
        if(fromSquare == square24) {
            srcRow = 6;
        }
        if(fromSquare == square25) {
            srcRow = 5;
        }
        if(fromSquare == square26) {
            srcRow = 5;
        }
        if(fromSquare == square27) {
            srcRow = 5;
        }
        if(fromSquare == square28) {
            srcRow = 5;
        }
        if(fromSquare == square29) {
            srcRow = 5;
        }
        if(fromSquare == square30) {
            srcRow = 5;
        }
        if(fromSquare == square31) {
            srcRow = 5;
        }
        if(fromSquare == square32) {
            srcRow = 5;
        }
        if(fromSquare == square33) {
            srcRow = 4;
        }
        if(fromSquare == square34) {
            srcRow = 4;
        }
        if(fromSquare == square35) {
            srcRow = 4;
        }
        if(fromSquare == square36) {
            srcRow = 4;
        }
        if(fromSquare == square37) {
            srcRow = 4;
        }
        if(fromSquare == square38) {
            srcRow = 4;
        }
        if(fromSquare == square39) {
            srcRow = 4;
        }
        if(fromSquare == square40) {
            srcRow = 4;
        }
        if(fromSquare == square41) {
            srcRow = 3;
        }
        if(fromSquare == square42) {
            srcRow = 3;
        }
        if(fromSquare == square43) {
            srcRow = 3;
        }
        if(fromSquare == square44) {
            srcRow = 3;
        }
        if(fromSquare == square45) {
            srcRow = 3;
        }
        if(fromSquare == square46) {
            srcRow = 3;
        }
        if(fromSquare == square47) {
            srcRow = 3;
        }
        if(fromSquare == square48) {
            srcRow = 3;
        }
        if(fromSquare == square49) {
            srcRow = 2;
        }
        if(fromSquare == square50) {
            srcRow = 2;
        }
        if(fromSquare == square51) {
            srcRow = 2;
        }
        if(fromSquare == square52) {
            srcRow = 2;
        }
        if(fromSquare == square53) {
            srcRow = 2;
        }
        if(fromSquare == square54) {
            srcRow = 2;
        }
        if(fromSquare == square55) {
            srcRow = 2;
        }
        if(fromSquare == square56) {
            srcRow = 2;
        }
        if(fromSquare == square57) {
            srcRow = 1;
        }
        if(fromSquare == square58) {
            srcRow = 1;
        }
        if(fromSquare == square59) {
            srcRow = 1;
        }
        if(fromSquare == square60) {
            srcRow = 1;
        }
        if(fromSquare == square61) {
            srcRow = 1;
        }
        if(fromSquare == square62) {
            srcRow = 1;
        }
        if(fromSquare == square63) {
            srcRow = 1;
        }
        if(fromSquare == square64) {
            srcRow = 1;
        }

        if(toSquare == square1) {
            desRow = 8;
        }
        if(toSquare == square2) {
            desRow = 8;
        }
        if(toSquare == square3) {
            desRow = 8;
        }
        if(toSquare == square4) {
            desRow = 8;
        }
        if(toSquare == square5) {
            desRow = 8;
        }
        if(toSquare == square6) {
            desRow = 8;
        }
        if(toSquare == square7) {
            desRow = 8;
        }
        if(toSquare == square8) {
            desRow = 8;
        }
        if(toSquare == square9) {
            desRow = 7;
        }
        if(toSquare == square10) {
            desRow = 7;
        }
        if(toSquare == square11) {
            desRow = 7;
        }
        if(toSquare == square12) {
            desRow = 7;
        }
        if(toSquare == square13) {
            desRow = 7;
        }
        if(toSquare == square14) {
            desRow = 7;
        }
        if(toSquare == square15) {
            desRow = 7;
        }
        if(toSquare == square16) {
            desRow = 7;
        }
        if(toSquare == square17) {
            desRow = 6;
        }
        if(toSquare == square18) {
            desRow = 6;
        }
        if(toSquare == square19) {
            desRow = 6;
        }
        if(toSquare == square20) {
            desRow = 6;
        }
        if(toSquare == square21) {
            desRow = 6;
        }
        if(toSquare == square22) {
            desRow = 6;
        }
        if(toSquare == square23) {
            desRow = 6;
        }
        if(toSquare == square24) {
            desRow = 6;
        }
        if(toSquare == square25) {
            desRow = 5;
        }
        if(toSquare == square26) {
            desRow = 5;
        }
        if(toSquare == square27) {
            desRow = 5;
        }
        if(toSquare == square28) {
            desRow = 5;
        }
        if(toSquare == square29) {
            desRow = 5;
        }
        if(toSquare == square30) {
            desRow = 5;
        }
        if(toSquare == square31) {
            desRow = 5;
        }
        if(toSquare == square32) {
            desRow = 5;
        }
        if(toSquare == square33) {
            desRow = 4;
        }
        if(toSquare == square34) {
            desRow = 4;
        }
        if(toSquare == square35) {
            desRow = 4;
        }
        if(toSquare == square36) {
            desRow = 4;
        }
        if(toSquare == square37) {
            desRow = 4;
        }
        if(toSquare == square38) {
            desRow = 4;
        }
        if(toSquare == square39) {
            desRow = 4;
        }
        if(toSquare == square40) {
            desRow = 4;
        }
        if(toSquare == square41) {
            desRow = 3;
        }
        if(toSquare == square42) {
            desRow = 3;
        }
        if(toSquare == square43) {
            desRow = 3;
        }
        if(toSquare == square44) {
            desRow = 3;
        }
        if(toSquare == square45) {
            desRow = 3;
        }
        if(toSquare == square46) {
            desRow = 3;
        }
        if(toSquare == square47) {
            desRow = 3;
        }
        if(toSquare == square48) {
            desRow = 3;
        }
        if(toSquare == square49) {
            desRow = 2;
        }
        if(toSquare == square50) {
            desRow = 2;
        }
        if(toSquare == square51) {
            desRow = 2;
        }
        if(toSquare == square52) {
            desRow = 2;
        }
        if(toSquare == square53) {
            desRow = 2;
        }
        if(toSquare == square54) {
            desRow = 2;
        }
        if(toSquare == square55) {
            desRow = 2;
        }
        if(toSquare == square56) {
            desRow = 2;
        }
        if(toSquare == square57) {
            desRow = 1;
        }
        if(toSquare == square58) {
            desRow = 1;
        }
        if(toSquare == square59) {
            desRow = 1;
        }
        if(toSquare == square60) {
            desRow = 1;
        }
        if(toSquare == square61) {
            desRow = 1;
        }
        if(toSquare == square62) {
            desRow = 1;
        }
        if(toSquare == square63) {
            desRow = 1;
        }
        if(toSquare == square64) {
            desRow = 1;
        }

        if(fromSquare == square1) {
            srcCol = 1;
        }
        if(fromSquare == square2) {
            srcCol = 2;
        }
        if(fromSquare == square3) {
            srcCol = 3;
        }
        if(fromSquare == square4) {
            srcCol = 4;
        }
        if(fromSquare == square5) {
            srcCol = 5;
        }
        if(fromSquare == square6) {
            srcCol = 6;
        }
        if(fromSquare == square7) {
            srcCol = 7;
        }
        if(fromSquare == square8) {
            srcCol = 8;
        }
        if(fromSquare == square9) {
            srcCol = 1;
        }
        if(fromSquare == square10) {
            srcCol = 2;
        }
        if(fromSquare == square11) {
            srcCol = 3;
        }
        if(fromSquare == square12) {
            srcCol = 4;
        }
        if(fromSquare == square13) {
            srcCol = 5;
        }
        if(fromSquare == square14) {
            srcCol = 6;
        }
        if(fromSquare == square15) {
            srcCol = 7;
        }
        if(fromSquare == square16) {
            srcCol = 8;
        }
        if(fromSquare == square17) {
            srcCol = 1;
        }
        if(fromSquare == square18) {
            srcCol = 2;
        }
        if(fromSquare == square19) {
            srcCol = 3;
        }
        if(fromSquare == square20) {
            srcCol = 4;
        }
        if(fromSquare == square21) {
            srcCol = 5;
        }
        if(fromSquare == square22) {
            srcCol = 6;
        }
        if(fromSquare == square23) {
            srcCol = 7;
        }
        if(fromSquare == square24) {
            srcCol = 8;
        }
        if(fromSquare == square25) {
            srcCol = 1;
        }
        if(fromSquare == square26) {
            srcCol = 2;
        }
        if(fromSquare == square27) {
            srcCol = 3;
        }
        if(fromSquare == square28) {
            srcCol = 4;
        }
        if(fromSquare == square29) {
            srcCol = 5;
        }
        if(fromSquare == square30) {
            srcCol = 6;
        }
        if(fromSquare == square31) {
            srcCol = 7;
        }
        if(fromSquare == square32) {
            srcCol = 8;
        }
        if(fromSquare == square33) {
            srcCol = 1;
        }
        if(fromSquare == square34) {
            srcCol = 2;
        }
        if(fromSquare == square35) {
            srcCol = 3;
        }
        if(fromSquare == square36) {
            srcCol = 4;
        }
        if(fromSquare == square37) {
            srcCol = 5;
        }
        if(fromSquare == square38) {
            srcCol = 6;
        }
        if(fromSquare == square39) {
            srcCol = 7;
        }
        if(fromSquare == square40) {
            srcCol = 8;
        }
        if(fromSquare == square41) {
            srcCol = 1;
        }
        if(fromSquare == square42) {
            srcCol = 2;
        }
        if(fromSquare == square43) {
            srcCol = 3;
        }
        if(fromSquare == square44) {
            srcCol = 4;
        }
        if(fromSquare == square45) {
            srcCol = 5;
        }
        if(fromSquare == square46) {
            srcCol = 6;
        }
        if(fromSquare == square47) {
            srcCol = 7;
        }
        if(fromSquare == square48) {
            srcCol = 8;
        }
        if(fromSquare == square49) {
            srcCol = 1;
        }
        if(fromSquare == square50) {
            srcCol = 2;
        }
        if(fromSquare == square51) {
            srcCol = 3;
        }
        if(fromSquare == square52) {
            srcCol = 4;
        }
        if(fromSquare == square53) {
            srcCol = 5;
        }
        if(fromSquare == square54) {
            srcCol = 6;
        }
        if(fromSquare == square55) {
            srcCol = 7;
        }
        if(fromSquare == square56) {
            srcCol = 8;
        }
        if(fromSquare == square57) {
            srcCol = 1;
        }
        if(fromSquare == square58) {
            srcCol = 2;
        }
        if(fromSquare == square59) {
            srcCol = 3;
        }
        if(fromSquare == square60) {
            srcCol = 4;
        }
        if(fromSquare == square61) {
            srcCol = 5;
        }
        if(fromSquare == square62) {
            srcCol = 6;
        }
        if(fromSquare == square63) {
            srcCol = 7;
        }
        if(fromSquare == square64) {
            srcCol = 8;
        }

        if(toSquare == square1) {
            desCol = 1;
        }
        if(toSquare == square2) {
            desCol = 2;
        }
        if(toSquare == square3) {
            desCol = 3;
        }
        if(toSquare == square4) {
            desCol = 4;
        }
        if(toSquare == square5) {
            desCol = 5;
        }
        if(toSquare == square6) {
            desCol = 6;
        }
        if(toSquare == square7) {
            desCol = 7;
        }
        if(toSquare == square8) {
            desCol = 8;
        }
        if(toSquare == square9) {
            desCol = 1;
        }
        if(toSquare == square10) {
            desCol = 2;
        }
        if(toSquare == square11) {
            desCol = 3;
        }
        if(toSquare == square12) {
            desCol = 4;
        }
        if(toSquare == square13) {
            desCol = 5;
        }
        if(toSquare == square14) {
            desCol = 6;
        }
        if(toSquare == square15) {
            desCol = 7;
        }
        if(toSquare == square16) {
            desCol = 8;
        }
        if(toSquare == square17) {
            desCol = 1;
        }
        if(toSquare == square18) {
            desCol = 2;
        }
        if(toSquare == square19) {
            desCol = 3;
        }
        if(toSquare == square20) {
            desCol = 4;
        }
        if(toSquare == square21) {
            desCol = 5;
        }
        if(toSquare == square22) {
            desCol = 6;
        }
        if(toSquare == square23) {
            desCol = 7;
        }
        if(toSquare == square24) {
            desCol = 8;
        }
        if(toSquare == square25) {
            desCol = 1;
        }
        if(toSquare == square26) {
            desCol = 2;
        }
        if(toSquare == square27) {
            desCol = 3;
        }
        if(toSquare == square28) {
            desCol = 4;
        }
        if(toSquare == square29) {
            desCol = 5;
        }
        if(toSquare == square30) {
            desCol = 6;
        }
        if(toSquare == square31) {
            desCol = 7;
        }
        if(toSquare == square32) {
            desCol = 8;
        }
        if(toSquare == square33) {
            desCol = 1;
        }
        if(toSquare == square34) {
            desCol = 2;
        }
        if(toSquare == square35) {
            desCol = 3;
        }
        if(toSquare == square36) {
            desCol = 4;
        }
        if(toSquare == square37) {
            desCol = 5;
        }
        if(toSquare == square38) {
            desCol = 6;
        }
        if(toSquare == square39) {
            desCol = 7;
        }
        if(toSquare == square40) {
            desCol = 8;
        }
        if(toSquare == square41) {
            desCol = 1;
        }
        if(toSquare == square42) {
            desCol = 2;
        }
        if(toSquare == square43) {
            desCol = 3;
        }
        if(toSquare == square44) {
            desCol = 4;
        }
        if(toSquare == square45) {
            desCol = 5;
        }
        if(toSquare == square46) {
            desCol = 6;
        }
        if(toSquare == square47) {
            desCol = 7;
        }
        if(toSquare == square48) {
            desCol = 8;
        }
        if(toSquare == square49) {
            desCol = 1;
        }
        if(toSquare == square50) {
            desCol = 2;
        }
        if(toSquare == square51) {
            desCol = 3;
        }
        if(toSquare == square52) {
            desCol = 4;
        }
        if(toSquare == square53) {
            desCol = 5;
        }
        if(toSquare == square54) {
            desCol = 6;
        }
        if(toSquare == square55) {
            desCol = 7;
        }
        if(toSquare == square56) {
            desCol = 8;
        }
        if(toSquare == square57) {
            desCol = 1;
        }
        if(toSquare == square58) {
            desCol = 2;
        }
        if(toSquare == square59) {
            desCol = 3;
        }
        if(toSquare == square60) {
            desCol = 4;
        }
        if(toSquare == square61) {
            desCol = 5;
        }
        if(toSquare == square62) {
            desCol = 6;
        }
        if(toSquare == square63) {
            desCol = 7;
        }
        if(toSquare == square64) {
            desCol = 8;
        }

    }
}