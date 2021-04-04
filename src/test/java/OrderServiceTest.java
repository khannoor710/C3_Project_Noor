import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class OrderServiceTest {

    @Test
    public void when_Items_are_selected_total_order_value_should_be_returned() {
        assertEquals(1215, orderService.totalOrderValue());
    }
}