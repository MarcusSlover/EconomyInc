/*******************************************************************************
 *******************************************************************************/
package fr.fifoube.items;

import net.minecraft.item.Item;

public class ItemTwoHundreedB extends Item implements IValue {

    public ItemTwoHundreedB(Properties properties) {
        super(properties);
    }

    @Override
    public int getValue() {

        return 200;
    }

}
