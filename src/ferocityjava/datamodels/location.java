package ferocityjava.datamodels;


public class location {
    
    private int locID;
    private String location;
    
    public void setLocID(int p_locID){
        locID = p_locID;
    }
    
    public void setLocation(String p_location){
        location = p_location;
    }
    
    public int getLocID(){
        return locID;
    }
    
    public String getLocation(){
        return location;
    }
    
    @Override
    public String toString(){
        return "location Info{" + "locID=" + locID + ", location=" + 
                location + '}';
    }
            
    
}



