package com.factory;

import com.bean.AirConditioner;
import com.bean.Television;
import com.bean.Washer;
import com.product.Product;

/**
 * 工厂类
 * @author XiaoNong
 *
 */
public class ProductFactory {
	
	
	public static Product create(String type) {
		Product product = null;
        switch (type) {
            case "洗衣机":
            	product = new Washer();
                break;
            case "电视机":
            	product = new Television();
                break;
            case "空调":
            	product = new AirConditioner();
            	break;
        }
        return product;
    }
	
	
}
