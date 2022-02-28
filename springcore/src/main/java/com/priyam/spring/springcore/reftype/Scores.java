package com.priyam.spring.springcore.reftype;

public class Scores {
	private double physics;
	private double chemistry;
	private double maths;

	@Override
	public String toString() {
		return "Scores [physics=" + physics + ", chemistry=" + chemistry + ", maths=" + maths + "]";
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

}
