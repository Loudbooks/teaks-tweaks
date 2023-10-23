package me.teakivy.teakstweaks.craftingtweaks.recipes;

import me.teakivy.teakstweaks.craftingtweaks.AbstractRecipe;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CraftableBundlesLeather extends AbstractRecipe {

    public CraftableBundlesLeather() {
        super("craftable-bundles-leather", Material.BUNDLE);
    }

    @Override
    public void registerRecipes() {
        NamespacedKey key = new NamespacedKey(teaksTweaks, "bundle_leather_bundles");

        ShapedRecipe recipe = new ShapedRecipe(key, new ItemStack(Material.BUNDLE));

        recipe.shape("s#s", "# #", "###");
        recipe.setIngredient('#', Material.LEATHER);
        recipe.setIngredient('s', Material.STRING);

        Bukkit.addRecipe(recipe);
    }
}
