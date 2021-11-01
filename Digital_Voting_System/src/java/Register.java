/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MY PC
 */
import Upyogi.DBconnect;
import java.sql.ResultSet;
public class Register {
    String name;
    String adhaar;
    String voter_id;
    String mobile;
    String dob;
    String pass1;
    String pass2;
    String state;
    String district;
    public Register(String name,String adhaar,String voter_id,
            String mobile,String dob,
            String pass1,String pass2,String state,String district)
    {
       this.name=name;
       this.adhaar=adhaar;
       this.voter_id=voter_id;
       this.dob=dob;
       this.mobile=mobile;
       this.pass1=pass1;
       this.pass2=pass2;
       this.state=state;
       this.district=district;
    }
    
    public Register(String voter_id,String pass)
    {
        this.voter_id=voter_id;
        this.pass1=pass;
        
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(String adhaar) {
        this.adhaar = adhaar;
    }

    public String getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(String voter_id) {
        this.voter_id = voter_id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }
    
    //Function Defination
    
    public boolean insertData()throws Exception
    {
        DBconnect db=new DBconnect();
        if(pass1.equals(pass2))
        {
            String sql="insert into voter_reg (name,adhaar_no,"
                    + "voter_id_no,mobile,dob,password,states,district) values('"
                    +name+"','"+adhaar+"','"+voter_id+"','"
                    +mobile+"','"+dob+"','"+pass1+"','"+state+"','"+district+"')";
            db.queryExecuter(sql);
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean validateVoter()throws Exception
    {
        String sql="select * from voter_reg where voter_id_no='"+
                voter_id+"'";
        DBconnect  db=new DBconnect();
        String pass;
        ResultSet rs=db.queryReturner(sql);
        if(rs.next())
        {
            this.name=rs.getString("name");
            this.adhaar=rs.getString("adhaar_no");
            this.district=rs.getString("district");
            this.mobile=rs.getString("mobile");
            this.state=rs.getString("states");
           pass=rs.getString("password");
           if(pass.equals(this.pass1))
            return true;
           else
              return false;
        }
        else
        {
            return false;
        }
    }
}
