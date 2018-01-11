package com.example.demo.repository;

import com.example.demo.model.LogRecordModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LogRecordRepository extends JpaRepository<LogRecordModel,Integer>,JpaSpecificationExecutor<LogRecordModel> {

    //搜尋
    @Query(value = "SELECT lr.* FROM logRecord AS lr WHERE lr.creater LIKE %?1% OR lr.createDate=?2",nativeQuery = true)
    List<LogRecordModel> getLogRecordBySql(String creater,String createDate);

}
