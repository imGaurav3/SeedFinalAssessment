package com.example.demo.model;


public class TiffinProvider {

	private int tpId;
	private String name;
	private int costFullMeal;
	private int costHalfMeal;
	private String locality;
	
	public TiffinProvider() {
		
	}

	public TiffinProvider(int tpId, String name, int costFullMeal, int costHalfMeal, String locality) {
		this.tpId = tpId;
		this.name = name;
		this.costFullMeal = costFullMeal;
		this.costHalfMeal = costHalfMeal;
		this.locality = locality;
	}

	public int getTpId() {
		return tpId;
	}

	public void setTpId(int tpId) {
		this.tpId = tpId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCostFullMeal() {
		return costFullMeal;
	}

	public void setCostFullMeal(int costFullMeal) {
		this.costFullMeal = costFullMeal;
	}

	public int getCostHalfMeal() {
		return costHalfMeal;
	}

	public void setCostHalfMeal(int costHalfMeal) {
		this.costHalfMeal = costHalfMeal;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	@Override
	public String toString() {
		return "TiffinProvider [tpId=" + tpId + ", name=" + name + ", costFullMeal=" + costFullMeal + ", costHalfMeal="
				+ costHalfMeal + ", locality=" + locality + "]";
	}
	
	
}
