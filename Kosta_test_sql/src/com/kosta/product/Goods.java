package com.kosta.product;

public class Goods {
	//상품 코드용 sequence
	private static int PRODUCT_SEQ=1;
	
	//제품 카테고리 BOOK, COMPUTER, ETC
	public final static String CATE_BOOK="BOOK";
	public final static String CATE_COMPUTER="COMPUTER";
	public final static String CATE_ETC="ETC";
	
	//제품 코드
	private String code;
	//제품 이름
	private String name;
	//제품 가격
	private int price;
	//제품 수량
	private int stock;
	//제품 종류
	private String category;
	
	//생성자 정의		
	public Goods(String name, int price, int stock, String category) {
		// 구현해야하는 부분 
		
		
	}
	
	//Setter, Getter
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	//구현해야 하는 부분
	//toString override
}
