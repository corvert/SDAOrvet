package advFeatLiveCoding.task01;

import java.util.*;
import java.util.stream.Stream;

public class PersonDatabase {
    private Map<String, Person> people;

    public PersonDatabase() {
        this.people = new TreeMap<>();
    }

    public void addPerson(Person person) {
        AgeFilter plusEighteen = checkPerson -> {
          if (checkPerson.getAge() < 18 ){
              System.out.println("Below 18");
              return false;
          }
          return true;
        };
        plusEighteen.filter(person);
        people.put(person.getFullName(), person);
    }

    public Person getPerson(String name) {
        return people.get(name);
    }

    public void removePerson(String name) {
        people.remove(name);
    }

   public List<Person> filterByGender (Gender gender){
        List<Person> result = new ArrayList<>();
        for(Person person : people.values()) {
            if(person.getGender().equals(gender)){
                result.add(person);
            }
        }
        return result;
   }

   public double getAverageAge(){
        return people
                .values()
                .stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
   }

   public Person getOldestPerson(){
        return people
                .values()
                .stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
   }


//    public double getAverageAge(){
//        double sum = 0;
//        for (int i = 0; i < people.size(); i++) {
//            sum += people.get(i).getAge();
//        }
//        return sum/people.size();
//    }
//    public int getOldestPerson(){
//
//    }

}
