package arist.lab2.datastorage.dataimport;


public class dataChecker {
    public static void CheckDataItem(String line) throws Exception {
        String[] parts = line.split("\\(");
        if(parts.length != 2){
            throw new Exception("ошибка в строке: " + line + " - лишние скобки");
        }
        for(int i=0;i< parts[0].length(); i++){
            if(!(Character.isAlphabetic(parts[0].charAt(i)))){
                throw new Exception("ошибка в строке: " + line + " - не все буквы");
            }
        }
        for(int i=0;i< parts[1].length() - 1; i++){
            if(!Character.isDigit(parts[1].charAt(i)) ){
                throw new Exception("ошибка в строке: " + line + " - не все цифры");
            }
        }
        if(parts[1].charAt(parts[1].length()-1) != ')'){
            throw new Exception("ошибка в строке: " + line + " - последняя не скобка");
        }
    }
}

