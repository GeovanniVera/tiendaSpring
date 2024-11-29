package com.tienda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos
    private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen = "austria.jpg";
	private Integer destacado;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Integer getDestacado() {
		return destacado;
	}
	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}
	@Override
	public String toString() {
		return "Categorias [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", destacado=" + destacado + "]";
	}
	
	
}
