package cn.hh.dao;

import cn.hh.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository//作为仓库
public interface UserRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
//创建Jpa的数据库操作接口
// 继承JJpaRepository<ojb,obj>, JpaSpecificationExecutor<obj>两个接口
// 以此来使用Jpa框架去操作数据库
}
