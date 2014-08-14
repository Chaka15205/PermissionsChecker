package gr.watchful.permchecker.datastructures;

import java.io.File;
import java.util.ArrayList;

/**
 * This will be saved as a JSON to persist user preferences across sessions
 */
public class Preferences {
	transient public File saveFolder;
	transient public File workingFolder;
	transient public File exportFolder;
	public String saveFolderPath;
	public String workingFolderPath;
	public String exportFolderPath;
	public ArrayList<String> minecraftVersions;
	public String defaultMinecraftVersion;
	public String parsedPackShortName;

    public Preferences() {
    }

    public void initPreferences(File appStore) {
        System.out.println("Initialized new preferences");

		saveFolderPath = appStore+File.separator+"packs";
		workingFolderPath = appStore+File.separator+"working";
		exportFolderPath = appStore+File.separator+"export";

        saveFolder = new File(saveFolderPath);
        workingFolder = new File(workingFolderPath);
		exportFolder = new File(exportFolderPath);

		minecraftVersions = new ArrayList<>();
		minecraftVersions.add("1.7.10");
		minecraftVersions.add("1.7.2");
		minecraftVersions.add("1.6.4");
		minecraftVersions.add("1.6.2");
		minecraftVersions.add("1.5.2");
		minecraftVersions.add("1.4.7");
		minecraftVersions.add("1.2.5");
		defaultMinecraftVersion = "1.6.4";
    }

	public File getWorkingMinecraftFolder() {
		return new File(workingFolder+File.separator+"minecraft");
	}
}
