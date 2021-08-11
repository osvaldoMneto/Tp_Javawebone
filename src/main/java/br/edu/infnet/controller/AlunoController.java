package br.edu.infnet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;

/**
 * Servlet implementation class AlunoController
 */
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AlunoController() {
        super();
        
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
		aluno.setNome(request.getParameter("nome"));
		aluno.setCurso(request.getParameter("curso"));
		aluno.setRegiao(request.getParameter("regiao"));
		aluno.setDisciplina(request.getParameterValues("disciplina"));
		
		System.out.println(aluno);
		
		System.out.print("disciplina: ");
		for( String disc: aluno.getDisciplina()) {
			System.out.println("--"+ disc);
		}
		
		
		
		
		request.getRequestDispatcher("confirmacao.html").forward(request, response);
	}

}
