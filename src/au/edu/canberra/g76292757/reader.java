package au.edu.canberra.g76292757;

import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import android.os.Environment;

public class reader{

    File sdcard;
    ArrayList<poi> allPOI;
    public reader() {
        sdcard = Environment.getExternalStorageDirectory();
        allPOI = new ArrayList();
        loadText();
    }

    private void loadText() {
        File pois = new File(sdcard, "pois.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(pois));
            String line;

            while(( line = br.readLine()) != null) {
                String[] items = line.split(",");
                poi p = new poi(items[0], items[1], items[2], items[3], items[4], items[5]);
                allPOI.add(p);
            }
        }
        catch(IOException e) {
        }
    }


    public ArrayList allPOI() {
        return allPOI;
    }

    public ArrayList getType(String type) {
        ArrayList poiType = new ArrayList();

        for(poi p : allPOI) {
            if(p.type == type) {
                poiType.add(p);

            }
        }
        return poiType;
    }
}
