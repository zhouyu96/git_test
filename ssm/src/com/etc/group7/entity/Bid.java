package com.etc.group7.entity;

public class Bid {
	//出价id
	private Integer bid_id;
	//出价用户
	private User bid_user;
	//出价时间
	private String bid_time;
	//出价价格
	private Integer bid_price;
	//出价的物品
	private Goods bid_goods;
	public Integer getBid_id() {
		return bid_id;
	}
	public void setBid_id(Integer bidId) {
		bid_id = bidId;
	}
	public User getBid_user() {
		return bid_user;
	}
	public void setBid_user(User bidUser) {
		bid_user = bidUser;
	}
	public String getBid_time() {
		return bid_time;
	}
	public void setBid_time(String bidTime) {
		bid_time = bidTime;
	}
	public Integer getBid_price() {
		return bid_price;
	}
	public void setBid_price(Integer bidPrice) {
		bid_price = bidPrice;
	}
	public Goods getBid_goods() {
		return bid_goods;
	}
	public void setBid_goods(Goods bidGoods) {
		bid_goods = bidGoods;
	}
	

}
