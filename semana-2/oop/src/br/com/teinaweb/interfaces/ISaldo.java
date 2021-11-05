package br.com.teinaweb.interfaces;

public interface ISaldo {
    
    // métodos -> dentro de interfaces, por padrão, são públicos
    void sacar(double valor);

    void depositar(double valor);
    
}
