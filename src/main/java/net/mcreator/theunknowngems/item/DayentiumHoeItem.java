
package net.mcreator.theunknowngems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.theunknowngems.TheUnknownGemsModElements;

@TheUnknownGemsModElements.ModElement.Tag
public class DayentiumHoeItem extends TheUnknownGemsModElements.ModElement {
	@ObjectHolder("the_unknown_gems:dayentium_hoe")
	public static final Item block = null;
	public DayentiumHoeItem(TheUnknownGemsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DayentiumItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("dayentium_hoe"));
	}
}
