/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tao_de_thi;

import java.util.ArrayList;

/**
 *
 * @author dinh son
 */
public class CauTracNghiem {

    private String CauHoi;
    private ArrayList<DapAn> ListDapAn = new ArrayList<DapAn>();
    private int i = 0;

    public String getCauHoi() {
        return CauHoi;
    }

    public ArrayList<DapAn> getListDapAn() {
        return ListDapAn;
    }

    public void setCauHoi(String CauHoi) {
        this.CauHoi = CauHoi;
    }

    public void addDapAn(DapAn DA) {
        DA.setTenDapAn((char) (i + 65));
        i++;
        ListDapAn.add(DA);
    }

}
