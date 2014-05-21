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
public class Cardapio {
    
    private int indice;
    private int codigo;
    private Date dataCriacao;
    private Date dataFim;
    private String nomeCardapio;

    public Cardapio() {
        this(0, 0, null, null,null);
    }
    
    public Cardapio(int codigo,int indice, Date dataCriacao, Date dataFim, String nomeCardapio) {
        this.indice = indice;
        this.codigo = codigo;
        this.dataCriacao = dataCriacao;
        this.dataFim = dataFim;
        this.nomeCardapio = nomeCardapio;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getNomeCardapio() {
        return nomeCardapio;
    }

    public void setNomeCardapio(String nomeCardapio) {
        this.nomeCardapio = nomeCardapio;
    }
    
}
