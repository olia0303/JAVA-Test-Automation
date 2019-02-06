package core;

public class MainStarSystem {

	public static void main(String[] args) {
		Planet planet = new Planet("Third", "Core", 2569);
		planet.printClassOfPlanet();
		planet.printComponentOfPlanet();
		planet.setNum(5);
		planet.setType("Sun");
		planet.printTypeSystemOfStars();
		planet.printNumofStarsInSystem();
		System.out.println(planet.hashCode());
		System.out.println(planet.toString());
			
		Star star = new Star();
		star.setCompOfStar("Core");
		star.setTemp(52558);
		star.printComponentOfStar();
		star.printTemperatureOfStar();
		star.setNum(4);
		star.setType("Triple star");
		star.printTypeSystemOfStars();
		star.printNumofStarsInSystem();
		System.out.println(star.hashCode());
		System.out.println(star.toString());
	    
        Earth earth = new Earth();
        earth.setNum(4);
        earth.setType("Earth");
        earth.printNumofStarsInSystem();
        earth.printTypeSystemOfStars();
        earth.printFormOfEarth();
        earth.printRadiusOfEarth();
    	System.out.println(earth.hashCode());
		System.out.println(earth.toString());

	    Mars mars = new Mars();
	    mars.setNum(2);
	    mars.setSputnik("Fobos");
	    mars.printNumbersOfMars();
	    mars.printSputnikOfMars();
	    System.out.println(mars.hashCode());
		System.out.println(mars.toString());
	    
		Sun sun = new Sun();
		sun.setStruct("Photosphere");
		sun.setRadius(987);
		sun.printRadiusOfSun();
		sun.printStructureOfSun();
		System.out.println(sun.hashCode());
		System.out.println(sun.toString());
				
		Sirius sirius = new Sirius();
		sirius.setAge(3256);
		sirius.setType("Sirius");
		sirius.printAgeOfSirius();
		sirius.printTypeOfSirius();
		System.out.println(mars.hashCode());
		System.out.println(mars.toString());

		
	}

}
