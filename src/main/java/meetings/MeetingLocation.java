package meetings;

public class MeetingLocation {
	
	private String locationCountryCode;
	private String locationCity;
	
	public MeetingLocation(String locationCountryCode, String locationCity) {
		
		this.locationCountryCode 	= locationCountryCode;
		this.locationCity 			= locationCity;
		
	}
	
	public String getLocationCountryCode() {
		return this.locationCountryCode;
	}
	
	public void setLocationCountryCode(String locationCountryCode) {
		this.locationCountryCode = locationCountryCode;
	}
	
	public String getLocationCity() {
		return this.locationCity;
	}
	
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	
	
	
}
