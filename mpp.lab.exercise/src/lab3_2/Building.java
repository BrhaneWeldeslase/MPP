package lab3_2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String name;
	private List<Apartment> listApartments;
	private double maintenaceCostMonthly;

	public Building(String name) {
		this.name=name;
		listApartments = new ArrayList<>();
     }

	public double getMaintenaceCostMonthly() {
		return maintenaceCostMonthly;
	}

	public void setMaintenaceCostMonthly(double maintenaceCostMonthly) {
		this.maintenaceCostMonthly = maintenaceCostMonthly;
	}
	
	public void  addApartment(String Name, String Type) {
		Apartment a = new Apartment(Name, Type);
		listApartments.add(a);
	}

	public List<Apartment> getListApartments() {
		return listApartments;
	}

	public void setListApartments(List<Apartment> listApartments) {
		this.listApartments = listApartments;
	}

	private int rentForSingle = 500;
	private int rentForTwoBeds = 900;
	private int studio = 400;
	private int luxurury = 1100;

	public double rent() {
		double sum = 0.0;
		for (Apartment t : listApartments) {
			switch (t.getType()) {
			case "SingleBed":
				sum = sum + rentForSingle;
				break;
			case "TwoBed":
				sum = sum + rentForTwoBeds;
				break;
			case "studio":
				sum = sum + studio;
				break;
			case "luxurury":
				sum = sum + luxurury;
				break;

			}
		}
		return sum - getMaintenaceCostMonthly();
	}



	

}
