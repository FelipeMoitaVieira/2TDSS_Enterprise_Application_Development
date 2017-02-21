package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_LIVRO")
@SequenceGenerator(name="seqLivro",sequenceName="SQ_TB_LIVRO",allocationSize=1)
public class Livro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqLivro")
	@Column(name="NR_ISBN")
	private long isbn;
	
	@Column(name="DS_TITULO",nullable=false,length=200)
	private String titulo;
	
	@Column(name="VL_PRECO")
	private float preco;
	
	@Column(name="DT_LANCAMENTO")
	@Temporal(value=TemporalType.DATE)
	private Calendar dataLancamento;
	
	@Lob
	@Column(name="FL_CAPA")
	private byte[] capa;

	public Livro(long isbn, String titulo, float preco, Calendar dataLancamento, byte[] capa) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
		this.dataLancamento = dataLancamento;
		this.capa = capa;
	}
	
	public Livro(){}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}
	
	
	
	

}
