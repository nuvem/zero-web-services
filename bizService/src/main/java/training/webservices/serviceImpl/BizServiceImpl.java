package training.webservices.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.foo.bizservice.BizService;
import com.foo.bizservice.ProductQueryComplexType;
import com.foo.bizservice.QueryInvalidProductId;
import com.foo.bizservice.QueryInvalidQty;
import com.foo.bizservice.ProductQueryComplexType.QueryItem;
import com.foo.bizservice.QueryResponseComplexType;
import com.foo.bizservice.QueryResponseComplexType.ProductQueryResult;

public class BizServiceImpl implements BizService {

	private static List<ProductItem> items = new ArrayList<>();
	static {
		makeModelTest();
	}

	// @Override
	// public QueryResponseComplexType query(ProductQueryComplexType parameters)
	// {
	// QueryResponseComplexType queryResponse = new QueryResponseComplexType();
	// for (QueryItem queryItem : parameters.getQueryItem()) {
	// for (ProductItem productItem : items) {
	// if (queryItem.getProductId().equals(productItem.getProductId())
	// && (queryItem.getQty() <= productItem.getQty())) {
	// ProductQueryResult productQueryResult = new ProductQueryResult();
	// productQueryResult.setProductId(productItem.getProductId());
	// productQueryResult.setPrice(productItem.getPrice());
	// queryResponse.getProductQueryResult().add(
	// productQueryResult);
	// }
	// }
	//
	// }
	// return queryResponse;
	// }

	@Override
	public QueryResponseComplexType query(ProductQueryComplexType parameters)
			throws QueryInvalidProductId, QueryInvalidQty {
		QueryResponseComplexType queryResponse = new QueryResponseComplexType();
		for (QueryItem queryItem : parameters.getQueryItem()) {

			// Test faults on service
			if (queryItem.getProductId().length() > 4) {
				throw new QueryInvalidProductId("Invalid product Id",
						queryItem.getProductId());
			}

			if (queryItem.getQty() <= 0) {
				throw new QueryInvalidQty("Invalid qty.", queryItem.getQty());
			}

			for (ProductItem productItem : items) {

				if (queryItem.getProductId().equals(productItem.getProductId())
						&& (queryItem.getQty() <= productItem.getQty())) {

					ProductQueryResult productQueryResult = new ProductQueryResult();
					productQueryResult.setProductId(productItem.getProductId());
					productQueryResult.setPrice(productItem.getPrice());

					queryResponse.getProductQueryResult().add(
							productQueryResult);
				}
			}

		}
		return queryResponse;

	}

	private static void makeModelTest() {
		ProductItem item1 = new ProductItem("0001", 100, 25);
		ProductItem item2 = new ProductItem("0002", 150, 32);
		ProductItem item3 = new ProductItem("0003", 99, 320);
		ProductItem item4 = new ProductItem("0004", 300, 15);
		ProductItem item5 = new ProductItem("0005", 254, 69);
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);

	}

	private static class ProductItem {

		private String productId;
		private int qty, price;

		public ProductItem() {

		}

		public ProductItem(String productId, int qty, int price) {
			super();
			this.productId = productId;
			this.qty = qty;
			this.price = price;
		}

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

	}

}
