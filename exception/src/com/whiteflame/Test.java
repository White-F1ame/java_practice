package com.whiteflame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
    }
/*    public void read(String filename){
        try {
            var in = new FileInputStream(filename);
            int b;
            while ((b = in.read())!= -1){
                // process input
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }*/

    public void read(String filename) throws IOException {
            var in = new FileInputStream(filename);
            int b;
            while ((b = in.read())!= -1){
                // process input
            }
    }
}
