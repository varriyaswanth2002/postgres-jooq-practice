package tech.crawler.database;

import tech.crawler.entity.Coders;
import tech.crawler.entity.Coders;

public class TestCodersTable {

    public static void main(String[] args) {

        Coders coder = new Coders("spammer",22L);

        //Insert this object into DB !

//           < ENTITY CLASS>
        new GenericDB<>().addRow(tech.crawler.tables.Coders.CODERS,coder);
    }
}
