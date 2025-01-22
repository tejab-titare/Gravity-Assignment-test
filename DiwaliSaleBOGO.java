package com.app.productbase.pi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * described "Buy One Get One Free" (BOGO) campaign:
 */
public class DiwaliSaleBOGO {
	public static void main(String[] args) {
		// Example Input
		List<Integer> productPricesList = List.of(10, 20, 30, 40, 50, 60);
		// Example :02 
		List<Integer> productPricesList2 = List.of(10, 20, 30, 40, 50, 50, 60);

		// Get the result
		SaleStore productPricesListResult = maximizeDiscount(productPricesList);

		// Output the results productPricesList1
		System.out.println("Discounted Items (Free): " + productPricesListResult.freeItems);
		System.out.println("Payable Items: " + productPricesListResult.paidItems);

		// productPricesList1

	}// end

	/**
	 * 
	 * @param prices
	 * @return
	 */
	public static SaleStore maximizeDiscount(List<Integer> prices) {
		// List stream- Sort prices in descending order

		List<Integer> freeItems = new ArrayList<>();
		List<Integer> paidItems = new ArrayList<>();

		List<Integer> sortedPrices = prices.stream().sorted(Comparator.reverseOrder()).toList();

		// Pair items to maximize discount
		for (int i = 0; i < sortedPrices.size(); i++) {
			// even condition check
			if (i % 2 == 0) {
				// Paid items: Add items at even indices (0, 2, 4, ...)
				paidItems.add(sortedPrices.get(i));
			} else {
				// Free items: Add items at odd indices (1, 3, 5, ...)
				freeItems.add(sortedPrices.get(i));
			}
		}

		return new SaleStore(paidItems, freeItems);
	}// end

}//end class

