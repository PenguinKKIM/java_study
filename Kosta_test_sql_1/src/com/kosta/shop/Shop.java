package com.kosta.shop;

import java.util.List;
import java.util.Map;

import com.kosta.dao.GoodsDAO;
import com.kosta.dao.OrderDAO;
import com.kosta.order.Order;
import com.kosta.product.Goods;

public class Shop {

	private GoodsDAO goodsDAO;
	private OrderDAO orderDAO;
	public Shop() {
		goodsDAO = new GoodsDAO();
		orderDAO = new OrderDAO();
	}
	
	public void addProduct(Goods goods) {
		goodsDAO.insertGoods(goods);
	}
	
	public Goods findGoodsByCode(String pCode) {
		Goods goods = goodsDAO.selectGoods(pCode);
		return goods;
	}

	public void printAllGoodsInfo() {
		List<Goods> goodsList = goodsDAO.selectGoodList();
		for(Goods goods : goodsList) {
			System.out.println(goods);
		}
	}
	
	public Integer order(Order order) {
		Integer ordrNo = orderDAO.insertOrder(order);
		goodsDAO.updateProductStock(order.getProductCode(), -order.getAmount());
		return ordrNo;
	}
	
	public Order findOrderByNo(Integer orderNo) {
		return orderDAO.selectOrder(orderNo);
	}
	
	public void printAllOrderInfo() {
		List<Order> orderList = orderDAO.selectOrderList();
		for(Order order:orderList) {
			System.out.println(order);
		}
	}
	
	public Order cancelOrder(Integer orderNo) {
		Order order = orderDAO.updateOrderCancel(orderNo);
		goodsDAO.updateProductStock(order.getProductCode(), order.getAmount());
		return order;
	}
	
	public void printOrderDetailsByCustomerAndIsCanceled(String customer, String cancelYN) {
		Map<String,Integer> result = null;
		Boolean isCanceled = false;
		if(cancelYN.equals("취소")) {
			isCanceled = true;
		}
		result=orderDAO.selectOrderByCustomerAndIsCanceled(customer, isCanceled);
		System.out.println(String.format("%s님의 %s주문 건수는: %d건이고,%s주문합계금액은: %d원 입니다", 
										customer,cancelYN,result.get("count"),
										cancelYN,result.get("amount")));
	}
}
