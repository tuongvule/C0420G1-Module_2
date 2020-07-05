package furama_resort.compare;

import furama_resort.models.Customer;

import java.util.Comparator;

public class CompareCustomer implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        int value = o1.getNameCustomer().compareTo(o2.getNameCustomer());
        if(value!=0) {
            return value;
        }else {
            String[] string1 = o1.getBirthday().split("/");
            String[] string2 = o2.getBirthday().split("/");
            String year1 = string1[2];
            String year2 = string2[2];
            value = year1.compareTo(year2);
        }
        return value;

    }
    //        int value=o1.getName().compareTo(o2.getName());
//
//
//        if(value!=0){
//            return value;
//        }
//        String[] str1=o1.getBirthday().split("/");
//        String[] str2=o2.getBirthday().split("/");
//        String yearCustomer1=str1[2];
//        String yearCustomer2=str2[2];
//        value=Integer.parseInt(yearCustomer2)-Integer.parseInt(yearCustomer1);
//        return value;
    }

