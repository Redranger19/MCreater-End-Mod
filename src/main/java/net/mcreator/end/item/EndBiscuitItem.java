
package net.mcreator.end.item;

@EndModElements.ModElement.Tag
public class EndBiscuitItem extends EndModElements.ModElement {

	@ObjectHolder("end:end_biscuit")
	public static final Item block = null;

	public EndBiscuitItem(EndModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("end_biscuit");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
