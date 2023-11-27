package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Position position = new Position(0,0);
        Rover rover = new Rover(position, Direction.NORTH);
        Grille grille = new Grille();
        System.out.println("f pour avancer, l pour tourner a gauche, r pour tourner a droite, q pour quitter");
        String command = "";
        while (command!="q") {
               System.out.println("x: " + rover.getPosition().x() + " y: " + rover.getPosition().y() + " direction: " + rover.getDirection());

            Scanner scanner = new Scanner(System.in);
            //je veux recuperer chaque lettre de mon scanner
            command = scanner.next();




            switch (command) {
                case "f" -> {
                    //si j'attent la limite x de la grille , cela m'affiche que je ne peux pas avancer
                    if (rover.getPosition().x() == grille.grillex() && rover.getDirection() == Direction.EAST) {
                        System.out.println("Vous ne pouvez pas avancer");
                    } else if (rover.getPosition().x() == 0 && rover.getDirection() == Direction.WEST) {
                        System.out.println("Vous ne pouvez pas avancer");
                    } else if (rover.getPosition().y() == grille.grilley() && rover.getDirection() == Direction.NORTH) {
                        System.out.println("Vous ne pouvez pas avancer");
                    } else if (rover.getPosition().y() == 0 && rover.getDirection() == Direction.SOUTH) {
                        System.out.println("Vous ne pouvez pas avancer");
                    } else


                    rover.avancer();
                }
                case "b" -> {
                    //si j'attent la limite x de la grille , cela m'affiche que je ne peux pas avancer
                    if
                        (rover.getPosition().x() == grille.grillex() && rover.getDirection() == Direction.WEST) {
                        System.out.println("Vous ne pouvez pas reculer");
                    } else if (rover.getPosition().x() == 0 && rover.getDirection() == Direction.EAST) {
                        System.out.println("Vous ne pouvez pas reculer");
                    } else if (rover.getPosition().y() == grille.grilley() && rover.getDirection() == Direction.SOUTH) {
                        System.out.println("Vous ne pouvez pas reculer");
                    } else if (rover.getPosition().y() == 0 && rover.getDirection() == Direction.NORTH) {
                        System.out.println("Vous ne pouvez pas reculer");
                    }else
                    rover.reculer();
                }
                case "l" -> {
                    rover.tournerAGauche();
                }
                case "r" -> {
                    rover.tournerADroite();
                }

            }
        }

    }
}
