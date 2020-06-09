//package com.jjgszl.springdatajpa.controller;
//
//import com.jjgszl.springdatajpa.entity.Users;
////import com.jjgszl.springdatajpa.repository.UserInfoRepository;
//import org.omg.CORBA.INTERNAL;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class RestControllerTest {
////
////    @Autowired
////    UserInfoRepository repository;
//
//
//    @GetMapping("/test")
//    public Users queryUserByNameUseJPQL(Integer id){
//        if(id==null||id==0){
//            return null;
//        }
//        return repository.queryUserByNameUseJPQL(id);
//    }
//
//    @GetMapping("/test1")
//    public List<Users> queryUserByNameUseSQL(String userName){
//        if(userName==null||userName==""){
//            return null;
//        }
//        return repository.queryUserByNameUseSQL("wxw","175118");
//    }
//    @GetMapping("/test2")
//    public List<Users> queryUserByLikeNameUseSQL(){
//        return repository.queryUserByLikeNameUseSQL("%wx%");
//    }
//
//    @GetMapping("/test3")
//    public void  updateUserAgeById(){
//         repository.updateUserAgeById(175117,1);
//    }
//}
