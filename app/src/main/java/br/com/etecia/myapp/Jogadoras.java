package br.com.etecia.myapp;

public class Jogadoras {

        private String Nome;
        private String Times;
        private String Posição;
        private int Titulos;
        private int imagem;


        public Jogadoras(String nome, String times, String posição, int titulos, int imagem){
            Nome = nome;
            Times = times;
            Posição = posição;
            Titulos = titulos;
            this.imagem = imagem;
        }

    public String getPosição() {
        return Posição;
    }

    public void setPosição(String posição) {
        Posição = posição;
    }

    public String getTimes() {
        return Times;
    }

    public void setTimes(String times) {
        Times = times;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getTitulos() {
        return Titulos;
    }

    public void setTitulos(int titulos) {
        Titulos = titulos;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
