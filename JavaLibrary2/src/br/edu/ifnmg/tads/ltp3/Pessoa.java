/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private int id;
    private String nome;
    private List <Email> emails;
    private List <Telefone> telefones;
    private List <Endereco> enderecos;
    
    public Pessoa(){
        id = 0;
        nome = "";
        emails = new LinkedList <Email> ();
        telefones = new LinkedList <Telefone> ();
        enderecos = new LinkedList <Endereco> ();
        
        
    }
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public void setNome(String pnome) throws Exception {
        if (pnome.length()>3 && pnome.length()<250){
            nome = pnome;
        }
        throw new Exception ("Nao podem haver nomes com menos de 3 letras e mais do que 250 letras");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + '}';
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    public void addEmail(Email obj){
        if (!emails.contains(obj)){
            emails.add(obj);
        }
    }
    public void removeEmail(Email obj){
        if (emails.contains(obj)){
            emails.remove(obj);
        }
    }
    public void addTelefone(Telefone obj){
        if (!telefones.contains(obj)){
            telefones.add(obj);
        }
    }
    public void removeTelefone(Telefone obj){
        if (telefones.contains(obj)){
            telefones.remove(obj);
        }
    }
    public void addEndereco(Endereco obj){
        if (!enderecos.contains(obj)){
            enderecos.add(obj);
        }
    }
    public void removeEndereco(Endereco obj){
        if (enderecos.contains(obj)){
            enderecos.remove(obj);
        }
    }
}
