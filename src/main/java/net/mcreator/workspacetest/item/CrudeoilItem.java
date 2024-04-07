
package net.mcreator.workspacetest.item;

import net.minecraft.network.chat.Component;

public class CrudeoilItem extends BucketItem {

	public CrudeoilItem() {
		super(WorkspaceTestModFluids.CRUDEOIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
