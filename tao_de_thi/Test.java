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
public class Test {

    public static void main(String[] args) {
        CauTracNghiem cau1 = new CauTracNghiem();
        CauTracNghiem cau2 = new CauTracNghiem();
        cau1.setCauHoi("Câu hỏi 1:");
        cau1.themDapAn(new DapAn("Đáp án 1", false));
        cau1.themDapAn(new DapAn("Đáp án 2", false));
        cau1.themDapAn(new DapAn("Đáp án 3", true));
        cau1.themDapAn(new DapAn("Đáp án 4", false));
        //
        System.out.println(cau1.getCauHoi());
        for (DapAn DA : cau1.getListDapAn()) {
            System.out.println(DA.getTenDapAn() + "." + DA.getNoiDung());
        }
        /*
        cau2.setCauHoi(cau1.getCauHoi());
        System.out.println(cau2.getCauHoi());
        while(cau1.getListDapAn().size()>0){
            int index=new Random().nextInt(cau1.getListDapAn().size());
            cau2.addDapAn(cau1.getListDapAn().get(index));
            cau1.getListDapAn().remove(index);
        }
        for (DapAn DA : cau2.getListDapAn()) {
          System.out.println(DA.getTenDapAn()+"."+DA.getNoiDung());
        }
        //
        System.out.println("Đáp án đúng là:");
        for (DapAn DA : cau2.getListDapAn()) {
          if(DA.isBoolean())
          System.out.println(DA.getTenDapAn()+"."+DA.getNoiDung());
        }  */
        System.out.println("\n");
        //  cau1.randomDapAn();
        for (DapAn DA : cau1.getListDapAn()) {
            System.out.println(DA.getTenDapAn() + "." + DA.getNoiDung());
        }
        //
        System.out.println("Đáp án đúng là:");
        for (DapAn DA : cau1.getListDapAn()) {
            if (DA.isBoolean()) {
                System.out.println(DA.getTenDapAn() + "." + DA.getNoiDung());
            }
        }
        System.out.println("\n");
        // cau1.randomDapAn();
        for (DapAn DA : cau1.getListDapAn()) {
            System.out.println(DA.getTenDapAn() + "." + DA.getNoiDung());
        }
        //
        System.out.println("Đáp án đúng là:");
        for (DapAn DA : cau1.getListDapAn()) {
            if (DA.isBoolean()) {
                System.out.println(DA.getTenDapAn() + "." + DA.getNoiDung());
            }
        }
        MyProcessFile.saveData(cau1, "data.txt");
        String workingDir = System.getProperty("user.dir");
		System.out.println("Thư mục Project đang làm việc : " + workingDir);
    }
}
