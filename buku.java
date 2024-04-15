/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author USER
 */
public class buku {
    public String jenjang;
    public int hrg, ttl, ub, uk, jml;

    public int getHrg() {
        return hrg;
    }

    public void setHrg(int val) {
        hrg = val;
    }
    
    public String getJenjang(){
        return jenjang;
    }
    
    public void setJenjang(String val){
        jenjang = val;
    }
    
    public void setSeleksiAgama(){
        if(jenjang.equalsIgnoreCase("SD")){
            hrg = 12000;
        }
        else if(jenjang.equalsIgnoreCase("SMP")){
            hrg = 15000;
        }
        else if(jenjang.equalsIgnoreCase("SMA")){
            hrg = 18000;
        }
        else{
            hrg = 0;
        }
    }
    
    public void setSeleksiBahasainggris(){
        if(jenjang.equalsIgnoreCase("SD")){
            hrg = 12000;
        }
        else if(jenjang.equalsIgnoreCase("SMP")){
            hrg = 15000;
        }
        else if(jenjang.equalsIgnoreCase("SMA")){
            hrg = 18000;
        }
        else{
            hrg = 0;
        }
    }
    
    public void setSeleksiBahasaindonesia(){
        if(jenjang.equalsIgnoreCase("SD")){
            hrg = 12000;
        }
        else if(jenjang.equalsIgnoreCase("SMP")){
            hrg = 15000;
        }
        else if(jenjang.equalsIgnoreCase("SMA")){
            hrg = 18000;
        }
        else{
            hrg = 0;
        }
    }

    public void setSeleksiMatematika(){
        if(jenjang.equalsIgnoreCase("SD")){
            hrg = 12000;
        }
        else if(jenjang.equalsIgnoreCase("SMP")){
            hrg = 15000;
        }
        else if(jenjang.equalsIgnoreCase("SMA")){
            hrg = 18000;
        }
        else{
            hrg = 0;
        }
    }
    
    public void setSeleksiIpa(){
        if(jenjang.equalsIgnoreCase("SD")){
            hrg = 12000;
        }
        else if(jenjang.equalsIgnoreCase("SMP")){
            hrg = 15000;
        }
        else if(jenjang.equalsIgnoreCase("SMA")){
            hrg = 18000;
        }
        else{
            hrg = 0;
        }
    }
    
    public void setSeleksiIps(){
        if(jenjang.equalsIgnoreCase("SD")){
            hrg = 12000;
        }
        else if(jenjang.equalsIgnoreCase("SMP")){
            hrg = 15000;
        }
        else if(jenjang.equalsIgnoreCase("SMA")){
            hrg = 18000;
        }
        else{
            hrg = 0;
        }
    }
    
    public void setSeleksiPpkn(){
        if(jenjang.equalsIgnoreCase("SD")){
            hrg = 12000;
        }
        else if(jenjang.equalsIgnoreCase("SMP")){
            hrg = 15000;
        }
        else if(jenjang.equalsIgnoreCase("SMA")){
            hrg = 18000;
        }
        else{
            hrg = 0;
        }
    }
    
    public void setSeleksiPjok(){
        if(jenjang.equalsIgnoreCase("SD")){
            hrg = 12000;
        }
        else if(jenjang.equalsIgnoreCase("SMP")){
            hrg = 15000;
        }
        else if(jenjang.equalsIgnoreCase("SMA")){
            hrg = 18000;
        }
        else{
            hrg = 0;
        }
    }
    
    public int getTtl() {
        ttl = hrg*jml;
        return ttl;
    }

    public int getUb() {
        return ub;
    }

    public void setUb(int val) {
        ub = val;
    }

    public int getUk() {
        uk = ub-ttl;
        return uk;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int val) {
        jml = val;
    }
}
    