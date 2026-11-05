
package practicagit2;


public class Carro {
    String marca;
    String color;

    public Carro(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String verDetalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Color: ").append(color).append("\n");
        return sb.toString();
        
    }
        int velocidad;

    public void acelerar() {
        velocidad += 10;
    }
        public void frenar() {
        velocidad = 0;
    }
    
    }

