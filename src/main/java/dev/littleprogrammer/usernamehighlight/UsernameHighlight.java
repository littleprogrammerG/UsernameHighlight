package dev.littleprogrammer.usernamehighlight;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = UsernameHighlight.MODID, version = UsernameHighlight.VERSION)
public class UsernameHighlight {

    public static final String MODID = "usernamehighlight";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ChatHandler());
    }
}
