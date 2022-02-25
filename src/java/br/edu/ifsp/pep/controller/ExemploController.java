/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.model.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author aluno
 */
@Named
@ViewScoped
public class ExemploController implements Serializable {

    private Pessoa pessoa;
    private final List<Pessoa> pessoas = new ArrayList<>();

    public ExemploController() {
        this.pessoa = new Pessoa();
    }

    public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }

    public void adicionar() {
        this.pessoas.add(pessoa);
        this.pessoa = new Pessoa();
        addMessage(FacesMessage.SEVERITY_INFO, "Informação", "Intankavel o Bostil");
    }

    public void exibir() {
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
