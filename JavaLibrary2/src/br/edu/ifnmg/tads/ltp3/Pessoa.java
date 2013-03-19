/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id, int value) {
        if (value>1) {
            id = value;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String pnome) throws Exception {
        if (pnome.length()>3 && pnome.length()<250){
            nome = pnome;
        }
        throw new Exception ("Nao podem haver nomes com menos de 3 letras e mais do que 250 letras");
    }
    
}
