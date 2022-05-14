package gaujau;

public class PaniLyaune {

	private String name;
	private String address;
	private String email;
	private int zipcode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public static void main(String[] args) {

		PaniLyaune pani = new PaniLyaune();

		pani.setName("Santosh hang");
		pani.setEmail("santoshhang@gmail.com");
		pani.setAddress("chandragadi");
		pani.setZipcode(75038);

		System.out.println(pani.getName());
		System.out.println(pani.getAddress());
		System.out.println(pani.getEmail());
		System.out.println(pani.getZipcode());
	}

}
