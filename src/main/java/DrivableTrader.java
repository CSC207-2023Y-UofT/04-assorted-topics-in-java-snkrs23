/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

/* A subclass of Trader named DomesticatableTrader.
 * This class is identical to Trader, except that it takes
 * only Domesticatable objects in its inventory, wishlist, etc.
 */

import java.util.List;

class DriveableTrader extends Trader<Driveable> {
    /**
     * Construct a DomesticatableTrader, giving them the
     * given inventory, wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */

    /**
     * Construct a DomesticatableTrader, giving them the
     * given money and an empty wishlist and inventory.
     *
     * @param money     The Trader's money
     */
    public DriveableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(Driveable item) {

        if (item instanceof Tradable) {
            Tradeable trade = (Tradeable) item;
            return trade.getPrice() + trade.getMaxSpeed();
        } else {
            return Tradeable.MISSING_PRICE;
        }

    }

}
