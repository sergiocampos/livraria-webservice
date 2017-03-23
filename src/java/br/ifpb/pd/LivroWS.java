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
import javax.xml.ws.Endpoint;

/**
 *
 * @author sergio
 */
@WebService(serviceName = "LivroWS")
public class LivroWS {
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    

    
    
    @WebMethod(operationName = "cadastrar")
    public String cadastrar(@WebParam(name="titulo") String titulo,
            @WebParam(name="editora") String editora, @WebParam(name="ISBN") String isbn, @WebParam(name="edicao")
            String edicao, @WebParam(name="autor") String autor) {
            
            Livro l = new Livro();
            
            //l.setCodigo(codigo);
            l.setTitulo(titulo);
            l.setEditora(editora);
            l.setIsbn(isbn);
            l.setEdicao(edicao);
            l.setAutor(autor);
            
            livros.add(l);
            return "Livro " + titulo + "cadastrado";
    }
    
    @WebMethod(operationName = "alterar")
    public void alterar(@WebParam(name = "titulo") String titulo, @WebParam(name="editora") String editora, @WebParam(name="ISBN") String isbn, @WebParam(name="edicao")
            String edicao, @WebParam(name="autor") String autor){
        for(Livro l: livros){
            if(l.getIsbn().equals(isbn)){
                l.setTitulo(titulo);
                l.setAutor(autor);
                l.setEdicao(edicao);
                l.setEditora(editora);
            }
        }
    }
    
    @WebMethod(operationName = "buscar")
    public ArrayList<Livro> buscar(@WebParam(name = "ISBN") String isbn){
       // Livro l = new Livro();
       // l.setAutor("joao");
        //l.setCodigo("098");
        //livros.add(l);
        return livros;
    }
    
    @WebMethod(operationName = "excluir")
        public void excluir(@WebParam(name = "") Livro l){
        
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "titulo") String titulo) {
        //TODO write your implementation code here:
        return titulo;
    }
}
