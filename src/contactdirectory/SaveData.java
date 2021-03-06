package contactdirectory;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.DefaultListModel;



public class SaveData {
    public SaveData(){
        
    }
    
    public void saveListModel(DefaultListModel<Contact> def) throws IOException, Throwable{
        String fileName = "contacts.ser";
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(System.currentTimeMillis()));
        
        String aKey = fixKey(Integer.toString(calendar.get(Calendar.DAY_OF_YEAR)));
        DESKeySpec dks = new DESKeySpec(aKey.getBytes());
        SecretKeyFactory secKeyFac = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = secKeyFac.generateSecret(dks);
        
        Cipher cipher = Cipher.getInstance("DES");
        
        cipher.init(Cipher.ENCRYPT_MODE, desKey);
        SealedObject sealed = new SealedObject(def, cipher);
        CipherOutputStream cos = new CipherOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)), cipher);
        ObjectOutputStream outStream = new ObjectOutputStream(cos);
        outStream.writeObject(sealed);
        outStream.close();
    }
    private String fixKey(String str){
        String key = Integer.toBinaryString(Integer.parseInt(str));
        while(str.length() < 8){
                str = "0"+str;
        }
        return str;
    }
}
