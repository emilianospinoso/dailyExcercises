package excercise01;

import java.util.*;

public class Solution01 {

    public static void main(String[] args) {
        int[] requested = {11, 2, 4, 11, 11, 2, 3};
        int[] delivered = {2, 4, 2, 11};
        findMissingProducts(requested, delivered);
    }

    static List<Integer> findMissingProducts(int[] requested, int[] delivered) {
        List<Integer> missingProductsCount = new ArrayList<>();
        Map<Integer, Integer> deliveredProductsCounts = new HashMap<>();
        for (int i = 0; i < delivered.length; i++) { //ON
            deliveredProductsCounts.put(delivered[i], deliveredProductsCounts.getOrDefault(delivered[i], 0) + 1);
        }
        System.out.println(deliveredProductsCounts);

        for (int i = 0; i < requested.length; i++) {
            if (deliveredProductsCounts.containsKey(requested[i]) && (deliveredProductsCounts.get(requested[i]) > 0)) {
                deliveredProductsCounts.put(requested[i], deliveredProductsCounts.get(requested[i]) - 1);
            } else {
                missingProductsCount.add(requested[i]);
            }
        }
        Set<Integer> uniques= new HashSet<>(missingProductsCount);

        for (Integer req : uniques) {
            System.out.println(req);
        }

        return missingProductsCount;
    }





    /*
    Find missing products
When a customer reports missing items in their order, we need to check what products were not delivered correctly.
Write an algorithm that receives two integer arrays:
- `requested`: product ids of the items ordered by the customer.
- `delivered`: product ids of the items delivered to the customer. and returns the sorted list of unique product ids with missing items.

Notes:
- A customer can order and receive several items of the same product.
Therefore, a product id can be repeated in the arrays.
- `delivered` is always a subset of `requested`.
Examples:
CORRECT DELIVERY
  requested = [1, 3, 5]
  delivered = [5, 3, 1]
  missingProducts(requested, delivered) => []
  All products were delivered correctly. No missing items.
MISSING PRODUCTS

  requested = [11, 2, 4, 11, 11, 2, 3]

  delivered = [2, 4, 2, 11]
   There were several items missing:
          - 2 missing items of product 11,
           - 1 missing item of product 3.
   Thus, the algorithm must return [3, 11]
     */


}
