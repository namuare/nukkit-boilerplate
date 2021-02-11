package me.mocha.nukkitplugin;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {

    @Override
    public void onLoad() {
        //execute on enable this plugin
        //TODO load config file
    }

    @Override
    public void onEnable() {
        //execute on enable this plugin
        //TODO register event listeners and commands
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        //TODO execute on disable this plugin
        //TODO save and clear resources
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName()) {
            case "example":
                sender.sendMessage("example command");
                return true;
            default:
                return false;
        }
    }

}
