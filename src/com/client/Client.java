package com.client;

import com.factory.ProductFactory;
import com.product.Product;

/**
 * ������
 * @author XiaoNong
 *
 */
public class Client {

	
	public static void main(String[] args) {
		// ���õ��ӻ�
		Product washer = ProductFactory.create("ϴ�»�");
		washer.product();
		// ���õ����
		Product television = ProductFactory.create("���ӻ�");
		television.product();
		// ����ϴ�»�
		Product airConditioner = ProductFactory.create("�յ�");
		airConditioner.product();
	}
}
