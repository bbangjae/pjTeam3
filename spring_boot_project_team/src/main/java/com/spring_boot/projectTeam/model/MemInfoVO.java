package com.spring_boot.projectTeam.model;

public class MemInfoVO {
	private String memId;
	private String memNick;
	private int levels;
	private int points;
	private int coin;
	private int declaration;
	private String lastWrite;
	
	
	public String getLastWrite() {
		return lastWrite;
	}
	public void setLastWrite(String lastWrite) {
		this.lastWrite = lastWrite;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemNick() {
		return memNick;
	}
	public void setMemNick(String memNick) {
		this.memNick = memNick;
	}
	public int getLevels() {
		return levels;
	}
	public void setLevels(int levels) {
		this.levels = levels;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	public int getDeclaration() {
		return declaration;
	}
	public void setDeclaration(int declaration) {
		this.declaration = declaration;
	}
	
	
	
}
