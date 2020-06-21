import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question2 {

    public String[] getFolderNames(String[] names) {
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < names.length; i++){
            String currentName = names[i];

            if (!set.contains(currentName)){
                list.add(currentName);
                set.add(currentName);
            }
            else {
                int num = 1;
                String tempS = currentName + "(" + num + ")";
                while (set.contains(tempS)){
                    num++;
                    tempS = currentName + "(" + num + ")";
                }
                list.add(tempS);
                set.add(tempS);
            }
        }
        String [] returnArr = list.toArray(new String [list.size()] );
        return returnArr;
    }
}