package com.app.productbase.pi;

import java.util.List;
/**
 * SaleStore class 
 * 
 */
public class SaleStore {

	List<Integer> paidItems;
	List<Integer> freeItems;

	/**
	 * 
	 * @param paidItems
	 * @param freeItems
	 */
	public SaleStore(List<Integer> paidItems, List<Integer> freeItems) {
		this.paidItems = paidItems;
		this.freeItems = freeItems;
	}
}

