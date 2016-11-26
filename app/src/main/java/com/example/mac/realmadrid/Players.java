package com.example.mac.realmadrid;

/**
 * Created by mac on 15‏/11‏/2016.
 */

public class Players {
    private String playerName;
    private   String playerDetails,ImgUrl;
    private int  playerImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public Players(String playerDetails, String playerName,int playerImage) {
        this.playerDetails = playerDetails;
        this.playerImage = playerImage;
        this.playerName=playerName;
    }

    public Players() {
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerDetails() {
        return playerDetails;
    }

    public void setPlayerDetails(String playerDetails) {
        this.playerDetails = playerDetails;
    }

    public int getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(int playerImage) {
        this.playerImage = playerImage;
    }

}
