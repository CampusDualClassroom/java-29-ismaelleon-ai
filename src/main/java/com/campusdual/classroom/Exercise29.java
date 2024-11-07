package com.campusdual.classroom;

import java.io.IOException;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            operation();
        } catch (IOException e) {
            System.out.println("Se ha capturado una IOException: ");
            e.printStackTrace();
        }
    }
    public static void operation() throws IOException {

        throw new IOException("Error al realizar la operación.");
    }
}
