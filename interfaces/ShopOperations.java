package interfaces;

import classes.Shop;

public interface ShopOperations
{
	boolean insertShop(Shop s);
	boolean removeShop(Shop s);
	Shop searchShop(int sid);
	void showAllShops();
}