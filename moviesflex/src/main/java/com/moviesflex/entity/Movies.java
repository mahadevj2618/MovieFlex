package com.moviesflex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int m_id;
	
	String mname;
	
	@Column(length = 8000)
	String mlink;
	String Genre;
	String cost;
	String director;
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(int m_id, String mname, String mlink, String genre, String cost, String director) {
		super();
		this.m_id = m_id;
		this.mname = mname;
		this.mlink = mlink;
		Genre = genre;
		this.cost = cost;
		this.director = director;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMlink() {
		return mlink;
	}
	public void setMlink(String mlink) {
		this.mlink = mlink;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Movies [m_id=" + m_id + ", mname=" + mname + ", mlink=" + mlink + ", Genre=" + Genre + ", cost=" + cost
				+ ", directur=" + director + "]";
	}
	
	
	
	

}
