package ru.pkhvostov;

/**
 * Class Calculate решение задачи части 001.урок1.
 * @author Pavel Khvostov(khvostovpavel@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Calculate {
    /**
     * Конструктор,вывод строки в консоль
     * @param args - args.
     */
    public final String echo(String value){
        if (value != null) {
            value = String.format(" %s value = ",  value); }
        else {
            value = "value = null" ;
        }
        return  String.format(" %s %s %s ", value, value, value);
    }






