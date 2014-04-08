package se.wsu.lmw.Controls;

import se.wsu.lmw.Database.DB;
import se.wsu.lmw.Controls.load_data.LoadAuthor;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author imashi
 */
public class save_AuthorBook {

    // method to insert book author 
    public static void save_AuthorBook(Vector v, String bookID) {
        String auname;
        Iterator ite = v.iterator();
        while (ite.hasNext()) {
            auname = ite.next().toString();
            try {

                DB.myConnection().createStatement().executeUpdate("insert into author_book values ('" + LoadAuthor.selectAllAuthorID(auname) + "','" + bookID + "')");

            } catch (Exception e) {
            }
        }

    }
}
