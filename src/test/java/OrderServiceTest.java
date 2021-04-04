import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class OrderServiceTest {

    OrderService orderService;
    @Test
    public void when_Items_are_selected_total_order_value_should_be_returned() {
        selectFoodItems();
        assertEquals(50, orderService.totalOrderValue());
    }

    private void selectFoodItems() {
        orderService = new OrderService();

        Item tandoorRoti = new Item("Tandoor Roti", 25);
        orderService.addFoodItemsToCart(tandoorRoti, 1);

        Item zeeraRice = new Item("Zeera Rice", 25);
        orderService.addFoodItemsToCart(zeeraRice, 1);

    }
}