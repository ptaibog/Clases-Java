package com.campusdual;

public class GettersSetters {

    public int actualFuel = 10;
    public static String fuelLabel="Gasolina";

    public int getActualFuel(){
        return this.actualFuel;
    }
    public String getFuelLabel(){
        return GettersSetters.fuelLabel;
    }

    public void setFuelLabel(String fuelLabel){
        GettersSetters.fuelLabel = fuelLabel;
    }

    public void showDetails(){
        System.out.println("Tengo " + this.getActualFuel() + " l. de " + this.getFuelLabel().toLowerCase());
    }

    public static void main(String[] args) {
        GettersSetters g = new GettersSetters();
        GettersSetters g1 = new GettersSetters();
        g.showDetails();
        g1.showDetails();
        g.setFuelLabel("diésel");
        g.showDetails();
        g1.showDetails();

    }
}



