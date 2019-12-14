package com.cobade.batcham.Service;

import com.cobade.batcham.Dao.PersonneDao;
import com.cobade.batcham.Model.Personne;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.apache.poi.ss.usermodel.CellType.NUMERIC;

@Service
public class LectureFichier {

    @Autowired
    private PersonneDao personneDao;
    XSSFWorkbook fichier;
    XSSFSheet feuille;

    public void getExcel(){
        FileInputStream fils;

        {
            try {
                fils = new FileInputStream(new File("cobade.xlsx"));

                fichier=new XSSFWorkbook(fils);
                int index=0;
                feuille=fichier.getSheetAt(1);
                Row row=feuille.getRow(index++);
                while (row!=null){
                    String test1;
                    String test;
                    String test2;
                    if (row.getCell(1).getCellType()==NUMERIC){
                       test = String.valueOf(row.getCell(1).getNumericCellValue());
                    }else {
                         test= String.valueOf(row.getCell(1).getStringCellValue());
                    }

                    if (row.getCell(3).getCellType()==NUMERIC){
                        test1 = String.valueOf(row.getCell(3).getNumericCellValue());
                    }else {
                        test1= String.valueOf(row.getCell(3).getStringCellValue());
                    }

                    if (row.getCell(2).getCellType()==NUMERIC){
                        test2 = String.valueOf(row.getCell(2).getNumericCellValue());
                    }else {
                        test2= String.valueOf(row.getCell(2).getStringCellValue());
                    }

                    System.out.println("la premiere ligne est "+row.getCell(0).getStringCellValue());
                    System.out.println("la premiere ligne est "+test);
                    System.out.println("la premiere ligne est "+test1);
                    System.out.println("la premiere ligne est "+test2);
                    personneDao.save(new Personne(row.getCell(0).getStringCellValue(),
                         test,test1,test2));
                    //System.out.println(+"\t"+row.getCell(1).getStringCellValue()+"\t"+row.getCell(2).getStringCellValue());
                    System.out.println();
                    row=feuille.getRow(index++);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
