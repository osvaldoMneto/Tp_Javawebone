package br.edu.infnet.model.domain;

public  class Aluno {
	
	String nome;
	String email;
	String curso;
	String regiao;
	String [] disciplina;
	

	
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}


	@Override
	public String toString() {
		
		 return String.format("[%S] O aluno %s (%s) da região % esta escrito em %d disciplinas!\n",
				curso, nome, email, regiao, disciplina.length);

		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	}
}
