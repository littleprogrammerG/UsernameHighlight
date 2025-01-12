package dev.littleprogrammer.usernamehighlight;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatHandler {

    @SubscribeEvent
    public void onReceive(ClientChatReceivedEvent event) {
        IChatComponent chatMessage = event.message;
        String username = Minecraft.getMinecraft().getSession().getUsername();
        String lowerCaseName = username.toLowerCase();

        if (chatMessage.getUnformattedText().toLowerCase().contains(lowerCaseName)) {
            event.setCanceled(true);

            String customMessage = "\u00A7c\u00A7l" + chatMessage.getUnformattedText();

            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(customMessage));
        }
    }
}
