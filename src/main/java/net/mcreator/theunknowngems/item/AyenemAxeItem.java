
package net.mcreator.theunknowngems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.theunknowngems.TheUnknownGemsModElements;

@TheUnknownGemsModElements.ModElement.Tag
public class AyenemAxeItem extends TheUnknownGemsModElements.ModElement {
	@ObjectHolder("the_unknown_gems:ayenem_axe")
	public static final Item block = null;
	public AyenemAxeItem(TheUnknownGemsModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 286;
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
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AyenemItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ayenem_axe"));
	}
}
