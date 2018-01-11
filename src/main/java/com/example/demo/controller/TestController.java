package com.example.demo.controller;

import com.example.demo.model.LogRecordModel;
import com.example.demo.service.LogRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private LogRecordService logRecordService;

    //讀取
    @RequestMapping("/testRead")
    public @ResponseBody String testRead() {

        //全空值則為所有資料
        String table = "benefitYftAgentPay";
        String action = "S";
        String creater = "M000000015208";

        List<LogRecordModel> list = logRecordService.getData(table,action,creater);

        //取第一筆資料的ValueBefore欄位
        String valueBefore = list.get(0).getValueBefore();

        return valueBefore;
    }

    //新增
    @RequestMapping("/testAdd")
    public @ResponseBody String testAdd() {

        LogRecordModel logRecordModel = new LogRecordModel();
        logRecordModel.setTables("val");
        logRecordModel.setAction("val");
        logRecordModel.setValueBefore("val");
        logRecordModel.setValueAfter("val");
        logRecordModel.setCreater("val");
        logRecordModel.setCreateDate("val");
        Integer id = logRecordService.addData(logRecordModel);

        return "新增資料的ID為："+id;
    }

    //修改
    @RequestMapping("/testEdit")
    public @ResponseBody String testEdit() {

        LogRecordModel logRecordModel = logRecordService.getDataModel(1);
        logRecordModel.setCreater("tttt");
        logRecordModel.setCreateDate("tttt");
        logRecordService.updateData(logRecordModel);

        return "success ：<br/>"+logRecordModel.toString();
    }

    //刪除網址get變數id
    @RequestMapping("/testDel")
    public @ResponseBody String testDel(
            @RequestParam(value = "id") Integer id
    ) {

        logRecordService.delData(id);

        return "Success";
    }

    //Sql讀取
    @RequestMapping("/testReadSql")
    public @ResponseBody String testReadSql() {

        //全空值則為所有資料
        String creater = "M000000015208";
        String createDate = "20171222170439";

        List<LogRecordModel> list = logRecordService.getDataSql(creater,createDate);

        //取第一筆資料的ValueBefore欄位
        String valueBefore = list.get(0).getValueBefore();

        return valueBefore;
    }

}
