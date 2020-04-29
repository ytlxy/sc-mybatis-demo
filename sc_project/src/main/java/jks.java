import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface jks {
   List<student> select1();
   List<student> select2(int age);
   List<student> select3(int id);
   boolean deletes(student student);
   boolean update(student student);
   boolean inertial1(student student);
}
