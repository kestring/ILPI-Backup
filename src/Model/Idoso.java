/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;


/**
 *
 * @author Bruno
 */
public class Idoso implements Comparable<Idoso> {
    
    private int codIdoso;
    private String nomeIdoso;
    private Date dataNascimento; 
    private String localOrigem;
    private boolean acamado;
    private String cpf;
    private int rg;
    private String cuidadosEspeciais;

    // dados do parente responsavel
    private String nomeParenteResponsavel;
    private String endParente;
    private String numTelefoneParente;
    
    private Funcionario cuidador;
    
    public Idoso(){
        
    }
    
    public Idoso(int codIdoso,
                 String nomeIdoso,
                 Date dataNascimento,
                 String localOrigem,
                 String numTelefoneParente,
                 String endParente,
                 String cpf,
                 int rg,
                 String cuidadosEspeciais,
                 boolean acamado,
                 Funcionario cuidador) {
        this.codIdoso = codIdoso;
        this.nomeIdoso = nomeIdoso;
        this.dataNascimento = dataNascimento;
        this.localOrigem = localOrigem;
        this.numTelefoneParente = numTelefoneParente;
        this.cpf = cpf;
        this.rg = rg;
        this.endParente = endParente;
        this.cuidadosEspeciais = cuidadosEspeciais;
        this.acamado = acamado;
        this.cuidador = cuidador;
    }

    @Override
    public int compareTo(Idoso i) {
        return nomeIdoso.compareTo(i.getNomeIdoso());
    }
    
    public int getCodIdoso() {
        return codIdoso;
    }

    public void setCodIdoso(int codIdoso) {
        this.codIdoso = codIdoso;
    }

    public String getNomeIdoso() {
        return nomeIdoso;
    }

    public void setNomeIdoso(String nomeIdoso) {
        this.nomeIdoso = nomeIdoso;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getCuidadosEspeciais() {
        return cuidadosEspeciais;
    }

    public void setCuidadosEspeciais(String cuidadosEspeciais) {
        this.cuidadosEspeciais = cuidadosEspeciais;
    }

    public boolean isAcamado() {
        return acamado;
    }
    
    public boolean getAcamado() {
        return acamado;
    }

    public void setAcamado(boolean acamado) {
        this.acamado = acamado;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNomeParenteResponsavel() {
        return nomeParenteResponsavel;
    }

    public void setNomeParenteResponsavel(String nomeParenteResponsavel) {
        this.nomeParenteResponsavel = nomeParenteResponsavel;
    }

    public String getNumTelefoneParente() {
        return numTelefoneParente;
    }

    public void setNumTelefoneParente(String numTelefoneParente) {
        this.numTelefoneParente = numTelefoneParente;
    }

    
    public String getEndParente() {
        return endParente;
    }

    public void setEndParente(String endParente) {
        this.endParente = endParente;
    }
    
    @Override
    public String toString() {
        return nomeIdoso;
    }

    public Funcionario getCuidador() {
        return cuidador;
    }

    public void setCuidador(Funcionario cuidador) {
        this.cuidador = cuidador;
    }
    
}
