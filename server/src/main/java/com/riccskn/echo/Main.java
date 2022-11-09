package com.riccskn.echo;

public class Main {

    public static void main(String[] args) {
        try {
            new EchoServer(19132).start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
