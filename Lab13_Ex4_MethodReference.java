package capgemini_labbook;

import java.util.Arrays;
import java.util.List;

public class Lab13_Ex4_MethodReference {
	public static void main(String[] args) {
		List<String> location = Arrays.asList(new String[] { "Banglore", "Hyderabad", "Chennai" });
		location.stream().map(City::new).forEach(System.out::print);

	}
}

class City {
	protected String getCity() {
		return city;
	}

	protected void setCity(String city) {
		this.city = city;
	}

	private String city;

	public City(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return city + " ";
	}

}