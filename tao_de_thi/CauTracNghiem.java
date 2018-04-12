/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tao_de_thi;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dinh son
 */
public class CauTracNghiem {

    private String CauHoi;
    private ArrayList<DapAn> ListDapAn = new ArrayList<DapAn>();

    public String getCauHoi() {
        return CauHoi;
    }

    public ArrayList<DapAn> getListDapAn() {
        randomDapAn();
        return ListDapAn;

    }

    public void setCauHoi(String CauHoi) {
        this.CauHoi = CauHoi;
    }

    public void themDapAn(DapAn DA) {
        ListDapAn.add(DA);
       // ListDapAn.get(ListDapAn.indexOf(DA)).setTenDapAn((char) (65 + ListDapAn.indexOf(DA)));
    }

    public void randomDapAn() {
        int j = 0;
        ArrayList<DapAn> TempList = new ArrayList<DapAn>();
        while (ListDapAn.size() > 0) {
            int index = new Random().nextInt(ListDapAn.size());
            TempList.add(ListDapAn.get(index));
            TempList.get(TempList.size() - 1).setTenDapAn((char) (65 + TempList.size() - 1));
            ListDapAn.remove(index);
        }
        ListDapAn = TempList;
    }
}
