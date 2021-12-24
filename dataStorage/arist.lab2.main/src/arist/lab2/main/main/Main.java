package arist.lab2.main.main;

import arist.lab2.datastorage.dataimport.TextFileDataSource;
import arist.lab2.processors.DataStatistics;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Проверяем передан ли параметр командной строки
        if(args.length == 0) {
            System.out.println("Задайте путь к файлу данных как параметр командной строки!");
            System.exit(0);
        }
        //Создаем список строк для храИнения данных из файла

        ArrayList<String> data = new ArrayList<String>(); //Загружаем данные
        TextFileDataSource dataSource = new TextFileDataSource();
        System.out.println("Файл данных: '" + Path.of(args[0]) + "'");
        System.out.println("Чтение исходных данных:");
        dataSource.LoadData(args[0], data);

        
    }
}
