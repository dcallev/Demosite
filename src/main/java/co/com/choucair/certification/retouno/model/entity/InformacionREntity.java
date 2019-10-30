package co.com.choucair.certification.retouno.model.entity;

import co.com.choucair.certification.retouno.model.InformacionR;

import java.util.List;

public class InformacionREntity {

    public static InformacionR info = new InformacionR();

    public static InformacionR getInformacionR(){
        return info;
    }

    public static void setInformacionR(List<String> informacionR){
        info.setFirst_name(informacionR.get(0));
        info.setLast_name(informacionR.get(1));
        info.setAddress(informacionR.get(2));
        info.setEmail_address(informacionR.get(3));
        info.setPhone(informacionR.get(4));
        info.setGender(informacionR.get(5));
        info.setHobbies(informacionR.get(6));
        info.setLanguages(informacionR.get(7));
        info.setSkills(informacionR.get(8));
        info.setCountry(informacionR.get(9));
        info.setSelect_country(informacionR.get(10));
        info.setYear(informacionR.get(11));
        info.setMonth(informacionR.get(12));
        info.setDay(informacionR.get(13));
        info.setPassword(informacionR.get(14));
        info.setConfirm_password(informacionR.get(15));
    }
}
