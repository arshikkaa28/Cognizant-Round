public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Rahul";
        }

        else if (id == 102) {
            return "Priya";
        }

        else if (id == 103) {
            return "Aman";
        }

        else {
            return "Customer Not Found";
        }
    }

}