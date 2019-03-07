package wyjatkiTryCatch;

import java.util.Scanner;

public class calculate {
static int add(int x,int y )throws IllegalArgumentException{
    if (x < 1 || y <0) {
        throw new IllegalArgumentException("nie moze byc ujemna");
    }
    return x + y;

        }
    }
