package UltraEmojiCombat;

import java.util.Random;

//agregação
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0, 1 ou 2
            switch (vencedor) {
                case 0: //Empate
                    System.out.println();
                    System.out.println("A luta empatou!!");
                    System.out.println("--------------------");
                    System.out.println();
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;

                case 1: //desafiado Vence
                    System.out.println();
                    System.out.println("O desafiado " + this.desafiado.getNome() + " venceu!");
                    System.out.println("--------------------");
                    System.out.println();
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: //desafiante Vence
                    System.out.println();
                    System.out.println("O desafiante " + this.desafiante.getNome() + " venceu!");
                    System.out.println("--------------------");
                    System.out.println();
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }
        else{
                System.out.println("A luta NÃO pode acontecer!!");
            }


        }

    }

