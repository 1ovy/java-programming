package test11;

public class TV {
    int channel=1;
    int volumeLevel =1;
    boolean on =false;

    public TV(){}
    public void tuenOn(){
        on=true;
    }
    public void tuenOff(){
        on=false;
    }

    public void setChannel(int channel){
        if (on && channel>=1 && channel<=120){
            this.channel=channel;
        }
    }
    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel>=1 && newVolumeLevel<=7){
            this.volumeLevel=newVolumeLevel;
        }
    }

    public void channelUp(){
        if (on && channel<120){
            channel++;
        }
    }
    public void channelDown(){
        if (on && channel>1){
            channel--;
        }
    }

    public  void volumeUp(){
        if (on && volumeLevel<=7){
            volumeLevel++;
        }
    }

    public  void volumeDown(){

        if (on && volumeLevel>1){
            volumeLevel--;
        }
    }
}
