package com.factory;

import com.bean.AirConditioner;
import com.bean.Television;
import com.bean.Washer;
import com.product.Product;

/**
 * ������
 * @author XiaoNong
 *
 */
public class ProductFactory {
	
	
	public static Product create(String type) {
		Product product = null;
        switch (type) {
            case "ϴ�»�":
            	product = new Washer();
                break;
            case "���ӻ�":
            	product = new Television();
                break;
            case "�յ�":
            	product = new AirConditioner();
            	break;
        }
        return product;
    }
	
	
}
