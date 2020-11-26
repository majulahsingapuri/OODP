public class VendingMachineApp {
    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        double drinkCost, amount;

        System.out.println("1. Beer 3.0\n2. Coke 1.0\n3. Tea 2.0");
        drinkCost = vm.selectDrink();
        amount = vm.insertCoins(drinkCost);
        vm.checkChange(amount, drinkCost);
        vm.printReceipt();
    }
}
