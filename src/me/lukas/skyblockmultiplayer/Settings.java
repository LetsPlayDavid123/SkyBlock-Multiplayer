package me.lukas.skyblockmultiplayer;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.inventory.ItemStack;

public class Settings {

	private ItemStack[] itemsChest; // Content of the chest
	private String language; // Language for the sentences
	private boolean allowContent; // Allow or disable content
	private String worldName; // The world name of the world and the world folder
	private boolean isOnline; // SkyBlock online or offline
	private int islandDistance; // Distance between the player spawn locations
	private boolean isLocked; // Lock SkyBlock to maximize the amount of players
	private String islandSchematic; // schematic file name for island
	private int islandYPosition; // y position of the bedrock
	private String towerSchematic; // schematic file name for tower
	private int towerYPosition; // y position of the bedrock
	private boolean removeCreaturesByTeleport; // remove creatures by teleport to island
	private GameMode gameMode;

	// build
	private boolean build_respawnWithInventory; // If true save contents of player in SkyBlock in Death
	private boolean build_withProtectedArea; // If true, protected Area around of the island and a player can not do anything on another island
	private boolean build_allowEnderpearl; // If true, player can use ender pearl
	private boolean build_withProtectedBorder; // if true the border is protected

	// pvp
	private int pvp_livesPerIsland; // lives points for every island
	private int pvp_islandsPerPlayer; // amount of islands who every player can have

	public void setItemsChest(ItemStack[] items) {
		this.itemsChest = items;
	}

	public ItemStack[] getItemsChest() {
		return this.itemsChest;
	}

	public void setLanguage(String s) {
		this.language = s;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setAllowContent(boolean b) {
		this.allowContent = b;
	}

	public boolean getAllowContent() {
		return this.allowContent;
	}

	public void setWorldName(String s) {
		this.worldName = s;
	}

	public String getWorldName() {
		return this.worldName;
	}

	public void setIsOnline(boolean b) {
		this.isOnline = b;
	}

	public boolean getIsOnline() {
		return this.isOnline;
	}

	public void setIslandDistance(int i) {
		if (i <= 0)
			i = 50;
		this.islandDistance = i;
	}

	public int getIslandDistance() {
		return this.islandDistance;
	}

	public void setIsLocked(boolean b) {
		this.isLocked = b;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIslandSchematic(String s) {
		this.islandSchematic = s;
	}

	public String getIslandSchematic() {
		return this.islandSchematic;
	}

	public void setIslandYPosition(int i) {
		this.islandYPosition = i;
	}

	public int getIslandYPosition() {
		return this.islandYPosition;
	}

	public void setTowerSchematic(String s) {
		this.towerSchematic = s;
	}

	public String getTowerSchematic() {
		return this.towerSchematic;
	}

	public void setTowerYPosition(int i) {
		if (i < 0)
			i = 80;
		this.towerYPosition = i;
	}

	public int getTowerYPosition() {
		return this.towerYPosition;
	}

	public void setRemoveCreaturesByTeleport(boolean b) {
		this.removeCreaturesByTeleport = b;
	}

	public boolean getRemoveCreaturesByTeleport() {
		return this.removeCreaturesByTeleport;
	}

	public void setGameMode(GameMode gm) {
		this.gameMode = gm;
	}

	public GameMode getGameMode() {
		return this.gameMode;
	}

	// build
	public void setRespawnWithInventory(boolean b) {
		this.build_respawnWithInventory = b;
	}

	public boolean getRespawnWithInventory() {
		return this.build_respawnWithInventory;
	}

	public void setWithProtectedArea(boolean b) {
		this.build_withProtectedArea = b;
	}

	public boolean getWithProtectedArea() {
		return this.build_withProtectedArea;
	}

	public void setAllowEnderPearl(boolean b) {
		this.build_allowEnderpearl = b;
	}

	public boolean getAllowEnderPearl() {
		return this.build_allowEnderpearl;
	}

	public void setWithProtectedBorder(boolean b) {
		this.build_withProtectedBorder = b;
	}

	public boolean getWithProtectedBorder() {
		return this.build_withProtectedBorder;
	}

	// pvp
	public void setLivesPerIsland(int i) {
		if (i <= 0)
			i = 1;
		this.pvp_livesPerIsland = i;
	}

	public int getLivesPerIsland() {
		return this.pvp_livesPerIsland;
	}

	public void setIslandsPerPlayer(int i) {
		if (i <= 0)
			i = 1;
		this.pvp_islandsPerPlayer = i;
	}

	public int getIslandsPerPlayer() {
		return this.pvp_islandsPerPlayer;
	}

	public static PlayerInfo getPlayerInfo(String playerName) {
		return players.get(new StringBuilder(playerName));
	}
	
	public static PlayerInfo getPlayerInfo(StringBuilder playerName) {
		return players.get(playerName);
	}
	

	/* Needed for plugin */
	public static Map<StringBuilder, PlayerInfo> players = new HashMap<StringBuilder, PlayerInfo>(); // Key = player name, value PlayerInfo
	public static Map<Integer, IslandInfo> islands = new HashMap<Integer, IslandInfo>();

	public static int numbersPlayers; // Amount of players in SkyBlock
}
