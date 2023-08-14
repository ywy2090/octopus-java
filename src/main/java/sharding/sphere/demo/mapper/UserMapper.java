package sharding.sphere.demo.mapper;import java.util.List;import org.apache.ibatis.annotations.Insert;import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;import org.apache.ibatis.annotations.Result;import org.apache.ibatis.annotations.Results;import org.apache.ibatis.annotations.Select;import sharding.sphere.demo.entity.User;@Mapperpublic interface UserMapper {    @Insert(            "INSERT IGNORE INTO t_user(user_name, phone_number, id_number) "                    + "VALUES (#{user.userName}, #{user.phoneNumber}, #{user.idNumber})")    int insertUser(@Param("user") User user);    @Insert("DELETE FROM t_user WHERE ${fieldName} = #{fieldValue}")    int deleteUser(@Param("fieldName") String fieldName, @Param("fieldValue") String fieldValue);    @Select("SELECT * FROM t_user WHERE ${fieldName} = #{fieldValue}")    @Results({        @Result(property = "userName", column = "user_name"),        @Result(property = "phoneNumber", column = "phone_number"),        @Result(property = "idNumber", column = "id_number"),        @Result(property = "id", column = "id")    })    List<User> findUser(            @Param("fieldName") String fieldName, @Param("fieldValue") String fieldValue);    @Select(            "SELECT * FROM t_user WHERE ${fieldName} >= #{startValue} AND ${fieldName} <= #{endValue}")    @Results({        @Result(property = "userName", column = "user_name"),        @Result(property = "phoneNumber", column = "phone_number"),        @Result(property = "idNumber", column = "id_number"),        @Result(property = "id", column = "id")    })    List<User> findUserByRange(            @Param("fieldName") String fieldName,            @Param("startValue") String startValue,            @Param("endValue") String endValue);}