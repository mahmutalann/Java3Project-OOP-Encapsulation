package oopIntroEncapsulation;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Mac", 40000, "25 GB Ram", 20); //Örnek, Referans, Intance Oluşturma
		
		
		Product product2 = new Product();
		product2.setId(1);
		product2.setName("Iphone 12");
		product2.setUnitPrice(25000);
		product2.setDetail("128 GB Ram");
		product2.setDiscount(30);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category1.setId(2);
		category2.setName("Telefon");
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}

}
