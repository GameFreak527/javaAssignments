package oopsConcept;

public class Nintendo extends Console{
	private int bundles;
	
	public Nintendo(int bundles) {
		this.bundles = bundles;
	}
	
	private int getBundles() {
		return bundles;
	}
	
	public int maxSales() {
		return super.games()*this.getBundles();
	}
	
}
