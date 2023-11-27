package org.example;



public class Rover {

    private Direction direction;
    private Position position;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;


    }
//je veux que lorsque l'on ecrit f, cela fasse avancer et b recule
    public void avancer() {
        switch (this.direction) {
            case NORTH -> {
                this.position = new Position(this.position.x(), this.position.y() + 1);
            }
            case SOUTH -> {
                this.position = new Position(this.position.x(), this.position.y() - 1);
            }
            case EAST -> {
                this.position = new Position(this.position.x() + 1, this.position.y());
            }
            case WEST -> {
                this.position = new Position(this.position.x() - 1, this.position.y());
            }
        }
    }

    public void tournerAGauche() {
        //je veux que quand j'ecrit l, cela fasse tourner a gauche
        switch (this.direction) {
            case NORTH -> {
                this.direction = Direction.WEST;
            }
            case SOUTH -> {
                this.direction = Direction.EAST;
            }
            case EAST -> {
                this.direction = Direction.NORTH;
            }
            case WEST -> {
                this.direction = Direction.SOUTH;
            }
        }

    }



    public void tournerADroite() {
        switch (this.direction) {
            case NORTH -> {
                this.direction = Direction.EAST;
            }
            case SOUTH -> {
                this.direction = Direction.WEST;
            }
            case EAST -> {
                this.direction = Direction.SOUTH;
            }
            case WEST -> {
                this.direction = Direction.NORTH;
            }
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void afficher() {
        System.out.println("La position de Rover est : " + this.getPosition().x() + ',' + this.getPosition().y());
        System.out.println("La direction de Rover est : " + this.getDirection().toString());
    }

    public void reculer() {
        switch (this.direction) {
            case NORTH -> {
                this.position = new Position(this.position.x(), this.position.y() - 1);
            }
            case SOUTH -> {
                this.position = new Position(this.position.x(), this.position.y() + 1);
            }
            case EAST -> {
                this.position = new Position(this.position.x() - 1, this.position.y());
            }
            case WEST -> {
                this.position = new Position(this.position.x() + 1, this.position.y());
            }
        }
    }
}