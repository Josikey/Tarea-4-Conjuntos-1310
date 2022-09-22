

/**
 *
 * @author ilike
 */
public class Main {
    public static void main(String[] args) {
        // Declaracion de conjuntos
        Conjunto<Integer> conjunto_1 = new Conjunto();
        Conjunto<Integer> conjunto_2 = new Conjunto();

        // Add method
        conjunto_1.add(0);
        conjunto_1.add(1);
        conjunto_1.add(2);
        conjunto_1.add(3);
        conjunto_1.add(4);
        conjunto_2.add(3);
        conjunto_2.add(4);
        conjunto_2.add(5);
        conjunto_2.add(6);
        conjunto_2.add(7);

        // Longitud
        System.out.println("c1 length " + conjunto_1.length());
        System.out.println("c2 length " + conjunto_2.length());

        // Contiene elementos
        System.out.println("c1 contains 0 " + conjunto_1.contains(0));
        System.out.println("c1 contains 5 " + conjunto_1.contains(5));

        // Elimina el elemento
        conjunto_1.remove(0);

        // Equals 
        System.out.println("c1 == c2 " + conjunto_1.equals(conjunto_2));

        // esSubConjunto
        System.out.println("c1 subset c2 " + conjunto_1.isSubset(conjunto_2));

        // Interseccion 
        Conjunto<Integer> conjunto_intersection = conjunto_1.intersection(conjunto_2);
        System.out.println("intersection c1 c2 " + conjunto_intersection);

        // Diferencia
        Conjunto<Integer> conjunto_difference = conjunto_1.difference(conjunto_2);
        System.out.println("difference c1 c2 " + conjunto_difference);

        // Union 
        conjunto_1.union(conjunto_2);
        System.out.println("c1 u c2 " + conjunto_1);

        System.out.println("Done!");
    }
}
    

