package Construction_JMF;

public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;

	public Apartment() {
	super();
	numRentableUnits = 0;
	avgUnitSize = 0.0;
	parkingAvailable = false;
	}

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
	String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,
	double avgUnitSize, boolean parkingAvailable) {
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms,
	laundryRoom);
	this.numRentableUnits = numRentableUnits;
	this.avgUnitSize = avgUnitSize;
	this.parkingAvailable = parkingAvailable;
	}

	public void draw() {
	System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}

	public String displayData() {
	String str = "";
	str += super.toString() + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: "
	+ avgUnitSize + "\nParking Available: " + ((parkingAvailable == true) ? "Y" : "N");
	return str;
	}

	public int getNumRentableUnits() {
	return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
	this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
	return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
	this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
	return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
	this.parkingAvailable = parkingAvailable;
	}

	}
