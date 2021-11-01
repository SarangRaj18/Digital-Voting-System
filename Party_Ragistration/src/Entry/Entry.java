/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entry;

/**
 *
 * @author MY PC
 */
public class Entry {
     static String voter;
     static String name;
     static String district;
     static String state;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getDistrict() {
        return district;
    }

    public  void setDistrict(String district) {
        this.district = district;
    }

    public static String getState() {
        return state;
    }

    public  void setState(String state) {
        this.state = state;
    }
     
  

    public static String getVoter() {
        return voter;
    }

    public void setVoter(String voter) {
        this.voter = voter;
    }
    
}
