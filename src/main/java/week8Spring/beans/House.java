package week8Spring.beans;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Mar 17, 2023
 */
@Entity
public class House {
	
	private long id;
	private String address;
	private int numOfBeds;
	private int numOfBaths;
	private boolean forSale;
	
	public House() {
		super();
	}

	public House(String address) {
		super();
		this.address = address;
	}

	public House(String address, int numOfBeds, int numOfBaths, boolean forSale) {
		super();
		this.address = address;
		this.numOfBeds = numOfBeds;
		this.numOfBaths = numOfBaths;
		this.forSale = forSale;
	}

	public House(long id, String address, int numOfBeds, int numOfBaths, boolean forSale) {
		super();
		this.id = id;
		this.address = address;
		this.numOfBeds = numOfBeds;
		this.numOfBaths = numOfBaths;
		this.forSale = forSale;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumOfBeds() {
		return numOfBeds;
	}

	public void setNumOfBeds(int numOfBeds) {
		this.numOfBeds = numOfBeds;
	}

	public int getNumOfBaths() {
		return numOfBaths;
	}

	public void setNumOfBaths(int numOfBaths) {
		this.numOfBaths = numOfBaths;
	}

	public boolean isForSale() {
		return forSale;
	}

	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", address=" + address + ", numOfBeds=" + numOfBeds + ", numOfBaths=" + numOfBaths
				+ ", forSale=" + forSale + "]";
	}
	
	
}
