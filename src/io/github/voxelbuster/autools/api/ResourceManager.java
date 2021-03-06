package io.github.voxelbuster.autools.api;

import javax.swing.*;
import java.util.HashMap;

public class ResourceManager {
    private static HashMap<String, String> paths = new HashMap<>();

    public static void init() {
        String[] keys = {
                "adb_win",
                "adb_linux",
                "adb_mac",
                "app_icon",
                "flash_icon",
                "backup_icon",
                "restore_icon",
                "romsdb"
        };

        String[] vals = {
                "res/adb/win/",
                "res/adb/linux/",
                "res/adb/mac/",
                "res/img/app_icon.png",
                "res/img/flash_icon.png",
                "res/img/backup_icon.png",
                "res/img/restore_icon.png",
                "res/data/romsdb.csv"
        };

        for (int i=0;i<keys.length;i++) {
            paths.put(keys[i], vals[i]);
        }
    }

    public static ImageIcon getIcon(String key) {
        return new ImageIcon(paths.get(key));
    }

    public static String getPath(String key) {
        return paths.get(key);
    }
}
