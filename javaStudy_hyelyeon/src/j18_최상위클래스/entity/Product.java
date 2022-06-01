package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

/*
 * 상품 정보 클래스(Entity Class)
 * 
 * 변수
 * productCode		int
 * productName		String
 * category			int
 * productionDate 	LocalDate (import) //LocalDate - 날짜 데이터일 경우 사용
 * 
 * 기본 생성자
 * 
 * 전체 생성자
 * 
 * getter, setter 
 * 
 * hashCode()//값을 비교하기 위함
 * 
 * equals()
 * 
 * toString() //값을 확인
 */

public class Product {
	
	//변수
	private int productCode;
	private String productName;
	private int category;
	private LocalDate productionDate;
	
	
	//기본 생성자
	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	//전체 생성자
	public Product(int productCode, String productName, int category, LocalDate productionDate) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.productionDate = productionDate;
	}

	
	//getter, setter
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}

	
	//hashCode()
	@Override
	public int hashCode() {
		return Objects.hash(category, productCode, productName, productionDate);
	}

	
	//equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return category == other.category && productCode == other.productCode
				&& Objects.equals(productName, other.productName)
				&& Objects.equals(productionDate, other.productionDate);
	}

	
	//toString()
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", productionDate=" + productionDate + "]";
	}
	
	
	
	
	
	

}
