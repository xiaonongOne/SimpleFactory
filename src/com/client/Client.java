package com.client;

import com.factory.ProductFactory;
import com.product.Product;

/**
 * 测试类
 * @author XiaoNong
 *
 */
public class Client {

	
	public static void main(String[] args) {
		// 调用电视机
		Product washer = ProductFactory.create("洗衣机");
		washer.product();
		// 调用电冰箱
		Product television = ProductFactory.create("电视机");
		television.product();
		// 调用洗衣机
		Product airConditioner = ProductFactory.create("空调");
		airConditioner.product();
	}
}
