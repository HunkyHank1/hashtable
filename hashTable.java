import java.util.ArrayList;

public class hashTable {
private ArrayList<String> data;
    public hashTable(){
        data = new ArrayList();
    }
    public boolean put(String key, String value){
        boolean sucessful = false;
        int index = hashFunction(key);
        while (data.size()<=index) {
            grow();
        }
        if(data.get(index)==""){
            sucessful = true;
            data.add(index, value);
        }
        return sucessful;
    }
    public int hashFunction(String key){
        String hashbrowns = "";
        for(int i = 0;i<key.length();i++){
            int add = (int)key.charAt(i)-'a';
            hashbrowns+=add;
            //hasBrowns+= add;
        }
        return (int)Integer.parseInt(hashbrowns);
    }
    public String get(String key){
        int index = hashFunction(key);
        while (data.size()<=index) {
            grow();
        }
        return data.get(index);
    }
    public void grow(){
        data.add("");
    }
}
