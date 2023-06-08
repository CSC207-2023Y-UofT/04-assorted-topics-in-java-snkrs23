import java.util.List;

class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DriveableTrader, giving them the
     * given inventory, wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory,
                                List<Drivable>
                                        wishlist,
                                int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a DomesticatableTrader, giving them the
     * given money and an empty wishlist and inventory.
     *
     * @param money     The Trader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(Drivable item) {
        int super_price = super.getSellingPrice(item);
        if (super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }

        return super_price + item.getMaxSpeed();

    }

}

