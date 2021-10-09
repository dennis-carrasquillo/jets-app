package com.dennis.carrasquillo.jets.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Enitity class for {@link Jet}
 * @author dennis carrasquillo
 *
 */
@Entity
@Table(name = "jet")
public class Jet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int jetId;
	
	@Column(name = "name")
	private String jetName;
	
	@Column(name = "max_speed")
	private Integer speed;
	
	@Column(name = "year_intro")
	private Integer introduced;
	
	public Jet() {}

	public Jet(int jetId, String jetName, int speed, int introduced) {
		super();
		this.jetId = jetId;
		this.jetName = jetName;
		this.speed = speed;
		this.introduced = introduced;
	}

	public int getJetId() {
		return jetId;
	}

	public void setJetId(int jetId) {
		this.jetId = jetId;
	}

	public String getJetName() {
		return jetName;
	}

	public void setJetName(String jetName) {
		this.jetName = jetName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getIntroduced() {
		return introduced;
	}

	public void setIntroduced(int introduced) {
		this.introduced = introduced;
	}

	@Override
	public String toString() {
		return "Jet [jetId=" + jetId + ", jetName=" + jetName + ", speed=" + speed + ", introduced=" + introduced + "]";
	}
}
