public class SortingOrders {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;

                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {

        if (low < high) {

            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);

        }
    }

    public static int partition(Order[] orders, int low, int high) {

        double pivot = orders[high].totalPrice;

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (orders[j].totalPrice < pivot) {

                i++;

                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;

            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    // Display Orders
    public static void display(Order[] orders) {

        for (Order order : orders) {
            order.display();
        }

    }

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Aman", 2500),
                new Order(102, "Priya", 1200),
                new Order(103, "Rahul", 4200),
                new Order(104, "Neha", 3100),
                new Order(105, "Riya", 1800)

        };

        System.out.println("Before Sorting");
        display(orders);

        bubbleSort(orders);

        System.out.println("After Bubble Sort");
        display(orders);

        quickSort(orders, 0, orders.length - 1);

        System.out.println("After Quick Sort");
        display(orders);

    }
}