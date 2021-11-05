package br.com.teinaweb.classes;

public class Atendimento {
    private int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas < 1 || horas > 12){
            System.out.println("A quantidade de horas de um atendimento não pode se menor do que 1 e maior do que 12");
        } else {
            this.horas = horas;
        }
    }
}
