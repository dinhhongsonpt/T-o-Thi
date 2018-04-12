package tao_de_thi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

public class MyProcessFile {

    public static void saveData(Object list, String fileName) {
        try {
            File data = new File("data");
            if (!data.isDirectory()) {
                data.mkdir();
            }
            FileOutputStream fOut = new FileOutputStream(data.getPath()+"\\" + fileName);
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);
            oOut.writeObject(list);

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

    public static Object openData(String fileName) {

        try {

            FileInputStream fIn = new FileInputStream(fileName);

            ObjectInputStream oIn = new ObjectInputStream(fIn);

            return oIn.readObject();

        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return null;

    }

}
