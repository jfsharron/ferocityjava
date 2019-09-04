
package datacontainers;

import ferocityjava.datamodels.location;
import java.util.ArrayList;

public class locationDC {
    
    private ArrayList<location> listOfLocations = new ArrayList<>();
    
    public locationDC(){
    }
    
    public ArrayList<location> getListOfLocations(){
        return listOfLocations;
    }
    
    public void setListOfLocations(ArrayList<location> listOfLocations){
        this.listOfLocations = listOfLocations;
    }
}


