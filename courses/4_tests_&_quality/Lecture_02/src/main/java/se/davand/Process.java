package se.davand;

public class Process {
    public void processOrder(Order order) {
        if (!validateOrder(order)) {
            return;
        }
        processValidOrder(order);
    }

    private boolean validateOrder(Order order) {
        if (!order.isValid()) {
            rejectOrder(order, "Invalid order");
            return false;
        }
        if (!order.hasStock()) {
            rejectOrder(order, "Out of stock");
            return false;
        }
        if (!order.customerHasCredit()) {
            rejectOrder(order, "Insufficient credit");
            return false;
        }
        return true;
    }

    private void processValidOrder(Order order) {
        order.markAsProcessed();
        notifyCustomer(order);
        updateInventory(order);
    }
}