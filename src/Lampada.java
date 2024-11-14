import java.util.Scanner;

public class Lampada {
    private String marca;
    private String voltagem;
    private String tipo;
    private String modelo;
    private String cor;
    private double preco;
    private String garantia;
    private boolean ligada;

    
    public Lampada(String marca, String voltagem, String tipo, String modelo, String cor, double preco, String garantia) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.garantia = garantia;
        this.ligada = false;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getStatus() {
        return ligada ? "Ligada" : "Desligada";
    }

    
    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void mostrarStatus() {
        System.out.println("# Lâmpada " + getStatus() + " #");
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println(">>> CONFIGURAÇÃO DA LÂMPADA <<<");

        System.out.print("Informe a cor: ");
        String cor = scanner.nextLine();

        System.out.print("Informe a marca: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe a voltagem (exemplo: 100V): ");
        String voltagem = scanner.nextLine();

        System.out.print("Informe a garantia: ");
        String garantia = scanner.nextLine();

        System.out.print("Informe o preço (exemplo: 25.00): ");
        double preco = scanner.nextDouble();

        
        Lampada lampada = new Lampada(marca, voltagem, "LED", modelo, cor, preco, garantia);

        System.out.println("\n>>> INÍCIO DO SOFTWARE DA LÂMPADA <<<\n");
        System.out.println("COR: " + lampada.getCor());
        System.out.println("MARCA: " + lampada.getMarca());
        System.out.println("MODELO: " + lampada.getModelo());
        System.out.println("WATTS: " + lampada.getVoltagem());
        System.out.println("TIPO: " + lampada.getTipo());
        System.out.println("GARANTIA: " + lampada.getGarantia());
        System.out.printf("PREÇO R$: %.2f%n", lampada.getPreco());
        System.out.println("STATUS: " + lampada.getStatus() + "\n");

        
        while (true) {
            System.out.println("Ligar/Desligar lâmpada? 0 – Sair / 1 – Ligar / 2 – Desligar");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("\n*** Você encerrou o software. ***");
                    scanner.close();
                    return;
                case 1:
                    lampada.ligar();
                    lampada.mostrarStatus();
                    break;
                case 2:
                    lampada.desligar();
                    lampada.mostrarStatus();
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.\n");
            }
        }
    }
}

