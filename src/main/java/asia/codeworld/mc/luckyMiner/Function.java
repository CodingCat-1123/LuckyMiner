package asia.codeworld.mc.luckyMiner;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

public class Function {
    public void sendMessage(String Message) {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(Message);
    }
}
