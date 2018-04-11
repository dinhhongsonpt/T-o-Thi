/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tao_de_thi;

/**
 *
 * @author dinh son
 */
public class DapAn {
    private char TenDapAn;
    private String NoiDung;
    private boolean Boolean;

    public void setTenDapAn(char TenDapAn) {
        this.TenDapAn = TenDapAn;
    }

    public char getTenDapAn() {
        return TenDapAn;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public boolean isBoolean() {
        return Boolean;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public void setBoolean(boolean Boolean) {
        this.Boolean = Boolean;
    }

    public DapAn() {
        this.TenDapAn=' ';
        this.NoiDung="";
        this.Boolean=false;
    }

    public DapAn(String NoiDung, boolean Boolean) {
        this.NoiDung = NoiDung;
        this.Boolean = Boolean;
    }
    
}
