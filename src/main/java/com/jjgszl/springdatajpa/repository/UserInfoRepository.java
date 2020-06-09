//package com.jjgszl.springdatajpa.repository;
//
//
//import com.jjgszl.springdatajpa.entity.Users;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Repository
//public interface UserInfoRepository extends JpaRepository<Users, Integer> {
//    //使用@Query注解查询
//    @Query(value = "from Users where userId =:userid")
//    Users queryUserByNameUseJPQL(Integer userid);
//
//    @Query(value="select * from t_users where username = ? and userage=?",nativeQuery=true)
//    List<Users> queryUserByNameUseSQL(String name,String userAge);
//
//    @Query(value="select * from t_users where username like ?",nativeQuery=true)
//    List<Users> queryUserByLikeNameUseSQL(String name);
//
//    @Query("update Users set userAge = ?1 where userId = ?2")
//    @Transactional
//    @Modifying  //@Modifying当前语句是一个更新语句
//    void updateUserAgeById(Integer age ,Integer id);
//
//
//}
