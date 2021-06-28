package app.core;

public class Store {
	// attribute
	// 1. access modifier - private
	// 2. type - Item[]
	// 3. identifier - items
	// 4. value - Item[10]
	private Item[] items = new Item[10];

	// CTOR - default
	public Store() {
	}

	// method
	public void addItem(Item item) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				break;
			}
		}
	}

	public void removeItem(int itemId) {
		for (int i = 0; i < items.length; i++) {
			Item currentItem = items[i];
			if (currentItem != null && currentItem.getId() == itemId) {
				items[i] = null;
				break;
			}
		} 
	} 

}