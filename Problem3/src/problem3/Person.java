package problem3;

/**
 * Person represents all possible people affiliated with the school.
 * Class contains school identification number and other meta data.
 * 
 * @author cgallinaro
 */
public class Person implements Comparable<Person> {
    
    private final String id;  // School identifier
    
    private String name; // Person's name
    
    private int age; // Person's age

    /**
     * Constructor
     * @param id
     */
    public Person(String id) {
        this.id = id;
    }

    /**
     * Constructor
     * @param id
     * @param name
     * @param age
     */
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    /**
     * Get the person's school identifier
     * @return Person's id
     */
    public String getId() {
        return id;
    }

    /**
     * Get the person's name
     * @return Person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the person's name
     * @param name Person's new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the person's age
     * @return Person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the person's age
     * @param age Person's new age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Compares this Person to another, following the Comparable conventions
     * Uses the inbuilt String comparison method to compare the ids of the Person
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * 
     * @param p
     * @return 
     */
    @Override
    public int compareTo(Person p) {
        return this.id.compareTo(p.id);
    }
    
    @Override
    /**
     * Added to maintain contract for compareTo, as most sorters expect that for objects
     * a.compareTo(b) == 0, a.equals(b) == true
     * 
     * @see java.lang.Object#equals(Object)
     * 
     * @returns true if the Object is instanceof Person and if the id matches, else returns false
     */
    public boolean equals(Object o) {
        return o instanceof Person && ((Person)o).id.equals(id);
    }

    @Override
    /**
     * Added to maintain contract for equals
     * @see java.lang.Object#hashCode()
     * 
     * @returns Hashcode of object
     */
    public int hashCode() {
        return id.hashCode();
    }
    
    /**
     * 
     * @param array the array to sort
     */
    public static void sort(Person[] array) {
        for (int i = 0; i < array.length; i++) {
            
            Person current = array[i];
            
            int j = i;
            
            while (j > 0 && (array[j - 1].compareTo(current) > 0)) {
                array[j] = array[j - 1];
                j--;
            }
            
            array[j] = current;
            
        }
    } 
    
    
    
}