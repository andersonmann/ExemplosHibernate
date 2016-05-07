package br.com.sisnema.model;

public class Midia {
	private Integer codigo;
	private Filme filme;
	private boolean inutilizada;

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the filme
	 */
	public Filme getFilme() {
		return filme;
	}

	/**
	 * @param filme
	 *            the filme to set
	 */
	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	/**
	 * @return the inutilizada
	 */
	public boolean isInutilizada() {
		return inutilizada;
	}

	/**
	 * @param inutilizada
	 *            the inutilizada to set
	 */
	public void setInutilizada(boolean inutilizada) {
		this.inutilizada = inutilizada;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Midia [codigo=" + codigo + ", filme=" + filme + ", inutilizada=" + inutilizada + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		result = prime * result + (inutilizada ? 1231 : 1237);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Midia)) {
			return false;
		}
		Midia other = (Midia) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (filme == null) {
			if (other.filme != null) {
				return false;
			}
		} else if (!filme.equals(other.filme)) {
			return false;
		}
		if (inutilizada != other.inutilizada) {
			return false;
		}
		return true;
	}

}
