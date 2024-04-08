
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorkspaceTestModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> FIRETESTSPEED = GameRules.register("firetestspeed", GameRules.Category.UPDATES, GameRules.IntegerValue.create(0));
}
