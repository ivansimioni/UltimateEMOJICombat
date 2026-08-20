package UltraEmojiCombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;


    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome (){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }

    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float p){
        this.peso = p;
        this.setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
    private void setCategoria(){
        if (this.peso < 52.2){
            this.categoria = "INVÁLIDO";
        } else if (this.peso <= 70.3){
            this.categoria = "LEVE";
        } else if (this.peso < 83.9){
            this.categoria = "MÉDIO";
        } else if (this.peso <= 120.2){
            this.categoria = "PESADO";
        } else {
            this.categoria = "INVÁLIDO";
        }
    }
    public int getVitoria(){
        return this.vitorias;
    }
    private void setVitoria(int v){
        this.vitorias = v;
    }
    public int getDerrota(){
        return this.derrotas;
    }
    private void setDerrota(int d){
        this.derrotas = d;
    }
    public int getEmpate(){
        return this.empates;
    }
    private void setEmpate(int e){
        this.empates = e;
    }

    public void apresentar(){
        System.out.println("----------------------------------------");
        System.out.println("Com vocêsss, o lutador " + this.nome + "!!");
        System.out.println("Diretamente de " + this.getNacionalidade() + "!!");
        System.out.println("Com " + this.getIdade() + " anos.");
        System.out.println("Medindo " + this.getAltura() + "m de altura.");
        System.out.println("Pesando " + this.getPeso() + "kg.");
        System.out.println("Ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrota());
        System.out.println("Empatou: " + this.getEmpate());
        System.out.println();
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());;
        System.out.println(this.getVitoria() + " vitórias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpate() + " empates");
        System.out.println();
    }

    public void ganharLuta() {
        setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta() {
        setDerrota(this.getDerrota() + 1);
    }

    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }
}
