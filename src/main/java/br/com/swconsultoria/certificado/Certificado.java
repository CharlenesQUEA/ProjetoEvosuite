package br.com.swconsultoria.certificado;

import lombok.Getter;
import lombok.*;

import java.math.BigInteger;
import java.security.Provider;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.swconsultoria.com.br
 */

@Getter
@Setter
@SuppressWarnings("WeakerAccess")
public class Certificado {

	private static final String TLSV_1_2 = "TLSv1.2";

    private String nome;
    private LocalDate vencimento;
    private LocalDateTime dataHoraVencimento;
    private Long diasRestantes;
    private String arquivo;
    private byte[] arquivoBytes;
    private String senha;
    private String cnpjCpf;
    private TipoCertificadoEnum tipoCertificado;
    private boolean valido;
    private String sslProtocol;
    private BigInteger numeroSerie;
    private Provider provider;

    public Certificado() {
        this.setSslProtocol(TLSV_1_2);
    }

    private void setSslProtocol(String tlsv12) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public String toString() {
        return "Certificado{" +
                "nome='" + nome + '\'' +
                ", dataHoraVencimento=" + dataHoraVencimento +
                ", cnpjCpf='" + cnpjCpf + '\'' +
                ", tipoCertificado=" + tipoCertificado +
                '}';
    }
	
	//acrescentado

	public boolean isValido() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getSenha() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public LocalDateTime getDataHoraVencimento() {
		return dataHoraVencimento;
	}

	public void setDataHoraVencimento(LocalDateTime dataHoraVencimento) {
		this.dataHoraVencimento = dataHoraVencimento;
	}

	public Long getDiasRestantes() {
		return diasRestantes;
	}

	public void setDiasRestantes(Long diasRestantes) {
		this.diasRestantes = diasRestantes;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public byte[] getArquivoBytes() {
		return arquivoBytes;
	}

	public void setArquivoBytes(byte[] arquivoBytes) {
		this.arquivoBytes = arquivoBytes;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public TipoCertificadoEnum getTipoCertificado() {
		return tipoCertificado;
	}

	public void setTipoCertificado(TipoCertificadoEnum tipoCertificado) {
		this.tipoCertificado = tipoCertificado;
	}

	public BigInteger getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(BigInteger numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getSslProtocol() {
		return sslProtocol;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}	
}
