package inheritance;

public class City {
	    private String cityName;

	    public String getCityName() {
	        return cityName;
	    }
	    public void setCityName(String cityName) {
	        this.cityName = cityName;
	    }
	}
	class State extends City {
	    private String stateName;

	    public String getStateName() {
	        return stateName;
	    }
	    public void setStateName(String stateName) {
	        this.stateName = stateName;
	    }
	}
	class Country extends State {
	    private String countryName;

	    public String getCountryName() {
	        return countryName;
	    }
	    public void setCountryName(String countryName) {
	        this.countryName = countryName;
	    }
	}
	