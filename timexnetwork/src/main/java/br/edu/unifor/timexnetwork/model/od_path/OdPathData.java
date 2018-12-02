package br.edu.unifor.timexnetwork.model.od_path;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OdPathData {
	private String matricula;
	private Date data_hora_ida;
	private Date data_hora_volta;
	private String num_linha_origem;
	private String direcao_linha_origem;
	private String num_veiculo_origem;
	private String num_parada_origem;
	private Double lat_origem;
	private Double lng_origem;
	private String num_linha_destino;
	private String direcao_linha_destino;
	private String num_veiculo_destino;
	private String num_parada_destino;
	private Double lat_destino;
	private Double lng_destino;
	private String integracoes;
	private String[] linhas_path;
	private String distancia;
	private Integer qtd_baldeacoes;
	private String[] caminho;
	private String cod_acao;

	public OdPathData(String inputLine) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String[] dados = inputLine.split(",");
		this.matricula = dados[0]; // matricula
		this.data_hora_ida = sdf.parse(dados[1]); // data_hora_ida
		this.data_hora_volta = sdf.parse(dados[2]); // data_hora_volta
		this.num_linha_origem = dados[3]; // num_linha_origem
		this.direcao_linha_destino = dados[4]; // direcao_linha_origem
		this.num_veiculo_origem = dados[5]; // num_veiculo_origem
		this.num_parada_origem = dados[6]; // num_parada_origem
		this.lat_origem = Double.valueOf(dados[7]); // lat_origem
		this.lng_origem = Double.valueOf(dados[8]); // lng_origem
		this.num_linha_destino = dados[9]; // num_linha_destino
		this.direcao_linha_destino = dados[10]; // direcao_linha_destino
		this.num_veiculo_destino = dados[11]; // num_veiculo_destino
		this.num_parada_destino = dados[12]; // num_parada_destino
		this.lat_destino = Double.valueOf(dados[13]); // lat_destino
		this.lng_destino = Double.valueOf(dados[14]); // lng_destino
		this.integracoes = dados[15]; // integracoes
		this.linhas_path = (dados[16].trim().isEmpty() || dados[16].trim().equals("null")) ? null : dados[16].split(";"); // linhas_path
		this.distancia = dados[17].trim().equals("null") ? null : dados[17]; // distancia
		this.qtd_baldeacoes = (dados[18].trim().equals("null") ) ? null : Integer.valueOf(dados[18].trim()); // qtd_baldeacoes
		this.caminho = (dados[19].trim().isEmpty() || dados[19].trim().equals("null")) ? null : dados[19].split(";"); // caminho
		this.cod_acao = dados[20]; // cod_acao
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getData_hora_ida() {
		return data_hora_ida;
	}

	public void setData_hora_ida(Date data_hora_ida) {
		this.data_hora_ida = data_hora_ida;
	}

	public Date getData_hora_volta() {
		return data_hora_volta;
	}

	public void setData_hora_volta(Date data_hora_volta) {
		this.data_hora_volta = data_hora_volta;
	}

	public String getNum_linha_origem() {
		return num_linha_origem;
	}

	public void setNum_linha_origem(String num_linha_origem) {
		this.num_linha_origem = num_linha_origem;
	}

	public String getDirecao_linha_origem() {
		return direcao_linha_origem;
	}

	public void setDirecao_linha_origem(String direcao_linha_origem) {
		this.direcao_linha_origem = direcao_linha_origem;
	}

	public String getNum_veiculo_origem() {
		return num_veiculo_origem;
	}

	public void setNum_veiculo_origem(String num_veiculo_origem) {
		this.num_veiculo_origem = num_veiculo_origem;
	}

	public String getNum_parada_origem() {
		return num_parada_origem;
	}

	public void setNum_parada_origem(String num_parada_origem) {
		this.num_parada_origem = num_parada_origem;
	}

	public Double getLat_origem() {
		return lat_origem;
	}

	public void setLat_origem(Double lat_origem) {
		this.lat_origem = lat_origem;
	}

	public Double getLng_origem() {
		return lng_origem;
	}

	public void setLng_origem(Double lng_origem) {
		this.lng_origem = lng_origem;
	}

	public String getNum_linha_destino() {
		return num_linha_destino;
	}

	public void setNum_linha_destino(String num_linha_destino) {
		this.num_linha_destino = num_linha_destino;
	}

	public String getDirecao_linha_destino() {
		return direcao_linha_destino;
	}

	public void setDirecao_linha_destino(String direcao_linha_destino) {
		this.direcao_linha_destino = direcao_linha_destino;
	}

	public String getNum_veiculo_destino() {
		return num_veiculo_destino;
	}

	public void setNum_veiculo_destino(String num_veiculo_destino) {
		this.num_veiculo_destino = num_veiculo_destino;
	}

	public String getNum_parada_destino() {
		return num_parada_destino;
	}

	public void setNum_parada_destino(String num_parada_destino) {
		this.num_parada_destino = num_parada_destino;
	}

	public Double getLat_destino() {
		return lat_destino;
	}

	public void setLat_destino(Double lat_destino) {
		this.lat_destino = lat_destino;
	}

	public Double getLng_destino() {
		return lng_destino;
	}

	public void setLng_destino(Double lng_destino) {
		this.lng_destino = lng_destino;
	}

	public String getIntegracoes() {
		return integracoes;
	}

	public void setIntegracoes(String integracoes) {
		this.integracoes = integracoes;
	}

	public String[] getLinhas_path() {
		return linhas_path;
	}

	public void setLinhas_path(String[] linhas_path) {
		this.linhas_path = linhas_path;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public Integer getQtd_baldeacoes() {
		return qtd_baldeacoes;
	}

	public void setQtd_baldeacoes(Integer qtd_baldeacoes) {
		this.qtd_baldeacoes = qtd_baldeacoes;
	}

	public String[] getCaminho() {
		return caminho;
	}

	public void setCaminho(String[] caminho) {
		this.caminho = caminho;
	}

	public String getCod_acao() {
		return cod_acao;
	}

	public void setCod_acao(String cod_acao) {
		this.cod_acao = cod_acao;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        OdPathData odPathData = (OdPathData) o;
        return matricula == odPathData.matricula && data_hora_ida == odPathData.data_hora_ida;
    }
	
	@Override
	public int hashCode() {
		int hash = 7;
        
		hash = 31 * hash + matricula.hashCode();
        hash = 31 * hash + (data_hora_ida == null ? 0 : data_hora_ida.hashCode());
        
        return hash;
	}
}
