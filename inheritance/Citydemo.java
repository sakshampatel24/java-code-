package inheritance;

public class Citydemo {
	    public static void main(String[] args) {
	        Country country = new Country();
	        country.setCityName("JHANSI");
	        country.setStateName("UTTAR PARDESH");
	        country.setCountryName("INDIA");

	        System.out.println("City: " + country.getCityName());
	        System.out.println("State: " + country.getStateName());
	        System.out.println("Country: " + country.getCountryName());
	    }


}

