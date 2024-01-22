package excercise01;

import java.util.*;

public class Solution03 {

    public static void main(String[] args) {

        int[] requested = {11, 2, 4, 11, 11, 2, 3};
        int[] delivered = {11, 4, 2, 4};
        Set<Integer> missingProducts = new HashSet<>();
        missingProducts = calculateMissingProducts(requested, delivered);
        System.out.println(missingProducts);

    }

    private static Set<Integer> calculateMissingProducts(int[] requested, int[] delivered) {
        Set<Integer> missingProducts = new TreeSet<>();
        Map<Integer, Integer> deliveredMap = new HashMap<>();
        for (Integer deliver : delivered) {
            deliveredMap.put(deliver, deliveredMap.getOrDefault(deliver, 0) + 1);
        }

        for (Integer req : requested) {
            if (deliveredMap.containsKey(req) && deliveredMap.get(req) > 0) {
                deliveredMap.put(req, deliveredMap.getOrDefault(req, 0) - 1);
            } else {
                missingProducts.add(req);
            }
        }
        return missingProducts;
    }

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