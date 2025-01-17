package asia.codeworld.mc.luckyMiner;

import org.bukkit.plugin.java.JavaPlugin;

public final class LuckyMiner extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Function Function = new Function();
        Function.sendMessage("||||||||||||||||||||");
        Function.sendMessage("| LuckyMiner  v1.0 |");
        Function.sendMessage("|   by CodingCat   |");
        Function.sendMessage("||||||||||||||||||||");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
