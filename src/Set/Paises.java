package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
 
class Paises
{
    public static void main(String[] args)
    {
        Set<String> countries = new LinkedHashSet<>();
        countries.add("USA");
        countries.add("India");
        countries.add("UK");
 
        System.out.println("LinkedHashSet : " + countries);
 
        countries = new TreeSet<>(countries);
        System.out.println("TreeSet : " + countries);
 
        countries = new HashSet<>(countries);
        System.out.println("HashSet : " + countries);
    }
}