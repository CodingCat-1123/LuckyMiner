package asia.codeworld.mc.luckyMiner;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public final class LuckyMiner extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage("这是发送到控制台的消息！");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
