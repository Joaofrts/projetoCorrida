package carros;
import java.util.Random;

public class Carro {
    private String modelo;
    private int distanciaPercorrida;
    private Random random;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.distanciaPercorrida = 0;
        this.random = new Random();
    }

    public int getDistancia() {
        return this.distanciaPercorrida;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int sortearVelocidade() {
        return random.nextInt(3) + 1; // Sorteia 1, 2 ou 3
    }

    public void mover() {
        this.distanciaPercorrida += sortearVelocidade();
    }

    @Override
    public String toString() {
        return " ".repeat(Math.max(0,distanciaPercorrida-1))+ "#";
        
        /**String.format("%" + distanciaPercorrida + "s", "#");*/
    }
}