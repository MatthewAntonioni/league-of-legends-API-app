public class RiotAccount {

    private String puuid;
    private String gameName;
    private String tagLine;

    //getters
    public String getPuuid(){
        return puuid;
    }
    public String getGameName(){
        return gameName;
    }
    public String getTagLine(){
        return tagLine;
    }

    //setters
    public void setPuuid(String puuid){
        this.puuid = puuid;
    }
    public void setGameName(String gameName){
        this.gameName = gameName;
    }
    public void setTagLine(String tagLine){
        this.tagLine = tagLine;
    }

    @Override
    public String toString() {
        return "RiotAccount{" +
                "puuid='" + puuid + '\'' +
                ", gameName='" + gameName + '\'' +
                ", tagLine='" + tagLine + '\'' +
                '}';
    }
    
}

