package tech.crawler.database;

import tech.crawler.entity.Coders;

import java.util.Date;
import java.util.List;

public class CRUDExample {
    public static void main(String[] args) {
        System.out.println("This is varri yaswanth");
        System.out.println("Reading rows at"+new Date().getTime());
        //To read 1 row
        Coders coders = new GenericDB<Coders>().getRow(tech.crawler.tables.Coders.CODERS,Coders.class,null);
        //function that read all rows
        readTableCoders();
        //update the table
        new GenericDB<String>().updateColumn(tech.crawler.tables.Coders.CODERS.NAME,"Sadie Varri", tech.crawler.tables.Coders.CODERS, tech.crawler.tables.Coders.CODERS.NAME.eq("spammer"));
        readTableCoders();
    }

    private static void readTableCoders() {
        List<Coders> rows = (List<Coders>) GenericDB.getRows(tech.crawler.tables.Coders.CODERS,Coders.class,null,null);
        for(Coders row:rows){
            System.out.println("Row: "+row.getName()+":"+row.getAge());
        }
    }
}
