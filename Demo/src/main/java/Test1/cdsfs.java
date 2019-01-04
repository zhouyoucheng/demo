package Test1;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;


public class cdsfs {
	public static void main(String[] args) {
		Object aLong = null;
		Integer aInteger = (Integer)aLong;
	}

	public static void addQtyCount(List<LocStockVO> locStockVOs) {
		BigDecimal allocateStockQtyCount = BigDecimal.ZERO;
		BigDecimal realAvailableStockCount = BigDecimal.ZERO;
		BigDecimal realStockQtyCount = BigDecimal.ZERO;
		for (LocStockVO locStockVO : locStockVOs) {
			allocateStockQtyCount = allocateStockQtyCount.add((BigDecimal) (locStockVO.getAllocateStockQty() == null ? BigDecimal.ZERO : locStockVO.getAllocateStockQty()));
			realAvailableStockCount = realAvailableStockCount.add((BigDecimal) (locStockVO.getRealAvailableStock() == null ? BigDecimal.ZERO : locStockVO.getRealAvailableStock()));
			realStockQtyCount = realStockQtyCount.add((BigDecimal) (locStockVO.getRealStockQty() == null ? BigDecimal.ZERO : locStockVO.getRealStockQty()));
		}
	}
}
