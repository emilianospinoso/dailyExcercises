package excercise03;

import java.util.*;

public class MapSolution {

    //17 MINUTES 13 JANUARY


    public Set<Integer> returnNotDelivered(int[] ordereds, int[] delivereds) {
        Set<Integer> notDelivered = new HashSet<>();
        Map<Integer, Integer> mapDelivered = new HashMap<>();
        for (Integer delivered : delivereds) {
            mapDelivered.put(delivered, mapDelivered.getOrDefault(delivered, 0) + 1);
        }
        System.out.println(mapDelivered);

        for (Integer order : ordereds) {
            if (mapDelivered.containsKey(order) && mapDelivered.get(order) > 0) {
                mapDelivered.put(order, mapDelivered.getOrDefault(order, 0) - 1);
            } else {
                notDelivered.add(order);
            }
        }
        System.out.println("Result previous to set and sort");
        notDelivered.forEach(System.out::println);
        Arrays.sort(notDelivered.toArray());
        return notDelivered;


    }


}
/* Find missing products
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
