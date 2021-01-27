package contactdirectory;


import contactdirectory.Contact;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class ReadData {
    public ReadData(){
        
    }
    public DefaultListModel<Contact> getSavedList() throws IOException, Throwable{
        File file = new File("contacts.ser");
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(file.lastModified()));
        
        String aKey = fixKey(Integer.toString(calendar.get(Calendar.DAY_OF_YEAR)));
        DESKeySpec dks = new DESKeySpec(aKey.getBytes());
        SecretKeyFactory secKeyFac = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = secKeyFac.generateSecret(dks);
        
        Cipher cipher = Cipher.getInstance("DES");
        
        cipher.init(Cipher.DECRYPT_MODE, desKey);
        CipherInputStream cis = new CipherInputStream(new FileInputStream(file), cipher);
        ObjectInputStream inStream = new ObjectInputStream(cis);
        SealedObject unsealed = (SealedObject) inStream.readObject();
        DefaultListModel<Contact> toReturn = (DefaultListModel<Contact>) unsealed.getObject(cipher);
        return toReturn;
    }
    private String fixKey(String str){
        String key = Integer.toBinaryString(Integer.parseInt(str));
        while(str.length() < 8){
                str = "0"+str;
        }
        return str;
    }
}