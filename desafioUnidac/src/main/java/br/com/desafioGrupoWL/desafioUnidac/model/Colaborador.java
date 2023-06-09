package br.com.desafioGrupoWL.desafioUnidac.model;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
public class Colaborador {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Length(min = 3, message = "mínimo 3 caracteres")
	private String nome;
	
	@CPF(message = "CPF inválido")
	@Length(min = 11, max = 11, message = "deve conter 11 caracteres")
	private String cpf;
	
	@NotBlank(message = "campo não informado")
	private String cafe;
	
	@NotNull
	@FutureOrPresent
	private LocalDate data;
	
	public Colaborador() {	
	}
	
	public Colaborador(long id, String nome, String cpf, String cafe, LocalDate data) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.cafe = cafe;
		this.data = data;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getcafe() {
		return cafe;
	}
	public void setcafe(String cafe) {
		this.cafe = cafe;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
}
