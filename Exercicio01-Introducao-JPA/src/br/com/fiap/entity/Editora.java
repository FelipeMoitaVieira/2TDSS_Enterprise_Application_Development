package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_EDITORA")
@SequenceGenerator(name="seqEditora", sequenceName="SQ_TB_EDITORA",allocationSize=1)	
public class Editora {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqEditora")
	@Column(name="CD_EDITORA")
	private int codigo;
	
	@Column(name="NR_CNPJ",nullable=false,length=100)
	private String cnpj;
	
	@Column(name="NM_NOME",nullable=false,length=300)
	private String nome;
	
	@Column(name="DS_ENDERECO",length=400)
	private String endereco;

	public Editora(int codigo, String cnpj, String nome, String endereco) {
		super();
		this.codigo = codigo;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Editora(){}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
}
