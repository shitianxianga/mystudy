import java.util.Arrays;
import java.util.Comparator;

public class TestStream {
   static class  student{
        private  String name;
        private  Integer integer;

        public student(String name, Integer integer) {
            this.name = name;
            this.integer = integer;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getInteger() {
            return integer;
        }

        public void setInteger(Integer integer) {
            this.integer = integer;
        }
    }
    public static void main(String[] args) {

      student[] students={new student("1", 15),
                new student("2",12),new student("3",18)};
        Arrays.stream(students).sorted(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getInteger().compareTo(o2.getInteger());
            }
        }).skip(1)
          .limit(2)
                .map(i-> {
                    if (i.getName().equals("1"))
                         i.setName(i.getName() + "...");
                    return i;
                })
        .forEach(n -> {
            System.out.println(n.getName());
        });
    }
}
