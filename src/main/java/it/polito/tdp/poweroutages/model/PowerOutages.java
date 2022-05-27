package it.polito.tdp.poweroutages.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PowerOutages {
	private int id;
	private Nerc nerc;
	private LocalDateTime start;
	private LocalDateTime finish;
	private int personeCoinvolte;
	private long durataEvento;
	private int year;
	public PowerOutages(int id, Nerc nerc, LocalDateTime start, LocalDateTime finish, int personeCoinvolte) {
		super();
		this.id = id;
		this.nerc = nerc;
		this.start = start;
		this.finish = finish;
		this.personeCoinvolte = personeCoinvolte;
		LocalDateTime tempo=LocalDateTime.from(start);
		this.durataEvento=tempo.until(finish, ChronoUnit.HOURS);
		this.year=start.getYear();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Nerc getNerc() {
		return nerc;
	}
	public void setNerc(Nerc nerc) {
		this.nerc = nerc;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getFinish() {
		return finish;
	}
	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}
	public int getPersoneCoinvolte() {
		return personeCoinvolte;
	}
	public void setPersoneCoinvolte(int personeCoinvolte) {
		this.personeCoinvolte = personeCoinvolte;
	}
	public long getDurataEvento() {
		return durataEvento;
	}
	public void setDurataEvento(long durataEvento) {
		this.durataEvento = durataEvento;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PowerOutages other = (PowerOutages) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(this.id);
		return sb.toString();
	}
	
	

}
