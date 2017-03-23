/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.pd;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "LivroWS")
@Stateless()
public class LivroWS {
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "cadastrar")
    public boolean cadastrar(@WebParam(name = "l") Livro l){
        return livros.add(l);
    }
    
    @WebMethod(operationName = "alterar")
    public void alterar(@WebParam(name = "") Livro l){
        
    }
    
    @WebMethod(operationName = "buscar")
    public void buscar(@WebParam(name = "") Livro l){
        
    }
    
        @WebMethod(operationName = "excluir")
    public void excluir(@WebParam(name = "") Livro l){
        
    }
}
