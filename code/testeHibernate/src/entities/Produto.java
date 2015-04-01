/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author neves
 */
//Produto.java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
@Id
@GeneratedValue
int id;
String nome;
double preco;

public int getId() {
return id;
}
private void setId(int id) {
this.id = id;
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public double getPreco() {
return preco;
}
public void setPreco(double preco) {
this.preco = preco;
}
}